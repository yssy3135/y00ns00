package spring_aop09_anno_HW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class CheckWeapon {
	
	@Pointcut("execution (public * fire (..))")
	public void publicPointCut() {}
	
	@AfterReturning("publicPointCut()")
	public Object logAfter(JoinPoint pjp) throws Throwable {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd - hh:mm:ss");
		
		// ProceedingJointPoint 는 aop:around만 지원한다
		//Object obj = pjp.proceed();
	    //Object obj = ((ProceedingJoinPoint)pjp).proceed();
		
		String useTime = sdf.format(d);
		
		String fileName = "weapon3.txt";
		
		String dir = "C:\\Users\\goott7-8\\Downloads\\log";
		
		File f = new File(dir+"\\"+fileName+".txt");
		
		if(!f.exists()) {
			f.createNewFile();
		};
		
		PrintWriter pw = new PrintWriter(f);
		
			
	
		pw.write("무기사용시간 : "+useTime);
	
		pw.flush();
		
		return null;
		

	
}
}
