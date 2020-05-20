package kr.co.goott7.mybatis_to_db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

public class MysqlDAO implements DAO {
	
	ConnectionManager cm;
	
	
	
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}

	@Override
	public List<DeptDTO> selectAll() {
		/*
		 * SqlSessionFactory factory = cm.getFactory();
		 * 
		 * SqlSession ss = factory.openSession(true);
		 * 
		 * //Mapper.xml에 작성해놓은 mapper List<DeptDTO> list = ss.selectList("selectAll");
		 */
		
		
		return cm.getFactory().openSession(true).selectList("selectAll");
	}

	@Override
	public DeptDTO selectOne(int no) {
//		SqlSessionFactory factory = cm.getFactory();
//		
//		SqlSession ss = factory.openSession(true);
//		
//		DeptDTO dto = ss.selectOne("selectOneByDeptno", no);
		
		
		return cm.getFactory().openSession(true).selectOne("selectOneByDeptno",no);
	}

	@Override
	public void insertOne(DeptDTO dto) {
		cm.getFactory().openSession().insert("insertOneByDept", dto);

	}

	@Override
	public void updateOne(DeptDTO dto) {
		cm.getFactory().openSession().update("updateOneDept", dto);
		
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		
	}
	
}
