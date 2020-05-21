package spring_aop07_aopHW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		//Weapon weapon = context.getBean("proxyBean",Weapon.class);
		
		Weapon weapon = context.getBean("biz",Weapon.class);
		
		weapon.fire();
		
	}
}
