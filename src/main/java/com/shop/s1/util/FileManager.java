package com.shop.s1.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	
	@Autowired
	// Web application과 외부(OS)간의 연결정보를 담고 있는 객체
	private ServletContext servletContext;

	public String save(MultipartFile multipartFile, String path) throws Exception {
		// path = resources/images/products
		String realPath = servletContext.getRealPath(path);
		System.out.println("realPath: " + realPath);
		
		// file 객체에 폴더의 정보를 담음
		File file = new File(realPath);
		
		// 폴더가 없을 때
		if(!file.exists()) {
			file.mkdirs();	// 중간폴더가 없으면 중간폴더까지 같이 생성
		}
		
		String oriName = multipartFile.getOriginalFilename();	// iu.jpg
		
		// UUID
		String fileName = UUID.randomUUID().toString();
		fileName = fileName + "_" + oriName;
		System.out.println("파일이름: " + fileName);
		
		// file HDD에 저장
		file = new File(file, fileName);
		FileCopyUtils.copy(multipartFile.getBytes(), file);
		
		// 파일의 이름을 반환
		return fileName;
	}
}
