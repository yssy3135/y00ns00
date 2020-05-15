package spring_app03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		/*
		  Object obj = factory.getBean("p");
		  
		  DotPrinter p = (DotPrinter)obj;
		  
		  p.print("오늘은 월요일...프레임워크..짜증나실거에요");
		*/
		
		// 형변환을 중여서 사용하기
		Printer p = factory.getBean("d", Printer.class);
		p.print("wow 놀라운 프로그래밍 세계...");
		
		
	}
}
