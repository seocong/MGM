package com.gam.mgm;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.gam.mgm.dto.BoardDto;

import com.gam.mgm.paging.PageMaker;
import com.gam.mgm.service.IBoardService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
/**
 * Handles requests for the application home page.
 */
@Controller
public class KIMController implements ServletContextAware{
	
	private static final Logger logger = LoggerFactory.getLogger(KIMController.class);
	private ServletContext context;
	
	@Autowired
	private IBoardService boardService;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.context = servletContext;
	}

	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		logger.info(" 메인 이동하기{}.", locale);
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
		logger.info(" 자유게시판 이동하기{}.", locale);
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
		model.addAttribute("board_name",board_name);//board name파라미터를 따로 보냄
		model.addAttribute("list", list);
		model.addAttribute("page", pagemaker);
		return "Free/FreeBoard2";
		
	}
	
	 @RequestMapping(value = "/insertform.do", method = RequestMethod.GET)
		public String ansinsertform(Locale locale, Model model,String board_name) {
			logger.info("자유게시판 글쓰기 이동 {}.", locale);
			//로그인 정보 확인 처리
			model.addAttribute("board_name",board_name);
			System.out.println("board_name111:"+board_name);
			return "Free/Insert";
		}
	 
		
		@RequestMapping(value = "/file_uploader_html5.do", method = RequestMethod.POST)
		public void file_uploader_html5(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String sFileInfo = "";
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
	      public ModelAndView write(HttpServletRequest request) throws IOException, FileUploadException {
			 String board_name = request.getParameter("board_name");
	         String board_title = request.getParameter("board_title");
	         String smarteditor = request.getParameter("smarteditor");
	         System.out.println("smarteditor:"+smarteditor);
	         //세션에서 아이디 추출해야함
	         BoardDto boardDto = new BoardDto();
	         boardDto.setBoard_contents(smarteditor);
	         boardDto.setBoard_title(board_title);
	         boardDto.setBoard_writer("admin");
	         boardDto.setBoard_name("board_name");
	         boolean isS = boardService.boardInsert(boardDto);
	         System.out.println("isS:"+isS);
	         if(isS) {
	            ModelAndView model = new ModelAndView("Free/write");
	            model.addObject("title", board_title);
	            model.addObject("board_name", board_name);
	            model.addObject("smarteditor", smarteditor);
	            return model;
	         }else {
	            ModelAndView model = new ModelAndView("error");
	            model.addObject("msg","입력에 실패했습니다.다시 입력해주세요");
	            return model;
	         }
	/*         System.out.println("title = " + title);
	         System.out.println("content = " + smarteditor);*/
	      
	      }
		
		@RequestMapping(value = "/detail.do", method = RequestMethod.GET)
		public String freedetail(Locale locale, Model model,HttpServletRequest request) {
			logger.info("게시판 상세 보기 {}.", locale);
			String pagenum = request.getParameter("pagenum");
			String contentnum = request.getParameter("contentnum");
			String board_name = request.getParameter("board_name");
			if(request.getParameter("board_seq")!=null) {
				boardService.readCount(Integer.parseInt(request.getParameter("board_seq")));
				BoardDto boardDto = boardService.getBoard(Integer.parseInt(request.getParameter("board_seq")));
				model.addAttribute("Dto",boardDto);				
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
	 
}
