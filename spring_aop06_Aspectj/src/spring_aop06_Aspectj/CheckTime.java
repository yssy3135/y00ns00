package spring_aop06_Aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime {
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		
		// 메소드 이름 체크
		String methodName = pjp.getSignature().getName();
		
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		System.out.println("메소드 이름 : "+ methodName);
		System.out.println("수행시간 : "+ sw.getTotalTimeSeconds());
		
		
		return null;
		
	}
}
