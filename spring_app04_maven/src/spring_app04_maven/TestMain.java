package spring_app04_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory =
				new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		
		Message m = factory.getBean("g",Message.class);
		
		m.sayHello("호환성체크가 앞으로 짱나실 거에요.....");
		
	}
}
