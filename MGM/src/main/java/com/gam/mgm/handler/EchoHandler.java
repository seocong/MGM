package com.gam.mgm.handler;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.gam.mgm.dto.ChatDto;
import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.service.IChatService;

@Repository
public class EchoHandler extends TextWebSocketHandler{
	@Autowired
	private IChatService chatService;
	private Logger logger = LoggerFactory.getLogger(EchoHandler.class);
	/*
	 *서버에 연결한 사용자들을 저장하는 리스트 
	 */

	//	private List<WebSocketSession> connectedUsers;
	List<WebSocketSession> sessions = new ArrayList<WebSocketSession>();
	Map<String,WebSocketSession> userSessions = new HashMap<String, WebSocketSession>();
	/*
	 * 접속과 관련된 Ebent Method
	 *  @param WebSocketSession
	 *  	접속한 사용자
	 */
	@Override //커넥션이 연결되었을때 클라이언트가 서버에 접속이 됐을 때 실행
	public void afterConnectionEstablished(WebSocketSession session) throws Exception{
		System.out.println("afterConnectionEstablished: "+session);
		sessions.add(session);
		String senderId=getId(session);
		System.out.println("연결 로그인 회원: "+senderId);
		userSessions.put(senderId, session);		
	}
	/**
	 * 두 가지 이벤트를 처리
	 * 1. send: 클리이언트가 서버에게 메시지를 보냄
	 * 2. Emit: 서버에 연결되어 있는 클라이언트에게 메시지를 보냄
	 * @param WebSocketSession 메시지를 보낸 클라이언트
	 * @param TextMessage 메시지의 내용
	 */
	@Override //소켓에 메시지를 보냈을때 실행
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{
		System.out.println("handleTextMessage: "+session+":"+message);
		//전체 공지는 브로드캐스팅이라고함
		//모든 웹소켓, 소켓은 아이디를 하나 가지게 된다.
		String senderId=getId(session); //session의 아이디를 가져옴
		System.out.println("loginUser: "+senderId);
		
		//전체 메세지 코드
		/*
		 * for(WebSocketSession sess:sessions) { sess.sendMessage(new
		 * TextMessage("<div class='"+senderId+"'>"+senderId+": <br>"+message.getPayload
		 * ()+"</div>")); }
		 */
		ChatDto dto = new ChatDto();
		dto.setChat_id(senderId);
		dto.setChat_content(message.getPayload());
		chatService.insertlog(dto);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm");
		String nowTime = fmt.format(cal.getTime());
		if(senderId!=null && !message.getPayload().equals("")) {
			for(String id:userSessions.keySet()) {
				userSessions.get(id).sendMessage(new TextMessage(senderId+"_"+message.getPayload()+"_"+nowTime));
			}
		}
		//protocol: cmd(command), 댓글작성자, 게시글 작성자, bno(게시글 번호) 
	}
	
	//httpSession에 담긴 유저를 webSocketSession에 담아주는 메소드
	private String getId(WebSocketSession session) {
		Map<String, Object> httpSession = session.getAttributes();
		MemberDto loginUser = (MemberDto)httpSession.get("uid");
		if(null == loginUser) {
			return null;
		}else {
			return loginUser.getMember_id();
		}
	}
	/*
	 * 클라이언트가 서버와 연결을 끊었을때 실행되는 메소드
	 * @param WebSocketSession
	 * 	연결을 끊은 클라이언트
	 * @param CloseStatus
	 * 	연결상태(확인 필요함)
	 */
	@Override //커넥션이 종료되었을때 실행
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception{
		System.out.println("afterConnectionClosed: "+session+":"+status);
				sessions.remove(session);
				for(String key:userSessions.keySet()) {
					if(userSessions.get(key) == session) {
						userSessions.remove(key);
						System.out.println(session + ": map session 삭제");
					}
				}
				
		//		for(WebSocketSession webSocketSession : connectedUsers) {
		//			if(!session.getId().equals(webSocketSession.getId())) {
		//				webSocketSession.sendMessage(new TextMessage(session.getRemoteAddress().getHostName()+"님이 퇴장했습니다."));
		//			}
		//		}
				logger.info(session.getId()+"님이 퇴장했습니다.");
	}
	
	 @Override
     public void handleTransportError(WebSocketSession session,
                  Throwable exception) throws Exception {
           this.logger.error("web socket error!", exception);

     }
}
