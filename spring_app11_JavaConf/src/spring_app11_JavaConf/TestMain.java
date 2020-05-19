package spring_app11_JavaConf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestMain {
	public static void main(String[] args) {
		
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("app.xml");
//		
//		Monitor mt = context.getBean("sm",Monitor.class);
//		mt.showMonitor();
		
		
		//자바 설정으로 읽어들이기
		
		
//		BeanFactory 로도 읽을 수 있다.
		BeanFactory factory =
				new AnnotationConfigApplicationContext(JavaConf.class);
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConf.class);
		
		
		
		
		
		Monitor sm = factory.getBean("sm",Monitor.class);
		sm.showMonitor();
		
		
	}
}
