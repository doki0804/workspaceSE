package dao.emp;

import java.util.List;

/*
 DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 

 */
public class Dept {
	private int deptNo;
	private List<Emp> empList;
	private String dname;
	private String loc;
	
	public Dept() {
	}

	public Dept(int deptNo, List<Emp> empList, String dname, String loc) {
		super();
		this.deptNo = deptNo;
		this.empList = empList;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public List<Emp> getEmpList() {
		return empList;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setDeptNo(int deptno) {
		this.deptNo = deptno;
	}

	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptNo [deptno=" + deptNo + ", empList=" + empList + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
	
	
	
	
}
