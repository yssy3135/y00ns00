package spring_aop10_JavaConf;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class CheckTime {
	
	@Pointcut("execution (public * printName (..))")
	public void publicPointcut() {}
	
	//어디에 aspect이 지정될지 써있지 않다.(연결 고리가 없다 )
	@Around("publicPointcut()")   
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
