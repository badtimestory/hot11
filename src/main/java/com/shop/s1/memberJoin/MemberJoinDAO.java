package com.shop.s1.memberJoin;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJoinDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESAPCE="com.shop.s1.memberJoin.MemberJoinDAO.";
	
	public int join(MemberJoinDTO memberJoinDTO) throws Exception{
		return sqlSession.insert(NAMESAPCE+"join",memberJoinDTO);
	}
}
