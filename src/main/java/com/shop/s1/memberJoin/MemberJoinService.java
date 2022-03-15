package com.shop.s1.memberJoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberJoinService {

	@Autowired
	private MemberJoinDAO memberJoinDAO;
	
	public MemberJoinDTO mypage(MemberJoinDTO memberJoinDTO) throws Exception{
		return memberJoinDAO.mypage(memberJoinDTO);
	}
	
	public MemberJoinDTO login(MemberJoinDTO memberJoinDTO) throws Exception{
		return memberJoinDAO.login(memberJoinDTO);
	}
	
	public int join(MemberJoinDTO memberJoinDTO) throws Exception{
		return memberJoinDAO.join(memberJoinDTO);
	}
}
