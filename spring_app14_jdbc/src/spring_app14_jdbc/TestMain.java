package spring_app14_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao",DAO.class);
		
		
		
		// 전체 사원검색
		List<EmpDTO> list = d.selectAll();
		
		for(EmpDTO dto: list) {
			System.out.println("사원번호"+dto.getEmpno() + "\t"+
								"사원이름"+dto.getEname()+ "\t"+
								"급여"+dto.getSal()+"\t"+
								"부서번호"+dto.getDeptno());
			
		}
		
		
		// 사원 한명 검색
//		EmpDTO dto2 = d.selectOne(7521);
//		System.out.println("사원번호"+dto2.getEmpno() + "\t"+
//		"사원이름"+dto2.getEname()+ "\t"+
//		"급여"+dto2.getSal()+"\t"+
//		"부서번호"+dto2.getDeptno());
		
		
//		EmpDTO dto3 = new EmpDTO(9999, "scott", 5000, 5000);
//		d.insertOne(dto3);
		
		
		
		
	}
}
