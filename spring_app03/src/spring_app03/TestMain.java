package spring_app03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Object obj = factory.getBean("p");
		
		Printer printer = (Printer)obj;
		
		
		printer.printer("메시지");
		
		
	}
}
