package com.shop.s1.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.URLEditor;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

import com.shop.s1.file.FileDTO;

@Component
public class FileDown extends AbstractView {
	//spring에서 제공하는 AbstractView 상속
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//controller에서 mv.object("file", ooooDTO)가 여기 model에 담겨있는것
		FileDTO fileDTO=(FileDTO)model.get("file");
		
		System.out.println(fileDTO.getfName());
		System.out.println(fileDTO.getoName());
		
		// ex) 리뷰 
		String board=(String)model.get("board");
		String path="/resources/upload/"+board+"/";
		
		//내장 객체는 다른 영역의 내장객체를 불러올 수 있음 
		//단, 좁은 영역에서 큰영역(오래사는)으로 가능 , 반대는 불가능(큰영역->좁은영역x)
		//page -> request -> session -> application (ServletContext) 
		//이때 getRealPath를 써야하는데 이 메서드는 application이 가지고 있음
		//매개변수에 request가 있음 
		ServletContext sc = request.getSession().getServletContext();
		
		path=sc.getRealPath(path);
		
		//파일 정보를 담아놓는 객체를 만듦
		File file= new File(path,fileDTO.getfName());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		
		//Encoding 처리
		response.setCharacterEncoding("UTF-8");
		
		//총 파일의 크기  http header 부분 content -length
		response.setContentLength((int)file.length());
		
		//download시에 파일의 이름을 인코딩
		String fileName = URLEncoder.encode(fileDTO.getoName(),"UTF-8");
		
		//Header설정 다운로드시 보이는 이름 설정  http respnose header에 들어가는 content-disposition은
		//http response body에 오는 컨텐츠 기질/성향을 알려주는 속성
		//attachment;와 fileName 사이에는 띄워쓰기를 꼭 해주어야 하고 인코드하는 뒤 부분 "\" 부분도 꼭 써줘야 다운로드가 가능
		//\(backslash)의 역할은 뒤에 문자가 특수문자나 escape처리 
		response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\"");
		response.setHeader("Content-Transfer-Encoding", "binary");
		
		//HDD에서 파일을 읽어서 Client로 전송 연결 준비
		FileInputStream fi=new FileInputStream(file);
		OutputStream os=response.getOutputStream();
		
		//최종전송
		FileCopyUtils.copy(fi, os);
		
		
		//Stream 으로 하는건 연결 끊어줘야함
		//연결 끊기
		os.close();
		fi.close();
	}

	
		

		
	
	
	
}
