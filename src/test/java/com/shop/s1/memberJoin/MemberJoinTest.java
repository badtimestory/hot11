package com.shop.s1.memberJoin;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;

public class MemberJoinTest extends MyjunitTest{

	@Autowired
	private MemberJoinDAO memberJoinDAO;

	@Test
	public void join() throws Exception{
		MemberJoinDTO memberJoinDTO = new MemberJoinDTO();
		
		memberJoinDTO.setId("K");
		memberJoinDTO.setPw("I");
		memberJoinDTO.setName("M");
		memberJoinDTO.setPhone("010");
		memberJoinDTO.setEmail("E");
		memberJoinDTO.setAddress("A");
		
		int result = memberJoinDAO.join(memberJoinDTO);
		assertEquals(1, result);
	}

}
