package spring_aop07_aopHW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckWeapon_aspectJ {
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd - hh:mm:ss");
		
		String useTime = sdf.format(d);
		
		String fileName = "weapon_aspectj";
		
		String dir = "C:\\Users\\goott7-8\\Downloads\\log";
		
		File f = new File(dir+"\\"+fileName+".txt");
		
		if(!f.exists()) {
			f.createNewFile();
		};
		
		PrintWriter pw = new PrintWriter(f);
		
		
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj =pjp.proceed();
		
		sw.stop();
		
		
		System.out.println("무기 사용 수행 시간" + sw.getTotalTimeSeconds());
			
			
		pw.write("무기사용시간 : "+useTime);
		pw.write("수행시간"+ sw.getTotalTimeSeconds());
		pw.flush();
		
			
		
		return null;
	}
	
	
}
