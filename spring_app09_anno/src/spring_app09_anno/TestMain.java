package spring_app09_anno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {

	public static void main(String[] args) {
			
//			StunGun sg = new StunGun();
//			
//			Police p1 = new Police(sg, 150);
//			
//			p1.attack("도둑님");
//			
//			System.out.println(p1.hp);
		
		//runtime 시에 xml에 있는 정보를 불러와서 사용 => 의존성 주입

		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("app.xml");
		
		Character ch1 = context.getBean("p1",Character.class);
		
		ch1.attack("도둑놈");
		
		

	
		

	}
	

}
