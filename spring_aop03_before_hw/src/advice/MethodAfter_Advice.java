package advice;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfter_Advice implements AfterReturningAdvice {
	// OS 에 파일로 그결과를 저장해두기
	// C:\Users\goott7-8\Downloads\log\오늘날짜.txt
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddhh24mmss");
		String fileName = sdf.format(d);
		
		// 디렉토리 생성
		String dir = "C:\\Users\\goott7-8\\Downloads\\log";
		
		File f = new File(dir);
		
		// 파일 객체 생성
		// new file(디렉토리+파일이름+확장자)
		File f2 = new File(dir+"\\"+fileName+".txt");
		
		// 파일, 디렉토리가 존재하지 않으면 생성
		if(!f.exists()) {
			f.mkdir();
			
		};
		
		if(!f2.exists()) {
			f2.createNewFile();
		};
		
		
		// 매개변수 출력
		System.out.println("returnValue : "+ returnValue);
		System.out.println("method : "+ method.getName());
		System.out.println("args : "+ args[0]);
		System.out.println("target : "+ target.getClass().getName());
		
		
		
		
		
		
	}
	
}
