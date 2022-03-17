package com.shop.s1.shopQna;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;
import com.shop.s1.util.Pager;

public class ShopQnaDAOTest extends MyjunitTest {

	@Autowired
	private ShopQnaDAO shopQnaDAO;
	
	@Test
	public void check() {
		assertNotNull(shopQnaDAO);
	}
	//list
		@Test
		public void listTest() throws Exception{
			Pager pager = new Pager();
			pager.setPerPage(1L);
			pager.makeRow();
			List<ShopQnaDTO> ar = shopQnaDAO.list(pager);
			System.out.println(ar.get(0).getNum());
			System.out.println(ar.get(0).getNum());
			assertNotEquals(5,ar.size());
		}

			//insert
			//@Test
			public void addTest() throws Exception{
				for(int i=0; i<10;i++) {
					ShopQnaDTO shopQnaDTO = new ShopQnaDTO();
					shopQnaDTO.setWriter("writer"+i);
					shopQnaDTO.setContents("contents"+i);
					shopQnaDTO.setTitle("title"+i);
					
					int result = shopQnaDAO.add(shopQnaDTO);
				}
					System.out.println("Insert Finish");
			}

			//detail
			//@Test
			public void detailTest() throws Exception{
				ShopQnaDTO shopQnaDTO= new ShopQnaDTO();
				shopQnaDTO.setNum(3L);
				shopQnaDTO = shopQnaDAO.detail(shopQnaDTO);
				assertNotNull(shopQnaDTO);
			}
			//delete
			//@Test
			public void deleteTest() throws Exception{
				ShopQnaDTO shopQnaDTO= new ShopQnaDTO();
				shopQnaDTO.setNum(2L);
				int result = shopQnaDAO.delete(shopQnaDTO);
				assertEquals(1, result);
			}
}
