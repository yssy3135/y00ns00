package spring_aop07_aopHW;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.util.StopWatch;

public class CheckWeapon_proxy implements MethodInterceptor {


	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = invocation.proceed();
		
		 sw.stop();
		 
		 Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddhh24mmss");
			String fileName = "weapon";
			
			String dir = "C:\\Users\\goott7-8\\Downloads\\log";
			
			File f = new File(dir+"\\"+fileName+".txt");
			
			if(!f.exists()) {
				f.createNewFile();
			};
			
			PrintWriter pw = new PrintWriter(f);
		 
		 
		
		System.out.println("무기 사용 수행 시간" + sw.getTotalTimeSeconds());
		
		
		pw.write("수행시간"+ sw.getTotalTimeSeconds());
		pw.flush();
		System.out.println(sw.getTotalTimeSeconds());
		
		
		return obj;
	}


		
	
}
