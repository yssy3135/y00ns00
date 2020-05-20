package kr.co.goott7.mybatis_to_db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao",DAO.class);
//		System.out.println("d : "+d);
		
		List<DeptDTO> list = d.selectAll();
		
		for(DeptDTO dto : list) {
			System.out.println( dto.getDeptno() + "\t"+dto.getDname()+"\t"+dto.getLoc());
		}
		
		System.out.println("-----------------------------------------------");
		
//		DeptDTO dto = d.selectOne(10);
//		
//		System.out.println( dto.getDeptno() + "\t"+dto.getDname()+"\t"+dto.getLoc());
		System.out.println("------------------------------------------------");
		// 데이터 삽입
		
//		DeptDTO dto2 = new DeptDTO(60, "QA", "서울");
//		d.insertOne(dto2);
		
		
		
	}
}
