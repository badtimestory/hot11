package com.shop.s1.wishlist;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;
import com.shop.s1.util.Pager;

import oracle.net.ns.Packet;

public class WishlistDAOTest extends MyjunitTest{
	@Autowired
	private WishlistDAO wishlistDAO;
	
	@Test
	public void check() {
		assertNotNull(wishlistDAO);
	}


}
