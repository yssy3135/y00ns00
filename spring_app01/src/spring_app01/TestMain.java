package spring_app01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	// 홍길동님 안녕하세요 - 출력해보세요
	public static void main(String[] args) {
		
//		Hellokr hello = new Hellokr();
//		hello.sayHello("홍길동");
//		
//		
//		HelloUS hu = new HelloUS();
//		hu.sayHello("JOHN");
		
		
//		Hello h = new Hellokr();
//		Hello h = new HelloUS();
//		h.sayHello("홍길동");
		
		
		
		
		
		// 위처럼 구동하도록 xml 파일 읽어들이기
		// 1. 스프링 컨테이너를 이용하여 읽어 들이기
		
		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("src/app.xml")); //컨트롤단
		
		Object obj = factory.getBean("h"); // xml에 있는 bean의 id로 찾아오기
		
		Hello hk = (Hello)obj;  // 모델단
		
		
		
		hk.sayHello("홍길동");
		
		
		
		
		
	}
}
