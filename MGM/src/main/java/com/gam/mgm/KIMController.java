package com.gam.mgm;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.context.ServletContextAware;

import com.gam.mgm.dto.AnswerDto;
import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.CommentDto;
import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.YoutubeDto;
import com.gam.mgm.dto.YtCommentDto;
import com.gam.mgm.paging.PageMaker;
import com.gam.mgm.service.IAnswerService;
import com.gam.mgm.service.IBoardService;
import com.gam.mgm.service.IChannelService;
import com.gam.mgm.service.ICommentService;



/**
 * Handles requests for the application home page.
 */
@Controller
public class KIMController implements ServletContextAware{
	
	private static final Logger logger = LoggerFactory.getLogger(KIMController.class);
	private ServletContext context;
	
	@Autowired
	private IBoardService boardService;
	@Autowired
	private IAnswerService answerService;
	@Autowired
	private ICommentService commentService;
	@Autowired
	private IChannelService channelService;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.context = servletContext;
	}

	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		logger.info(" 메인 이동하기{}.", locale);
		
		List<BoardDto> popularList = boardService.getPopList();
		//자유게시판
		List<BoardDto> freeList = boardService.getFreeList();
		//유머게시판
		List<BoardDto> funList = boardService.getFunList();
		//공지게시판
		List<BoardDto> AlertList = boardService.getAlertList();

		 model.addAttribute("popularList", popularList);
		 model.addAttribute("freeList", freeList);
		 model.addAttribute("funList", funList);
		 model.addAttribute("AlertList", AlertList);
		return "Main2";
	}
	
	/* @RequestMapping(value = "/freeboard.do", method = {RequestMethod.POST,RequestMethod.GET})
     public String freeboard(Locale locale, Model model,PagingDto paging) {
        logger.info(" 자유게시판 이동하기{}.", locale);
        List<FreeDto> list = freeService.getAllList(paging);
        System.out.println("페이징list:"+list);
        paging.setTotal(freeService.selectTotalPaging());
        System.out.println("토탈갯수:"+paging.getTotal());
        model.addAttribute("list", list);
        model.addAttribute("p", paging);
        
        return "Free/FreeBoard";
     }*/
	@RequestMapping(value = "/freeboard.do", method = {RequestMethod.POST,RequestMethod.GET})
	public String freeboard(Locale locale, Model model,HttpServletRequest request) {
		logger.info(" 게시판 이동하기{}.", locale);
		PageMaker pagemaker = new PageMaker();
		String pagenum = request.getParameter("pagenum");
		String contentnum = request.getParameter("contentnum");
		String board_name = request.getParameter("board_name");
		int cpagenum = Integer.parseInt(pagenum);
		int ccontentnum = Integer.parseInt(contentnum);
		pagemaker.setTotalcount(boardService.selectTotalPaging(board_name));//전체 게시글 개수를 저장한다
		pagemaker.setPagenum(cpagenum-1);//현재 페이지를 페잊 객체에 지정한다. -1을 해야 쿼리에서 사용할수 있음			
		pagemaker.setContentnum(ccontentnum);//한페이지에 몇개씩 게시글을 보여줄지 지정한다
		pagemaker.setCurrentblock(cpagenum);//현재 페이지 블록이 몇번인지 현대 페이지 번호를 통해서 지정한다.
		pagemaker.setLastblock(pagemaker.getTotalcount());//마지막 블록 번호를 전체 게시글 수를 통해서 전한다
		
		pagemaker.prevnext(cpagenum); //현재 페이지 번호로 화살표를 나타낼지 정한다
		pagemaker.setStartPage(pagemaker.getCurrentblock()); //시작페이지를 페이지 블록 번호로 정한다
		pagemaker.setEndPage(pagemaker.getLastblock(), pagemaker.getCurrentblock()); //마지막 페이지를 마지막 페이지 블록과 현재 페이지 블록 번호로 정한다
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pagenum", pagemaker.getPagenum()*20);
		map.put("contentnum", pagemaker.getContentnum());
		map.put("board_name", board_name);
		List<BoardDto> list = boardService.getAllList(map);
		
		/*int replyCount = boardService.getCount();*/
		model.addAttribute("board_name",board_name);//board name파라미터를 따로 보냄
		model.addAttribute("list", list);
		model.addAttribute("page", pagemaker);
		return "Free/FreeBoard2";
		
	}
	

	
	 @RequestMapping(value = "/insertform.do", method = RequestMethod.GET)
		public String ansinsertform(Locale locale,HttpSession session, Model model,String board_name) {
			logger.info("자유게시판 글쓰기 이동 {}.", locale);
			//로그인 정보 확인 처리
			MemberDto dto = (MemberDto)session.getAttribute("uid");		
			if(dto==null) {
				model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
				model.addAttribute("url","freeboard.do?pagenum=1&contentnum=20&board_name="+board_name);
				return "Redirect";
			}else {
				String board_writer = dto.getMember_id();
				model.addAttribute("board_name",board_name);
				model.addAttribute("board_writer",board_writer);
				System.out.println("board_name111:"+board_name);
				return "Free/Insert";			
			}
		}
	 
		
		@RequestMapping(value = "/file_uploader_html5.do", method = RequestMethod.POST)
		public void file_uploader_html5(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String sFileInfo = "";
			System.out.println("어디랴?");
			//파일명 - 싱글파일업로드와 다르게 멀티파일업로드는 HEADER로 넘어옴 
			String name = request.getHeader("file-name");
			String ext = name.substring(name.lastIndexOf(".")+1);
			//파일 기본경로
			String root = request.getContextPath() + "/resources";
			String defaultPath = context.getRealPath("/resources");
			//파일 기본경로 _ 상세경로
			String path = defaultPath + File.separator + "upload" + File.separator;
			File file = new File(path);
			if(!file.exists()) {
			  file.mkdirs();
			}
			String realname = UUID.randomUUID().toString() + "." + ext;
			InputStream is = request.getInputStream();
			String storedFileName = path + realname;
			OutputStream os=new FileOutputStream(storedFileName);
			int numRead;
			//파일쓰기
			byte b[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
			while((numRead = is.read(b,0,b.length)) != -1){
			  os.write(b,0,numRead);
			}
			if(is != null) {
			  is.close();
			}
			os.flush();
			os.close();

			sFileInfo += "&bNewLine=true&sFileName="+ name+"&sFileURL=" + root + "/upload/"+realname;
			PrintWriter out = response.getWriter();
			out.println(sFileInfo);
		}
		
		@RequestMapping(value="/file_uploader.do", method=RequestMethod.POST)
		public void file_uploader(HttpServletRequest request, HttpServletResponse response) throws IOException, FileUploadException {
			request.setCharacterEncoding("utf-8");
			String return1="";
			String return2="";
			String return3="";
			String name = "";
			if (ServletFileUpload.isMultipartContent(request)){
			    ServletFileUpload uploadHandler = new ServletFileUpload(new DiskFileItemFactory());
			    //UTF-8 인코딩 설정
			    uploadHandler.setHeaderEncoding("UTF-8");
			    List<FileItem> items = uploadHandler.parseRequest(request);
			    //각 필드태그들을 FOR문을 이용하여 비교를 합니다.
			    for (FileItem item : items) {
			        if(item.getFieldName().equals("callback")) {
			            return1 = item.getString("UTF-8");
			        } else if(item.getFieldName().equals("callback_func")) {
			            return2 = "?callback_func="+item.getString("UTF-8");
			        } else if(item.getFieldName().equals("Filedata")) {
			            //FILE 태그가 1개이상일 경우
			            if(item.getSize() > 0) {
			            	name = item.getName();
			                String ext = item.getName().substring(item.getName().lastIndexOf(".")+1);
			                //파일 기본경로
			                String defaultPath = context.getRealPath("/");
			                //파일 기본경로 _ 상세경로
			                String path = defaultPath + "upload" + File.separator;
			                 
			                File file = new File(path);
			                 
			                //디렉토리 존재하지 않을경우 디렉토리 생성
			                if(!file.exists()) {
			                    file.mkdirs();
			                }
			                //서버에 업로드 할 파일명(한글문제로 인해 원본파일은 올리지 않는것이 좋음)
			                String realname = UUID.randomUUID().toString() + "." + ext;
			                ///////////////// 서버에 파일쓰기 ///////////////// 
			                InputStream is = item.getInputStream();
			                OutputStream os=new FileOutputStream(path + realname);
			                int numRead;
			                byte b[] = new byte[(int)item.getSize()];
			                while((numRead = is.read(b,0,b.length)) != -1){
			                    os.write(b,0,numRead);
			                }
			                if(is != null)  is.close();
			                os.flush();
			                os.close();
			                ///////////////// 서버에 파일쓰기 /////////////////
			                String root = request.getContextPath();

			                return3 += "&bNewLine=true&sFileName="+name+"&sFileURL=" + root + "/upload/"+realname;	// by ksseo
			            }else {
			                return3 += "&errstr=error";
			            }
			        }
			    }
			}
			response.sendRedirect(return1+return2+return3);
		}
		
		@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	      public ModelAndView write(HttpServletRequest request,HttpSession session) throws IOException, FileUploadException {
			MemberDto memberDto = (MemberDto)session.getAttribute("uid");
			 String board_name = request.getParameter("board_name");
	         String board_title = request.getParameter("board_title");
	         String smarteditor = request.getParameter("smarteditor");
	         String board_writer = memberDto.getMember_id();
	         System.out.println("board_writer:"+board_writer);
	         System.out.println("board_name:"+board_name);
	         System.out.println("smarteditor:"+smarteditor);
	         System.out.println("board_title:"+board_title);
	         //세션에서 아이디 추출해야함
	         Map<String,Object> map = new HashMap<String,Object>();
	         map.put("board_title", board_title);
	         map.put("board_name", board_name);
	         map.put("board_contents", smarteditor);
	         
	         BoardDto boardDto = new BoardDto();
	         boardDto.setBoard_contents(smarteditor);
	         boardDto.setBoard_title(board_title);
	         boardDto.setBoard_writer(board_writer);
	         boardDto.setBoard_name(board_name);
	         boolean isS = boardService.boardInsert(boardDto);
	         System.out.println("isS:"+isS);
	         if(isS) {
	        	 BoardDto dto = boardService.getUpdateBoard(map);
	            ModelAndView model = new ModelAndView("Free/Writer");
	            model.addObject("dto",dto);
	            return model;
	         }else {
	            ModelAndView model = new ModelAndView("error");
	            model.addObject("msg","입력에 실패했습니다.다시 입력해주세요");
	            return model;
	         }      
	      }
		
		@RequestMapping(value = "/detail.do", method = RequestMethod.GET)
		public String freedetail(Locale locale,HttpSession session, Model model,HttpServletRequest request) {
			logger.info("게시판 상세 보기 {}.", locale);
			String pagenum = request.getParameter("pagenum");
			String contentnum = request.getParameter("contentnum");
			String board_name = request.getParameter("board_name");
			if(request.getParameter("board_seq")!=null) {
				boardService.readCount(Integer.parseInt(request.getParameter("board_seq")));
				BoardDto boardDto = boardService.getBoard(Integer.parseInt(request.getParameter("board_seq")));
				Map<String,Object> replyMap = new HashMap<String,Object>();//댓글 리스트 쿼리
				replyMap.put("comment_group", boardDto.getBoard_group());
				replyMap.put("comment_name", boardDto.getBoard_name());
				List<CommentDto> replylist = commentService.getAllReply(replyMap);
				model.addAttribute("Dto",boardDto);				
				model.addAttribute("uid",session.getAttribute("uid"));
				model.addAttribute("replylist",replylist);
			PageMaker pagemaker = new PageMaker();
			int cpagenum = Integer.parseInt(pagenum);
			int ccontentnum = Integer.parseInt(contentnum);
					
			pagemaker.setTotalcount(boardService.selectTotalPaging(board_name));//전체 게시글 개수를 저장한다
			pagemaker.setPagenum(cpagenum-1);//현재 페이지를 페잊 객체에 지정한다. -1을 해야 쿼리에서 사용할수 있음			
			pagemaker.setContentnum(ccontentnum);//한페이지에 몇개씩 게시글을 보여줄지 지정한다
			pagemaker.setCurrentblock(cpagenum);//현재 페이지 블록이 몇번인지 현대 페이지 번호를 통해서 지정한다.
			pagemaker.setLastblock(pagemaker.getTotalcount());//마지막 블록 번호를 전체 게시글 수를 통해서 전한다
			
			pagemaker.prevnext(cpagenum); //현재 페이지 번호로 화살표를 나타낼지 정한다
			pagemaker.setStartPage(pagemaker.getCurrentblock()); //시작페이지를 페이지 블록 번호로 정한다
			pagemaker.setEndPage(pagemaker.getLastblock(), pagemaker.getCurrentblock()); //마지막 페이지를 마지막 페이지 블록과 현재 페이지 블록 번호로 정한다
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("pagenum", pagemaker.getPagenum()*20);
			map.put("contentnum", pagemaker.getContentnum());
			map.put("board_name", board_name);
			List<BoardDto> list = boardService.getAllList(map);
			model.addAttribute("board_name",board_name);//board name파라미터를 따로 보냄
			model.addAttribute("list", list);
			model.addAttribute("page", pagemaker);
			return "Free/Detail";
			}else {
				return "redirect:freeboard.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name;
			}
		}
		
			@RequestMapping(value = "/commentInsert.do", method = RequestMethod.POST)
		public String commentInsert(Locale locale, Model model,HttpServletRequest request,HttpSession session) {
			logger.info("댓글 추가하기 {}.", locale);
			int pagenum = Integer.parseInt(request.getParameter("pagenum"));
			int board_seq = Integer.parseInt(request.getParameter("board_seq"));
			String comment_contents = request.getParameter("comment_contents");
			String comment_name = request.getParameter("comment_name");
			String comment_group = request.getParameter("comment_group");
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto == null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq);
					return "Redirect";
				}else {		
				String comment_writer = memberDto.getMember_id();
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("comment_group", comment_group);
				map.put("comment_name", comment_name);
				map.put("comment_contents", comment_contents);
				map.put("comment_writer", comment_writer);
				boolean isS = commentService.insertReply(map);
				if(isS) {
					System.out.println("board_seq:"+board_seq);
					return "redirect:detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq;
				}else {
					
					return "redirect:detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq;
				}
				}
		}
			
			@RequestMapping(value = "/ansreply.do", method = RequestMethod.POST)
			public String ansreply(Locale locale, Model model,HttpServletRequest request,HttpSession session,CommentDto dto) {
				logger.info("답글 추가하기 {}.", locale);
				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
				String comment_name = request.getParameter("comment_name");
				int board_seq = Integer.parseInt(request.getParameter("board_seq"));
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto == null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq);
					return "Redirect";
				}else {					
				String comment_writer = memberDto.getMember_id();
				/*String comment_contents = request.getParameter("comment_contents");
				String comment_group = request.getParameter("comment_group");	*/			
				/*Map<String,Object> map = new HashMap<String,Object>();
				map.put("comment_group", comment_group);
				map.put("comment_name", comment_name);
				map.put("comment_contents", comment_contents);
				map.put("comment_writer", comment_writer);*/
				dto.setComment_writer(comment_writer);
				boolean isS =  commentService.insertAnsReply(dto);
				if(isS) {
					System.out.println("board_seq:"+board_seq);
					return "redirect:detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq;
				}else {
					
					return "redirect:detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq;
				}
				}
			}
			
			@RequestMapping(value = "/push.do", method = RequestMethod.POST)
			public String push(Locale locale, Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,int board_seq) throws IOException {
				logger.info("답글 추가하기 {}.", locale);
				int seq = Integer.parseInt(request.getParameter("board_seq"));
				System.out.println("seq:"+seq);
				//중복체크해야함
				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
				String contentnum = request.getParameter("contentnum");
				String board_name = request.getParameter("board_name");
				
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto == null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
					return "Redirect";
				}else {	
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("board_seq", seq);
					map.put("member_id", memberDto.getMember_id());
					int pushCheck = boardService.pushCheck(map);
					System.out.println("memberDto:"+memberDto);
					if(pushCheck > 0) {
						model.addAttribute("msg","이미 추천하셨습니다.");
						model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
						return "Redirect";
					}else {
					
						String board_recommender = memberDto.getMember_id();
						BoardDto boardDto = new BoardDto();
						boardDto.setBoard_recommender(board_recommender);
						boardDto.setBoard_seq(seq);
						boolean isS = boardService.push(boardDto);
						if(isS) {
							model.addAttribute("msg","성공적으로 추천되었습니다.");
							model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
							return "Redirect";
						}else {
							model.addAttribute("msg","추천을 실패했습니다.");
							return "error";
						}
					}

				}							
				}
				
			@RequestMapping(value = "/AnsPush.do", method = RequestMethod.GET)
			public String anspush(Locale locale, Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,int comment_seq) throws IOException {
				logger.info("댓글 추천하기 {}.", locale);
				int seq = Integer.parseInt(request.getParameter("comment_seq"));
				System.out.println("seq:"+seq);
				//중복체크해야함
				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
				String contentnum = request.getParameter("contentnum");
				String board_name = request.getParameter("board_name");
				
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto == null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+comment_seq);
					return "Redirect";
				}else {	
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("comment_seq", seq);
					map.put("member_id", memberDto.getMember_id());
					int pushCheck = commentService.pushCheck(map);
					System.out.println("memberDto:"+memberDto);
					if(pushCheck > 0) {
						model.addAttribute("msg","이미 추천하셨습니다.");
						model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+comment_seq);
						return "Redirect";
					}else {
						String board_recommender = memberDto.getMember_id();
						CommentDto commentDto = new CommentDto();
						commentDto.setComment_recommender(board_recommender);
						commentDto.setComment_seq(seq);
						boolean isS = commentService.push(commentDto);
						if(isS) {
							model.addAttribute("msg","성공적으로 추천되었습니다.");
							model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+comment_seq);
							return "Redirect";
						}else {
							model.addAttribute("msg","추천을 실패했습니다.");
							return "error";
						}
					}
				}

			}
			
			
			@RequestMapping(value = "/delete.do", method = {RequestMethod.GET,RequestMethod.POST})
			public String delete(Locale locale, Model model,HttpSession session,HttpServletRequest request) {
				logger.info("게시글 삭제하기  {}.", locale);
				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
				String contentnum = request.getParameter("contentnum");
				String board_name = request.getParameter("board_name");
				int board_seq = Integer.parseInt(request.getParameter("board_seq"));
				System.out.println(pagenum);
				System.out.println(contentnum);
				System.out.println(board_name);
				System.out.println(board_seq);
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto == null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
					return "Redirect";
				}else {	
					boolean  isS = boardService.delete(board_seq);
					if(isS) {
						model.addAttribute("msg","삭제를 성공했습니다.");
						return "redirect:freeboard.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name;
					}else {
						model.addAttribute("msg","삭제를 실패했습니다.");
						return "error";
					}
				}
			}
			
			@RequestMapping(value = "/ansdel.do", method = {RequestMethod.GET,RequestMethod.POST})
			public String ansdel(Locale locale, Model model,HttpSession session,HttpServletRequest request) {
				logger.info("댓글 삭제하기  {}.", locale);
				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
				String contentnum = request.getParameter("contentnum");
				String board_name = request.getParameter("board_name");
				int board_seq = Integer.parseInt(request.getParameter("board_seq"));
				int comment_seq = Integer.parseInt(request.getParameter("comment_seq"));
				System.out.println(pagenum);
				System.out.println(contentnum);
				System.out.println(board_name);
				System.out.println(comment_seq);
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto == null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
					return "Redirect";
				}else {	
					boolean  isS = commentService.ansdel(comment_seq);
					if(isS) {
						model.addAttribute("msg","삭제를 성공했습니다.");
						return "redirect:freeboard.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"board_seq="+board_seq;
					}else {
						model.addAttribute("msg","삭제를 실패했습니다.");
						return "error";
					}
				}
			}
			
		
			 @RequestMapping(value = "/update.do", method = RequestMethod.GET)
				public String updateform(Locale locale,HttpSession session, Model model,HttpServletRequest request,int board_seq) {
					logger.info("수정 폼 이동 {}.", locale);
					BoardDto boardDto = boardService.getBoard(Integer.parseInt(request.getParameter("board_seq")));
					MemberDto dto = (MemberDto)session.getAttribute("uid");		
					if(dto==null) {
						model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
						model.addAttribute("url","freeboard.do?pagenum=1&contentnum=20&board_name="+boardDto.getBoard_name());
						return "Redirect";
					}else {
						model.addAttribute("boardDto",boardDto);
						System.out.println("boardDto:"+boardDto);
						return "Free/Update";			
					}
				}
			
		@RequestMapping(value = "/answerboard.do", method = RequestMethod.GET)
		public String answerboard(Locale locale, Model model,HttpSession session,HttpServletRequest request) {
			logger.info(" 문의게시판 이동하기{}.", locale);
			PageMaker pagemaker = new PageMaker();
			String pagenum = request.getParameter("pagenum");
			String contentnum = request.getParameter("contentnum");
		
			int cpagenum = Integer.parseInt(pagenum);
			int ccontentnum = Integer.parseInt(contentnum);
			pagemaker.setTotalcount(answerService.selectAnswerPaging());//전체 게시글 개수를 저장한다
			pagemaker.setPagenum(cpagenum-1);//현재 페이지를 페잊 객체에 지정한다. -1을 해야 쿼리에서 사용할수 있음			
			pagemaker.setContentnum(ccontentnum);//한페이지에 몇개씩 게시글을 보여줄지 지정한다
			pagemaker.setCurrentblock(cpagenum);//현재 페이지 블록이 몇번인지 현대 페이지 번호를 통해서 지정한다.
			pagemaker.setLastblock(pagemaker.getTotalcount());//마지막 블록 번호를 전체 게시글 수를 통해서 전한다			
			pagemaker.prevnext(cpagenum); //현재 페이지 번호로 화살표를 나타낼지 정한다
			pagemaker.setStartPage(pagemaker.getCurrentblock()); //시작페이지를 페이지 블록 번호로 정한다
			pagemaker.setEndPage(pagemaker.getLastblock(), pagemaker.getCurrentblock()); //마지막 페이지를 마지막 페이지 블록과 현재 페이지 블록 번호로 정한다
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("pagenum", pagemaker.getPagenum()*20);
			map.put("contentnum", pagemaker.getContentnum());
			System.out.println("pagenum:"+ pagemaker.getPagenum()*20);
			System.out.println("contentnum:"+ pagemaker.getContentnum());
			List<AnswerDto> list = answerService.getAllList(map);
			System.out.println("list:"+list);
	/*		model.addAttribute("board_name",board_name);*///board name파라미터를 따로 보냄
			model.addAttribute("list", list);
			model.addAttribute("page", pagemaker);
			return "Answer/AnswerBoard";
			
		}
		
		@RequestMapping(value = "/ansinsertform.do", method = RequestMethod.GET)
		public String ansinsertform(Locale locale,HttpSession session, Model model) {
			logger.info("문의입력창 이동 {}.", locale);
			MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
			if(memberDto==null) {
				model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
				model.addAttribute("url","answerboard.do?pagenum=1&contentnum=20");
				return "Redirect";
			}else {
				String memberID = memberDto.getMember_id();			
				model.addAttribute("answerboard_writer",memberID);
				return "Answer/AnsInsert";
			}	
		}
		
		@RequestMapping(value = "/ansinsert.do", method = RequestMethod.POST)
		public String ansinsert(Locale locale, Model model,AnswerDto dto,HttpServletRequest request,HttpSession session) {
			logger.info("문의내용 추가하기 {}.", locale);

			boolean isS = answerService.ansinsert(dto);
			if(isS) {
				model.addAttribute("msg","입력되었습니다.빠른시간 답변 드리겠습니다.");
				model.addAttribute("url","answerboard.do?pagenum=1&contentnum=20");
				return "Redirect";
			}else {
				model.addAttribute("msg","입력에 실패했습니다.다시 입력해주세요");
				return "error";
			}
		}
		@RequestMapping(value = "/anssecret.do", method = RequestMethod.GET)
		public String anssecret(Locale locale, Model model,HttpSession session,int answerboard_seq) {
			logger.info("비밀글 상세보기 이동 {}.", locale);
			
			String answerboard_writer=answerService.checkedMember(answerboard_seq);
			MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
			String memberID = memberDto.getMember_id();
			if(answerboard_writer.equals(memberID)){
				return "redirect:ansdetail.do?answerboard_seq="+answerboard_seq;
			}else {
				model.addAttribute("msg","비밀글입니다.본인외에는 열람하실수 없습니다.");
				model.addAttribute("url","ansboard.do?pagenum=1&contentnum=20");
				return "Redirect";
			}
		
		}
			
			@RequestMapping(value = "/ansdetail.do", method = RequestMethod.GET)
			public String ansdetail(Locale locale, Model model,HttpSession session,int answerboard_seq) {
				logger.info("문의글 상세 보기 {}.", locale);
				AnswerDto answerDto = answerService.getAnsboard(answerboard_seq);
				model.addAttribute("answerDto", answerDto);
				model.addAttribute("uid",session.getAttribute("uid"));
				return "Answer/AnsDetail";
		}
			
			@RequestMapping(value = "/ansupdateform.do", method = RequestMethod.GET)
			public String ansupdateform(Locale locale, Model model,HttpSession session,int answerboard_seq) {
				logger.info("수정하기 폼  이동 {}.", locale);
				AnswerDto answerDto = answerService.getAnsboard(answerboard_seq);
				model.addAttribute("answerDto", answerDto);
				model.addAttribute("uid",session.getAttribute("uid"));
				return "Answer/AnsUpdate";
				
			}
		
			@RequestMapping(value = "/ansUpdate.do", method = RequestMethod.POST)
			public String ansupdate(Locale locale, Model model,AnswerDto dto,HttpServletRequest request,HttpSession session) {
				logger.info("문의내용 수정하기 {}.", locale);

				boolean isS = answerService.ansupdate(dto);
				if(isS) {
					model.addAttribute("msg","수정되었습니다.빠른시간 답변 드리겠습니다.");
					model.addAttribute("url","answerboard.do?pagenum=1&contentnum=20");
					return "Redirect";
				}else {
					model.addAttribute("msg","수정에 실패했습니다.다시 입력해주세요");
					return "error";
				}
			}
			@RequestMapping(value = "/ansDelete.do", method = {RequestMethod.GET,RequestMethod.POST})
			public String ansdelete(Locale locale, Model model,HttpSession session,HttpServletRequest request,int answerboard_seq) {
				logger.info("문의글 삭제하기  {}.", locale);
				boolean isS = answerService.ansdelete(answerboard_seq);
				if(isS) {
					model.addAttribute("msg","삭제되었습니다.빠른시간 답변 드리겠습니다.");
					model.addAttribute("url","answerboard.do?pagenum=1&contentnum=20");
					return "Redirect";
				}else {
					model.addAttribute("msg","삭제에 실패했습니다.다시 시도해주세요");
					return "error";
				}
			}
			
			@RequestMapping(value = "/answerboardReply.do", method = RequestMethod.GET)
			public String answerboardReplyform(Locale locale,HttpSession session, Model model,int answerboard_seq) {
				logger.info("문의입력창 이동 {}.", locale);
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto==null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","answerboard.do?pagenum=1&contentnum=20");
					return "Redirect";
				}else {
					String memberID = memberDto.getMember_id();			
					model.addAttribute("answerboard_writer",memberID);
					model.addAttribute("answerboard_seq",answerboard_seq);
					return "Answer/AnsReplyInsert";
				}	
			}
			
			@RequestMapping(value = "/ansReplyInsert.do", method = RequestMethod.POST)
			public String answerboardReply(Locale locale, Model model,HttpServletRequest request,HttpSession session) {
				logger.info("문의답글 추가하기 {}.", locale);
				
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto == null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","answerboard.do?pagenum=1&contentnum=20");
					return "Redirect";
				}else {					
				String answerboard_writer = request.getParameter("answerboard_writer");
				String answerboard_title = request.getParameter("answerboard_title");
				String answerboard_contents = request.getParameter("answerboard_contents");
				String answerboard_secret = request.getParameter("answerboard_secret");				
				int seq = Integer.parseInt(request.getParameter("seq"));				
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("answerboard_writer", answerboard_writer);
				map.put("answerboard_title", answerboard_title);
				map.put("answerboard_contents", answerboard_contents);
				map.put("answerboard_secret", answerboard_secret);
				map.put("seq", seq);			
				boolean isS =  answerService.ansinsertReply(map);
				if(isS) {
					return "redirect:answerboard.do?pagenum=1&contentnum=20";
				}else {
					
					return "redirect:answerboard.do?pagenum=1&contentnum=20";
				}
				}
			}
			
			@RequestMapping(value = "/GameLand.do", method = RequestMethod.GET)
			public String GameLand(Locale locale, Model model) {
				logger.info(" 게임랜드 이동하기{}.", locale);
				return "Game_Land/GameLand";
			}
			@RequestMapping(value = "/MasterChess.do", method = RequestMethod.GET)
			public String MasterChess(Locale locale, Model model) {
				logger.info("체스 이동하기{}.", locale);
				return "Game_Land/MasterChess";
			}
			@RequestMapping(value = "/MasterCheckers.do", method = RequestMethod.GET)
			public String MasterCheckers(Locale locale, Model model) {
				logger.info("체커스 이동하기{}.", locale);
				return "Game_Land/MasterCheckers";
			}
			@RequestMapping(value = "/Reversi.do", method = RequestMethod.GET)
			public String Reversi(Locale locale, Model model) {
				logger.info("리버스 이동하기{}.", locale);
				return "Game_Land/Reversi";
			}
			@RequestMapping(value = "/BlackJack.do", method = RequestMethod.GET)
			public String BlackJack(Locale locale, Model model) {
				logger.info("블랙잭 이동하기{}.", locale);
				return "Game_Land/BlackJack";
			}
			@RequestMapping(value = "/Tetris.do", method = RequestMethod.GET)
			public String Tetris(Locale locale, Model model) {
				logger.info("테트리스 이동하기{}.", locale);
				return "Game_Land/Tetris";
			}
			@RequestMapping(value = "/CaveBalls.do", method = RequestMethod.GET)
			public String CaveBalls(Locale locale, Model model) {
				logger.info("케이브 이동하기{}.", locale);
				return "Game_Land/CaveBalls";
			}
			
			@RequestMapping(value = "/ytList.do", method = RequestMethod.GET)
			public String ytList(Locale locale,HttpServletRequest request,HttpSession session, Model model) {
				logger.info("경마채널 이동하기{}.", locale);
				
				PageMaker pagemaker = new PageMaker();
				String pagenum = request.getParameter("pagenum");
				String contentnum = request.getParameter("contentnum");
				int cpagenum = Integer.parseInt(pagenum);
				int ccontentnum = Integer.parseInt(contentnum);
				pagemaker.setTotalcount(channelService.selectTotalPaging());//전체 게시글 개수를 저장한다
				pagemaker.setPagenum(cpagenum-1);//현재 페이지를 페잊 객체에 지정한다. -1을 해야 쿼리에서 사용할수 있음			
				pagemaker.setContentnum(ccontentnum);//한페이지에 몇개씩 게시글을 보여줄지 지정한다
				pagemaker.setCurrentblock(cpagenum);//현재 페이지 블록이 몇번인지 현대 페이지 번호를 통해서 지정한다.
				pagemaker.setLastblock(pagemaker.getTotalcount());//마지막 블록 번호를 전체 게시글 수를 통해서 전한다
				
				pagemaker.prevnext(cpagenum); //현재 페이지 번호로 화살표를 나타낼지 정한다
				pagemaker.setStartPage(pagemaker.getCurrentblock()); //시작페이지를 페이지 블록 번호로 정한다
				pagemaker.setEndPage(pagemaker.getLastblock(), pagemaker.getCurrentblock()); //마지막 페이지를 마지막 페이지 블록과 현재 페이지 블록 번호로 정한다
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("pagenum", pagemaker.getPagenum()*10);
				map.put("contentnum", pagemaker.getContentnum());			
				List<YoutubeDto> list = channelService.getAllList(map);
				model.addAttribute("list", list);
				model.addAttribute("page", pagemaker);
				model.addAttribute("uid",session.getAttribute("uid"));
				return "ChannelBoard/YtList";
			}
			
			@RequestMapping(value = "/youtubeInsert.do", method = RequestMethod.GET)
			public String youtubeInsert(Locale locale, Model model) {
				logger.info("유투브 업로드 이동하기{}.", locale);
				return "ChannelBoard/YtUpload";
			}
			@RequestMapping(value = "/ytUpload.do", method = RequestMethod.POST)
			public String ytUpload(Locale locale,HttpServletRequest request, Model model) {
				logger.info("유투브 업로드{}.", locale);
				
				String ytTitle = request.getParameter("ytTitle");
				String ytID = request.getParameter("ytID");
				String ytAddress = ytID.substring(17);
				System.out.println("ytAddress:"+ytAddress);
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("ytAddress", ytAddress);
				map.put("ytTitle", ytTitle);
				boolean isS = channelService.ytInsert(map);
				if(isS) {
				model.addAttribute("msg","업로드 되었습니다.");
				model.addAttribute("url","ytList.do?pagenum=1&contentnum=10");
				return "Redirect";
				}else {
					model.addAttribute("msg","업로드에 실패했습니다.다시 시도해주세요");
					return "error";
				}
			}
			
			@RequestMapping(value = "/ytDetail.do", method = RequestMethod.GET)
			public String ytDetail(Locale locale,HttpServletRequest request,HttpSession session, Model model) {
				logger.info("유투브 상세보기 {}.", locale);
				int ytNum = Integer.parseInt(request.getParameter("ytNum"));
				/*String ytTitle = request.getParameter("ytTitle");*/
				PageMaker pagemaker = new PageMaker();
				String pagenum = request.getParameter("pagenum");
				String contentnum = request.getParameter("contentnum");
				int cpagenum = Integer.parseInt(pagenum);
				int ccontentnum = Integer.parseInt(contentnum);
				pagemaker.setTotalcount(channelService.selectTotalPaging());//전체 게시글 개수를 저장한다
				pagemaker.setPagenum(cpagenum-1);//현재 페이지를 페잊 객체에 지정한다. -1을 해야 쿼리에서 사용할수 있음			
				pagemaker.setContentnum(ccontentnum);//한페이지에 몇개씩 게시글을 보여줄지 지정한다
				pagemaker.setCurrentblock(cpagenum);//현재 페이지 블록이 몇번인지 현대 페이지 번호를 통해서 지정한다.
				pagemaker.setLastblock(pagemaker.getTotalcount());//마지막 블록 번호를 전체 게시글 수를 통해서 전한다
				
				pagemaker.prevnext(cpagenum); //현재 페이지 번호로 화살표를 나타낼지 정한다
				pagemaker.setStartPage(pagemaker.getCurrentblock()); //시작페이지를 페이지 블록 번호로 정한다
				pagemaker.setEndPage(pagemaker.getLastblock(), pagemaker.getCurrentblock()); //마지막 페이지를 마지막 페이지 블록과 현재 페이지 블록 번호로 정한다
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("pagenum", pagemaker.getPagenum()*10);
				map.put("contentnum", pagemaker.getContentnum());			
				List<YoutubeDto> list = channelService.getAllList(map);
				model.addAttribute("list", list);
				model.addAttribute("page", pagemaker);
				
				List<YtCommentDto> repList = channelService.replyList(ytNum);
				YoutubeDto ytDto = channelService.getYoutube(ytNum);
				model.addAttribute("ytDto", ytDto);
				model.addAttribute("repList", repList);
				model.addAttribute("uid",session.getAttribute("uid"));
				return "ChannelBoard/YtDetail";
			}
			@RequestMapping(value = "/ytcommentInsert.do", method = RequestMethod.POST)
			public String ytcommentInsert(Locale locale,HttpServletRequest request,HttpSession session, Model model) {
				logger.info("유투브 댓글입력 {}.", locale);
				
				String pagenum = request.getParameter("pagenum");
				String contentnum = request.getParameter("contentnum");
				String ytContents = request.getParameter("ytContents");				
				int ytNum = Integer.parseInt(request.getParameter("ytNum"));
				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
				if(memberDto == null) {
					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
					model.addAttribute("url","ytDetail.do?pagenum="+pagenum+"&contentnum="+contentnum+"&ytNum="+ytNum);
					return "Redirect";
				}else {
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("ytContents", ytContents);
					map.put("ytNum", ytNum);
					map.put("ytWriter", memberDto.getMember_id());
					boolean isS = channelService.ytCommentInsert(map);
					if(isS) {
						model.addAttribute("msg","성공적으로 입력되었습니다.");
						model.addAttribute("url","ytDetail.do?pagenum="+pagenum+"&contentnum="+contentnum+"&ytNum="+ytNum);
						return "Redirect";
						}else {
							model.addAttribute("msg","입력이 되지않았습니다.다시 시도해주세요");
							return "error";
					}
				}
				
			}
			
			@RequestMapping(value = "/newsList.do", method = RequestMethod.GET)
			public String newsList(Locale locale, Model model) {
				logger.info("뉴스 리스트 이동하기{}.", locale);
				return "News/NewsList";
			}
			
			@RequestMapping(value = "/faq.do", method = RequestMethod.GET)
			public String faq(Locale locale, Model model) {
				logger.info("FAQ 이동하기{}.", locale);
				return "Faq";
			}
			
			/*
			
			
			
			@RequestMapping(value = "/trainer.do", method = {RequestMethod.GET,RequestMethod.POST})
			public void trainer(Locale locale, Model model,String yyyyMMdd) {
				logger.info("조교사 DB저장하기  {}.", locale);
				String defaultPath = context.getRealPath("/resources"); //홍민씨 제목부분을 제외한 데이터값만 긁어서 메모장으로 복사 후 저장해서 여기나 혹은 원하는곳에 넣으면 됩니다.혹시몰라 resources 에 넣어놨어요
				System.out.println(defaultPath);
				File file = new File(defaultPath+"/trainers.txt");
				
				String[] splitedStr = null;
				InputStream in = null;
				try {
				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/trainer/20190725sdb3.txt");
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
					in = url.openStream();
					BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
					System.out.println(reader);
						String line = null;
						splitedStr = null;					
							while ((line = reader.readLine()) != null) {
								if(line.contains("-")) {
									System.out.println("나오지마라");
								}else if(line.contains("조교사명")){
									System.out.println("너도");
								}else {
								splitedStr = null;
								splitedStr = line.split("\\s+");

								for (int i = 0; i < splitedStr.length; i++) {
									splitedStr[i] = splitedStr[i].trim();

								}
							
								TrainerDto trainerDto = new TrainerDto();
								trainerDto.setTr_name(splitedStr[0]);
								System.out.println(splitedStr[0]);
								trainerDto.setTr_part(Integer.valueOf(splitedStr[1]));
								trainerDto.setTr_birth(splitedStr[2]);
								trainerDto.setTr_age(Integer.valueOf(splitedStr[3]));
								trainerDto.setTr_stdate(splitedStr[4]);
								trainerDto.setTr_rccntt(Integer.valueOf(splitedStr[5]));
								trainerDto.setTr_ord1cntt(Integer.valueOf(splitedStr[6]));
								trainerDto.setTr_ord2cntt(Integer.valueOf(splitedStr[7]));
								trainerDto.setTr_ord3cntt(Integer.valueOf(splitedStr[8]));
								trainerDto.setTr_rccnty(Integer.valueOf(splitedStr[9]));
								trainerDto.setTr_ord1cnty(Integer.valueOf(splitedStr[10]));
								trainerDto.setTr_ord2cnty(Integer.valueOf(splitedStr[11]));
								trainerDto.setTr_ord3cnty(Integer.valueOf(splitedStr[12]));
								trainerDto.setTr_meet(1);
								boolean isS = trainerService.trInsert(trainerDto);
								if(isS) {
									System.out.println("입력되었습니다.");
								}else {
									System.out.println("입력실패.");
								}
								}
							}
							reader.close();

						} catch (FileNotFoundException fnf) {
							fnf.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					
			}*/
			
			
}
