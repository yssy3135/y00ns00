package spring_aop10_JavaConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
//		ApplicationContext ctx =
//				new GenericXmlApplicationContext("app.xml");
		
		
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConf.class);
		
		
		CustomerService cs = ctx.getBean("cs",CustomerService.class);
		
		
		cs.printName();
		cs.printEmail();
		
	}
}
