//package com.gam.mgm;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Locale;
//import java.util.Map;
//
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.apache.commons.fileupload.FileUploadException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.context.ServletContextAware;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.gam.mgm.dto.BoardDto;
//import com.gam.mgm.dto.CommentDto;
//import com.gam.mgm.dto.MemberDto;
//import com.gam.mgm.dto.ProProfileDto;
//import com.gam.mgm.paging.PageMaker;
//import com.gam.mgm.service.IBoardService;
//import com.gam.mgm.service.ICommentService;
//import com.gam.mgm.service.IMemberService;
//import com.gam.mgm.service.IProProfileService;
//
//
//
///**
// * Handles requests for the application home page.
// */
//@Controller
//public class testController implements ServletContextAware{
//	
//	private static final Logger logger = LoggerFactory.getLogger(testController.class);
//	private ServletContext context;
//	
//	@Autowired
//	private IBoardService boardService;
//	@Autowired
//	private ICommentService commentService;
//	@Autowired
//	private IMemberService memberService;
//	@Autowired
//	private IProProfileService profileService;
//	@Override
//	public void setServletContext(ServletContext servletContext) {
//		this.context = servletContext;
//	}
//
//	@RequestMapping(value = "/proboard.do", method = {RequestMethod.POST,RequestMethod.GET})
//	public String proboard(Locale locale, Model model,HttpServletRequest request) {
//		logger.info(" 게시판 이동하기{}.", locale);
//		PageMaker pagemaker = new PageMaker();
//		String pagenum = request.getParameter("pagenum");
//		String contentnum = request.getParameter("contentnum");
//		String board_name = "pro";
//		int cpagenum = Integer.parseInt(pagenum);
//		int ccontentnum = Integer.parseInt(contentnum);
//		pagemaker.setTotalcount(boardService.selectTotalPaging(board_name));//전체 게시글 개수를 저장한다
//		pagemaker.setPagenum(cpagenum-1);//현재 페이지를 페잊 객체에 지정한다. -1을 해야 쿼리에서 사용할수 있음			
//		pagemaker.setContentnum(ccontentnum);//한페이지에 몇개씩 게시글을 보여줄지 지정한다
//		pagemaker.setCurrentblock(cpagenum);//현재 페이지 블록이 몇번인지 현대 페이지 번호를 통해서 지정한다.
//		pagemaker.setLastblock(pagemaker.getTotalcount());//마지막 블록 번호를 전체 게시글 수를 통해서 전한다
//		
//		pagemaker.prevnext(cpagenum); //현재 페이지 번호로 화살표를 나타낼지 정한다
//		pagemaker.setStartPage(pagemaker.getCurrentblock()); //시작페이지를 페이지 블록 번호로 정한다
//		pagemaker.setEndPage(pagemaker.getLastblock(), pagemaker.getCurrentblock()); //마지막 페이지를 마지막 페이지 블록과 현재 페이지 블록 번호로 정한다
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("pagenum", pagemaker.getPagenum()*20);
//		map.put("contentnum", pagemaker.getContentnum());
//		map.put("board_name", board_name);
//		List<BoardDto> list = boardService.getAllList(map);
//		
//		/*int replyCount = boardService.getCount();*/
//		model.addAttribute("board_name",board_name);//board name파라미터를 따로 보냄
//		model.addAttribute("list", list);
//		model.addAttribute("page", pagemaker);
//		return "professional/proBoard";
//	}
//	@RequestMapping(value = "/proProfile.do", method = {RequestMethod.POST,RequestMethod.GET})
//	public String proProfile(Locale locale, Model model,HttpServletRequest request) {
//		logger.info(" 프로 프로필 이동하기{}.", locale);
//		List<ProProfileDto> profileList = profileService.proSimple(); 
//		model.addAttribute("board_name","proProfile");
//		model.addAttribute("profileList",profileList);
//		return "professional/proBoard";
//	}
//	 @RequestMapping(value = "/proinsertform.do", method = RequestMethod.GET)
//		public String ansinsertform(Locale locale,HttpSession session, Model model,String board_name) {
//			logger.info("자유게시판 글쓰기 이동 {}.", locale);
//			//로그인 정보 확인 처리
//			MemberDto dto = (MemberDto)session.getAttribute("uid");
//			if(dto==null) {
//				model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
//				model.addAttribute("url","proboard.do?pagenum=1&contentnum=20&board_name=pro");
//				return "Redirect";
//			}else {
//				if(dto.getMember_gubun().equals("pro")) {
//					String board_writer = dto.getMember_id();
//					model.addAttribute("board_name",board_name);
//					model.addAttribute("board_writer",board_writer);
//					System.out.println("board_name111:"+board_name);
//					return "professional/Insert";
//				}else {
//					model.addAttribute("msg","전문가만 글을 작성할 수 있습니다.");
//					model.addAttribute("url","proboard.do?pagenum=1&contentnum=20&board_name="+board_name);
//					return "Redirect";
//				}
//			}
//		}
//		
//		@RequestMapping(value = "/prowrite.do", method = RequestMethod.POST)
//	      public ModelAndView write(HttpServletRequest request,HttpSession session) throws IOException, FileUploadException {
//			MemberDto memberDto = (MemberDto)session.getAttribute("uid");
//			 String board_name = request.getParameter("board_name");
//	         String board_title = request.getParameter("board_title");
//	         String smarteditor = request.getParameter("smarteditor");
//	         String board_writer = memberDto.getMember_id();
//	         System.out.println("board_writer:"+board_writer);
//	         System.out.println("board_name:"+board_name);
//	         System.out.println("smarteditor:"+smarteditor);
//	         System.out.println("board_title:"+board_title);
//	         //세션에서 아이디 추출해야함
//	         Map<String,Object> map = new HashMap<String,Object>();
//	         map.put("board_title", board_title);
//	         map.put("board_name", board_name);
//	         map.put("board_contents", smarteditor);
//	         
//	         BoardDto boardDto = new BoardDto();
//	         boardDto.setBoard_contents(smarteditor);
//	         boardDto.setBoard_title(board_title);
//	         boardDto.setBoard_writer(board_writer);
//	         boardDto.setBoard_name(board_name);
//	         boolean isS = boardService.boardInsert(boardDto);
//	         System.out.println("isS:"+isS);
//	         if(isS) {
//	        	 BoardDto dto = boardService.getUpdateBoard(map);
//	            ModelAndView model = new ModelAndView("professional/Writer");
//	            model.addObject("dto",dto);
//	            return model;
//	         }else {
//	            ModelAndView model = new ModelAndView("error");
//	            model.addObject("msg","입력에 실패했습니다.다시 입력해주세요");
//	            return model;
//	         }      
//	      }
//		
//		@RequestMapping(value = "/prodetail.do", method = RequestMethod.GET)
//		public String freedetail(Locale locale,HttpSession session, Model model,HttpServletRequest request) {
//			logger.info("프로게시판 상세 보기 {}.", locale);
//			String pagenum = request.getParameter("pagenum");
//			String contentnum = request.getParameter("contentnum");
//			String board_name = "pro";
//			if(request.getParameter("board_seq")!=null) {
//				boardService.readCount(Integer.parseInt(request.getParameter("board_seq")));
//				BoardDto boardDto = boardService.getBoard(Integer.parseInt(request.getParameter("board_seq")));
//				Map<String,Object> replyMap = new HashMap<String,Object>();//댓글 리스트 쿼리
//				replyMap.put("comment_group", boardDto.getBoard_group());
//				replyMap.put("comment_name", boardDto.getBoard_name());
//				List<CommentDto> replylist = commentService.getAllReply(replyMap);
//				model.addAttribute("Dto",boardDto);				
//				model.addAttribute("uid",session.getAttribute("uid"));
//				model.addAttribute("replylist",replylist);
//			PageMaker pagemaker = new PageMaker();
//			int cpagenum = Integer.parseInt(pagenum);
//			int ccontentnum = Integer.parseInt(contentnum);
//					
//			pagemaker.setTotalcount(boardService.selectTotalPaging(board_name));//전체 게시글 개수를 저장한다
//			pagemaker.setPagenum(cpagenum-1);//현재 페이지를 페잊 객체에 지정한다. -1을 해야 쿼리에서 사용할수 있음			
//			pagemaker.setContentnum(ccontentnum);//한페이지에 몇개씩 게시글을 보여줄지 지정한다
//			pagemaker.setCurrentblock(cpagenum);//현재 페이지 블록이 몇번인지 현대 페이지 번호를 통해서 지정한다.
//			pagemaker.setLastblock(pagemaker.getTotalcount());//마지막 블록 번호를 전체 게시글 수를 통해서 전한다
//			
//			pagemaker.prevnext(cpagenum); //현재 페이지 번호로 화살표를 나타낼지 정한다
//			pagemaker.setStartPage(pagemaker.getCurrentblock()); //시작페이지를 페이지 블록 번호로 정한다
//			pagemaker.setEndPage(pagemaker.getLastblock(), pagemaker.getCurrentblock()); //마지막 페이지를 마지막 페이지 블록과 현재 페이지 블록 번호로 정한다
//			Map<String,Object> map = new HashMap<String,Object>();
//			map.put("pagenum", pagemaker.getPagenum()*20);
//			map.put("contentnum", pagemaker.getContentnum());
//			map.put("board_name", board_name);
//			List<BoardDto> list = boardService.getAllList(map);
//			model.addAttribute("board_name",board_name);//board name파라미터를 따로 보냄
//			model.addAttribute("list", list);
//			model.addAttribute("page", pagemaker);
//			return "professional/Detail";
//			}else {
//				return "redirect:proboard.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name;
//			}
//		}
//		
//			@RequestMapping(value = "/procommentInsert.do", method = RequestMethod.POST)
//		public String commentInsert(Locale locale, Model model,HttpServletRequest request,HttpSession session) {
//			logger.info("댓글 추가하기 {}.", locale);
//			int pagenum = Integer.parseInt(request.getParameter("pagenum"));
//			int board_seq = Integer.parseInt(request.getParameter("board_seq"));
//			String comment_contents = request.getParameter("comment_contents");
//			String comment_name = "pro";
//			String comment_group = request.getParameter("comment_group");
//				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
//				if(memberDto == null) {
//					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
//					model.addAttribute("url","prodetail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq);
//					return "Redirect";
//				}else {		
//				String comment_writer = memberDto.getMember_id();
//				Map<String,Object> map = new HashMap<String,Object>();
//				map.put("comment_group", comment_group);
//				map.put("comment_name", comment_name);
//				map.put("comment_contents", comment_contents);
//				map.put("comment_writer", comment_writer);
//				boolean isS = commentService.insertReply(map);
//				if(isS) {
//					System.out.println("board_seq:"+board_seq);
//					return "redirect:prodetail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq;
//				}else {
//					
//					return "redirect:prodetail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq;
//				}
//				}
//		}
//			
//			@RequestMapping(value = "/proansreply.do", method = RequestMethod.POST)
//			public String ansreply(Locale locale, Model model,HttpServletRequest request,HttpSession session,CommentDto dto) {
//				logger.info("답글 추가하기 {}.", locale);
//				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
//				String comment_name = "pro";
//				int board_seq = Integer.parseInt(request.getParameter("board_seq"));
//				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
//				if(memberDto == null) {
//					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
//					model.addAttribute("url","prodetail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq);
//					return "Redirect";
//				}else {					
//				String comment_writer = memberDto.getMember_id();
//				/*String comment_contents = request.getParameter("comment_contents");
//				String comment_group = request.getParameter("comment_group");	*/			
//				/*Map<String,Object> map = new HashMap<String,Object>();
//				map.put("comment_group", comment_group);
//				map.put("comment_name", comment_name);
//				map.put("comment_contents", comment_contents);
//				map.put("comment_writer", comment_writer);*/
//				dto.setComment_writer(comment_writer);
//				boolean isS =  commentService.insertAnsReply(dto);
//				if(isS) {
//					System.out.println("board_seq:"+board_seq);
//					return "redirect:prodetail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq;
//				}else {
//					
//					return "redirect:prodetail.do?pagenum="+pagenum+"&contentnum=20&board_name="+comment_name+"&board_seq="+board_seq;
//				}
//				}
//			}
//			
//			@RequestMapping(value = "/propush.do", method = RequestMethod.POST)
//			public String push(Locale locale, Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,int board_seq) throws IOException {
//				logger.info("답글 추가하기 {}.", locale);
//				int seq = Integer.parseInt(request.getParameter("board_seq"));
//				System.out.println("seq:"+seq);
//				//중복체크해야함
//				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
//				String contentnum = request.getParameter("contentnum");
//				String board_name = "pro";
//				
//				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
//				if(memberDto == null) {
//					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
//					model.addAttribute("url","prodetail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
//					return "Redirect";
//				}else {	
//					Map<String,Object> map = new HashMap<String,Object>();
//					map.put("board_seq", seq);
//					map.put("member_id", memberDto.getMember_id());
//					int pushCheck = boardService.pushCheck(map);
//					System.out.println("memberDto:"+memberDto);
//					if(pushCheck > 0) {
//						model.addAttribute("msg","이미 추천하셨습니다.");
//						model.addAttribute("url","prodetail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
//						return "Redirect";
//					}else {
//					
//						String board_recommender = memberDto.getMember_id();
//						BoardDto boardDto = new BoardDto();
//						boardDto.setBoard_recommender(board_recommender);
//						boardDto.setBoard_seq(seq);
//						boolean isS = boardService.push(boardDto);
//						if(isS) {
//							model.addAttribute("msg","성공적으로 추천되었습니다.");
//							model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
//							return "Redirect";
//						}else {
//							model.addAttribute("msg","추천을 실패했습니다.");
//							return "error";
//						}
//					}
//
//				}							
//				}
//				
//			@RequestMapping(value = "/proAnsPush.do", method = RequestMethod.GET)
//			public String anspush(Locale locale, Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,int comment_seq) throws IOException {
//				logger.info("댓글 추천하기 {}.", locale);
//				int seq = Integer.parseInt(request.getParameter("comment_seq"));
//				System.out.println("seq:"+seq);
//				//중복체크해야함
//				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
//				String contentnum = request.getParameter("contentnum");
//				String board_name = request.getParameter("board_name");
//				
//				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
//				if(memberDto == null) {
//					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
//					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+comment_seq);
//					return "Redirect";
//				}else {	
//					Map<String,Object> map = new HashMap<String,Object>();
//					map.put("comment_seq", seq);
//					map.put("member_id", memberDto.getMember_id());
//					int pushCheck = commentService.pushCheck(map);
//					System.out.println("memberDto:"+memberDto);
//					if(pushCheck > 0) {
//						model.addAttribute("msg","이미 추천하셨습니다.");
//						model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+comment_seq);
//						return "Redirect";
//					}else {
//						String board_recommender = memberDto.getMember_id();
//						CommentDto commentDto = new CommentDto();
//						commentDto.setComment_recommender(board_recommender);
//						commentDto.setComment_seq(seq);
//						boolean isS = commentService.push(commentDto);
//						if(isS) {
//							model.addAttribute("msg","성공적으로 추천되었습니다.");
//							model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+comment_seq);
//							return "Redirect";
//						}else {
//							model.addAttribute("msg","추천을 실패했습니다.");
//							return "error";
//						}
//					}
//				}
//
//			}
//			
//			
//			@RequestMapping(value = "/prodelete.do", method = {RequestMethod.GET,RequestMethod.POST})
//			public String delete(Locale locale, Model model,HttpSession session,HttpServletRequest request) {
//				logger.info("게시글 삭제하기  {}.", locale);
//				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
//				String contentnum = request.getParameter("contentnum");
//				String board_name = request.getParameter("board_name");
//				int board_seq = Integer.parseInt(request.getParameter("board_seq"));
//				System.out.println(pagenum);
//				System.out.println(contentnum);
//				System.out.println(board_name);
//				System.out.println(board_seq);
//				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
//				if(memberDto == null) {
//					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
//					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
//					return "Redirect";
//				}else {	
//					boolean  isS = boardService.delete(board_seq);
//					if(isS) {
//						model.addAttribute("msg","삭제를 성공했습니다.");
//						return "redirect:freeboard.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name;
//					}else {
//						model.addAttribute("msg","삭제를 실패했습니다.");
//						return "error";
//					}
//				}
//			}
//			
//			@RequestMapping(value = "/proansdel.do", method = {RequestMethod.GET,RequestMethod.POST})
//			public String ansdel(Locale locale, Model model,HttpSession session,HttpServletRequest request) {
//				logger.info("댓글 삭제하기  {}.", locale);
//				int pagenum = Integer.parseInt(request.getParameter("pagenum"));
//				String contentnum = request.getParameter("contentnum");
//				String board_name = request.getParameter("board_name");
//				int board_seq = Integer.parseInt(request.getParameter("board_seq"));
//				int comment_seq = Integer.parseInt(request.getParameter("comment_seq"));
//				System.out.println(pagenum);
//				System.out.println(contentnum);
//				System.out.println(board_name);
//				System.out.println(comment_seq);
//				MemberDto memberDto	=(MemberDto)session.getAttribute("uid");
//				if(memberDto == null) {
//					model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
//					model.addAttribute("url","detail.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"&board_seq="+board_seq);
//					return "Redirect";
//				}else {	
//					boolean  isS = commentService.ansdel(comment_seq);
//					if(isS) {
//						model.addAttribute("msg","삭제를 성공했습니다.");
//						return "redirect:freeboard.do?pagenum="+pagenum+"&contentnum=20&board_name="+board_name+"board_seq="+board_seq;
//					}else {
//						model.addAttribute("msg","삭제를 실패했습니다.");
//						return "error";
//					}
//				}
//			}
//			
//		
//			 @RequestMapping(value = "/proupdate.do", method = RequestMethod.GET)
//				public String updateform(Locale locale,HttpSession session, Model model,HttpServletRequest request,int board_seq) {
//					logger.info("수정 폼 이동 {}.", locale);
//					BoardDto boardDto = boardService.getBoard(Integer.parseInt(request.getParameter("board_seq")));
//					MemberDto dto = (MemberDto)session.getAttribute("uid");		
//					if(dto==null) {
//						model.addAttribute("msg","로그인 후 이용하실수 있는 서비스입니다.");
//						model.addAttribute("url","proboard.do?pagenum=1&contentnum=20");
//						return "Redirect";
//					}else {
//						if(dto.getMember_gubun().equals("pro")) {
//							model.addAttribute("boardDto",boardDto);
//							System.out.println("boardDto:"+boardDto);
//							return "professional/Update";
//						}else {
//							model.addAttribute("msg","전문가만 글을 수정할 수 있습니다.");
//							model.addAttribute("url","proboard.do?pagenum=1&contentnum=20");
//							return "Redirect";
//						}
//					}
//				}
//
//}
