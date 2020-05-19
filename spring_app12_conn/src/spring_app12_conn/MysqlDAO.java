package spring_app12_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MysqlDAO implements DAO {
	private static Connection conn;
	
	final String DRIVER = "com.mysql.jdbc.Driver";
	final String URL = "jdbc:mysql://localhost:3306/goott7?useSSL=false";
	final String USER = "scott";
	final String PASSWORD = "tiger";
	

	StringBuffer sb = new StringBuffer();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	
	public void init() {
		
			if(conn == null) {
				try {
					Class.forName(DRIVER);
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					
					System.out.println("conn : "+ conn);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}// if end
			
		
	} // init end
	
	
	
	
	
	
	
	public void close() {
		try {
			
			conn.close();
			System.out.println("종료메소드 호출");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// close() end
	
	
	

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("select count(*) cnt ");
		sb.append("from dept ");
		
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				result = rs.getInt("cnt");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
		
		
	}
	
	
	
	


	
	
}
