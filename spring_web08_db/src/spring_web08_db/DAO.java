package spring_web08_db;

import java.util.List;

public interface DAO {
	public List<DeptDTO> selectALl();
	public DeptDTO selsctOne(int no);
	public void insertOne(DeptDTO dto);
	public void updateOne(DeptDTO dto);
	public void deleteOne(int no);
}
