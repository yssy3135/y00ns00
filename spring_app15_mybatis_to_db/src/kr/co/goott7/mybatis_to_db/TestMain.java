package kr.co.goott7.mybatis_to_db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao",DAO.class);
		System.out.println("d : "+d);
		
		
	}
}
