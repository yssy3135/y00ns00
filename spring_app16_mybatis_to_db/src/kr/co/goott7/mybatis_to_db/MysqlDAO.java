package kr.co.goott7.mybatis_to_db;

import java.util.List;

public class MysqlDAO implements DAO{
	
	ConnectionManager cm;

	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}

	
	@Override
	public List<EmpDTO> selectAll() {
		
		return cm.getFactory().openSession(true).selectList("selectAll");
	}

	@Override
	public EmpDTO selectOne(int no) {
		// TODO Auto-generated method stub
		return cm.getFactory().openSession(true).selectOne("selectOneByEmp", no);
	}

	@Override
	public void insertOne(EmpDTO dto) {
		
		 cm.getFactory().openSession(true).insert("insertOneByEmp",dto);
		 
	}

	@Override
	public void updateOne(EmpDTO dto) {
		 cm.getFactory().openSession(true).update("updateOneEmp", dto);
		
	}

	@Override
	public void deleteOne(int no) {
		cm.getFactory().openSession(true).delete("deleteEmp", no);
		
	}

	
	
}
