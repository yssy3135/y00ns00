package spring_aop07_aopHW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckWeapon_aspectJ {
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		
		String methodName = pjp.getSignature().getName();
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj =pjp.proceed();
		
		sw.stop();
		
		 Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddhh24mmss");
			String fileName = "weapon_aspectj";
			
			String dir = "C:\\Users\\goott7-8\\Downloads\\log";
			
			File f = new File(dir+"\\"+fileName+".txt");
			
			if(!f.exists()) {
				f.createNewFile();
			};
			
			PrintWriter pw = new PrintWriter(f);
		
			System.out.println("무기 사용 수행 시간" + sw.getTotalTimeSeconds());
			
			
			pw.write("수행시간"+ sw.getTotalTimeSeconds());
			pw.flush();
		
			
		
		return null;
	}
	
	
}
