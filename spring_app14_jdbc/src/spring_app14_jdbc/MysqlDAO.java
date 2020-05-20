package spring_app14_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MysqlDAO implements DAO {
	
	StringBuffer sb = new StringBuffer();
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@Override
	public List<EmpDTO> selectAll() {
		sb.setLength(0);
		sb.append("select empno,ename,sal,deptno " );
		sb.append("from emp " );
		
		RowMapper<EmpDTO> rm  = new RowMapper<EmpDTO>() {
			
			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				return new EmpDTO(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getInt(4));
			}
		};
		
		List<EmpDTO> list = jdbcTemplate.query(sb.toString(), rm);
		
		return list;
	}

	@Override
	public EmpDTO selectOne(int no) {
		sb.setLength(0);
		sb.append("select empno,ename,sal,deptno " );
		sb.append("from emp ");
		sb.append("where empno = ? ");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {
			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new EmpDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			}
			
		};
		
	EmpDTO dto = jdbcTemplate.queryForObject(sb.toString(), rm,no);
	
		
		
		return dto;
	}

	@Override
	public void insertOne(EmpDTO dto) {
		sb.setLength(0);
		sb.append("insert into emp(empno,ename,sal,deptno) ");
		sb.append("values (?,?,?,?) ");
		
		int result = jdbcTemplate.update(sb.toString(),dto.getEmpno(),dto.getEname(),dto.getSal(),dto.getDeptno());
		System.out.println("입력갯수"+ result);
		
	}

	@Override
	public void updateOne(EmpDTO dto) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("update emp(empno,ename,sal,deptno) ");
		sb.append("set ?,?,?,? ");
		
		
		
		
		
	}

	@Override
	public void deleteOne(EmpDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
