package Spring_app13_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao",DAO.class);
		
		// 전체 데이터 조회
		List<DeptDTO> list = d.selectAll();
		
		for(DeptDTO dto: list) {
			System.out.println("부서번호 : "+ dto.getDeptno() + "\t" +
								"부서이름 : "+dto.getDname() + "\t"+
								"부서위치 : " + dto.getLoc());
		}
		
		
		// 개별 조회
//		DeptDTO dto = d.selectOne(30);
//		System.out.println(dto.getDname());
		
//		DeptDTO dto2 = new DeptDTO(60, "영업1", "구로디지털단지역");
//		d.insertOne(dto2);
		
		
		System.out.println("-----------------------------------------------");
		// 데이터 수정
//		DeptDTO dto3 = new DeptDTO(60, "총무1", "재택근무");
//		d.updateOne(dto3);
		
		System.out.println("------------------------------------------------");
//		d.deleteOne(60);
		
		
	}
}
