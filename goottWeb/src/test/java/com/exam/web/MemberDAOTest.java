package com.exam.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exam.dao.memberDAO;
import com.exam.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberDAOTest {

	@Inject
	private memberDAO memberDao;
	
	@Test
	public void testTime() {
		System.out.println(memberDao.getTime());
	}
	
	
	@Test
	public void testInsertMember() {
//		MemberVO mvo = new MemberVO();
//		mvo.setUid("hong");
//		mvo.setPwd("1234");
//		mvo.setUsername("hong");
//		mvo.setEmail("giledong@hwal.com");
//		
//		memberDao.insertMember(mvo);
		
	}

	
	
}

