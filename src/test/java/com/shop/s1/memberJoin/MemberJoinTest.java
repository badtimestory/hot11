package com.shop.s1.memberJoin;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;

public class MemberJoinTest extends MyjunitTest{

	@Autowired
	private MemberJoinDAO memberJoinDAO;
	

	//@Test
	public void mypage() throws Exception{
		MemberJoinDTO memberJoinDTO = new MemberJoinDTO();
		memberJoinDTO.setM_id("id1");
		memberJoinDTO=memberJoinDAO.mypage(memberJoinDTO);
		assertNotNull(memberJoinDTO);
	}
	
	
	//@Test
	public void login() throws Exception{
		MemberJoinDTO memberJoinDTO= new MemberJoinDTO();
		memberJoinDTO.setM_id("2");
		memberJoinDTO.setM_pw("I");
		memberJoinDTO=memberJoinDAO.login(memberJoinDTO);
		assertNotNull(memberJoinDTO);
	}
	
	@Test
	public void join() throws Exception{
		MemberJoinDTO memberJoinDTO = new MemberJoinDTO();
		
		memberJoinDTO.setM_id("2");
		memberJoinDTO.setM_pw("I");
		memberJoinDTO.setM_name("M");
		memberJoinDTO.setM_phone("010");
		memberJoinDTO.setM_email("E");
		memberJoinDTO.setM_address("A");
		memberJoinDTO.setM_birth("2020-12-20");
		int result = memberJoinDAO.join(memberJoinDTO);
		assertEquals(1, result);
	}

}
