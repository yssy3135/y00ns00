package com.exam.junitTest;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

	
		@Inject
		private DataSource dataSource;
		
		@Test
		public void textConn() {
			try(Connection conn = dataSource.getConnection()) {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	
}


