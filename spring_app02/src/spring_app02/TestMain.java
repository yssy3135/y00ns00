package spring_app02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
		// 1) 반장님이 커피를 홀짝 홀짝 마셔요. => 출력
		
//		BevImple bevimple = new BevImple("커피");
		
//		bevimple.drink("반장");
		
		
		// 2) 반장님이 다른 음료를 마실 수 있도록 수행
		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Object obj = factory.getBean("b");
		Object obj2 = factory.getBean("b");
		
		
		// 스프링 프레임워크는 Bean 관리를 기본적으로 singleTone으로 한다.
		if(obj == obj2) {
			System.out.println("singletone type");
		}
		
		
		System.out.println("-----------------------------");
		// DI (Dependency Injection) : 의존성 주입
		//	: 의존관계에 있어서 XML에 있는 정보를 스프링프레임워크가 run time시
		//	    호출해서 동작하는 형태
		
		
		Beverage b = (Beverage)obj;
		b.drink("반장");
		
		
	
		
		
	}
}
