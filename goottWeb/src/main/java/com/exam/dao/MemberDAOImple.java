package com.exam.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.exam.vo.MemberVO;
import com.sun.org.apache.xml.internal.utils.NameSpace;

@Repository
public class MemberDAOImple implements memberDAO {
	
	private static final String NAMESPACE = "com.exam.MemberMapper";
	
	
	@Inject
	private SqlSession session;
	
	
	
	@Override
	public String getTime() {
		
		
		//return session.selectOne("getTime");
		return session.selectOne(NAMESPACE+".getTime");
	}

	@Override
	public void insertMember(MemberVO mvo) {
		
		//session.insert("insertMember", mvo);
		
		session.insert(NAMESPACE+".insertMember", mvo);
	}
	

}
