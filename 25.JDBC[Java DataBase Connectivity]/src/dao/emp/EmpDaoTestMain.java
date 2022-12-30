package dao.emp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDaoTestMain {
	
	public static void main(String[] args) throws Exception {
		EmpDao empDao = new EmpDao();
		Map rowMap = empDao.findByPrimaryKey(7369);
		System.out.println(rowMap);
		System.out.println(rowMap.get("EMPNO")+"\t"+
							rowMap.get("ENAME")+"\t"+
							rowMap.get("JOB")+"\t"+
							rowMap.get("DNAME")+"\t"+
							rowMap.get("LOC"));
		System.out.println("-------------findAllWithDept--------------");
		List<Map> rowMapList = empDao.findAllWithDept();
		for(Map tempRowMap : rowMapList) {
			System.out.println(tempRowMap.get("EMPNO")+"\t"+
					tempRowMap.get("ENAME")+"\t"+
					tempRowMap.get("JOB")+"\t"+
					tempRowMap.get("DNAME")+"\t"+
					tempRowMap.get("LOC"));
		}
		System.out.println("-------------find_primary_key_Dept2--------------");
		System.out.println(empDao.findByPrimaryKey2(7369));

		
		
	}
}
