package kr.co.goott7.mybatis_to_db;

import java.util.List;

public class MysqlDAO implements DAO {
	
	ConnectionManager cm;
	
	
	
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}

	@Override
	public List<DeptDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeptDTO selectOne(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		
	}
	
}
