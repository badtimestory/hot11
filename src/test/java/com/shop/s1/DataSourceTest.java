package com.shop.s1;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DataSourceTest extends MyjunitTest {
	
	@Autowired
	private DataSource dataSource;
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void connectionTest() throws Exception {
		assertNotNull(dataSource.getConnection());
	}
	
	@Test
	public void sessionTest() {
		assertNotNull(sqlSession);
	}
}
