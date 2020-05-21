package advice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
		
		// 추가로 파일에 저장해서 출력해보세요
		// '파일이름' 저장되었습니다.
		// '10000' 이체되었습니다.
		
		 // 기존 파일의 내용에 이어서 쓰려면 true를, 기존 내용을 없애고 새로 쓰려면 false를 지정한다.

		
//		BufferedWriter writer = new BufferedWriter(new FileWriter(f2, true));
		PrintWriter pw = new PrintWriter(f2);
		
		pw.write(fileName+" 저장되었습니다");
		
		pw.write(args[0]+" 이체되었습니다.");
		pw.flush();
		
//		writer.write(fileName+" 저장되었습니다");
//		writer.newLine();
//		writer.write(args[0]+" 이체되었습니다.");
//		writer.flush();
		
		// 이런식으로 생성하는 것이 로그 기록의 일정 => 감사자료....
		
		
		// 매개변수 출력
		System.out.println("returnValue : "+ returnValue);
		System.out.println("method : "+ method.getName());
		System.out.println("args : "+ args[0]);
		System.out.println("target : "+ target.getClass().getName());
		
		
		
		
		
		
	}
	
}
