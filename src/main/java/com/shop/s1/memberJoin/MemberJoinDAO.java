package com.shop.s1.memberJoin;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJoinDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESAPCE="com.shop.s1.memberJoin.MemberJoinDAO.";
	
	//아이디 확인
	public MemberJoinDTO idCheck(String m_id) throws Exception{
		return sqlSession.selectOne(NAMESAPCE+"idCheck",m_id); 
	}
	
	public int delete(MemberJoinDTO memberJoinDTO) throws Exception{
		return sqlSession.delete(NAMESAPCE+"delete",memberJoinDTO);
	}
	
	public int update(MemberJoinDTO memberJoinDTO) throws Exception{
		return sqlSession.update(NAMESAPCE+"update",memberJoinDTO);
	}
	
	public MemberJoinDTO mypage(MemberJoinDTO memberJoinDTO) throws Exception{
		return sqlSession.selectOne(NAMESAPCE+"mypage",memberJoinDTO);
	}
	
	public MemberJoinDTO login(MemberJoinDTO memberJoinDTO) throws Exception{
		return sqlSession.selectOne(NAMESAPCE+"login",memberJoinDTO);
	}
	
	public int join(MemberJoinDTO memberJoinDTO) throws Exception{
		return sqlSession.insert(NAMESAPCE+"join",memberJoinDTO);
	}
}
