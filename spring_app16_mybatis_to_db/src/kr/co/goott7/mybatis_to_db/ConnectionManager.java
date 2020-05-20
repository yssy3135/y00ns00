package kr.co.goott7.mybatis_to_db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionManager {
	static SqlSessionFactory factory;
	
	static {
		try {
			Reader r = 
					Resources.getResourceAsReader("resource/SqlMapConfig.xml");
			
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			factory = builder.build(r);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// static{} end
	

	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
	
	
	
}
