package dao.emp;

import java.util.Date;

/*
 EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2)    
 */
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private double sal;
	private double comm;
	private Dept dept;
	
	public Emp() {
	}

	public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm, Dept dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.dept = dept;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public int getMgr() {
		return mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public double getSal() {
		return sal;
	}

	public double getComm() {
		return comm;
	}

	public Dept getDept() {
		return dept;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", dept=" + dept + "]";
	}
	
	
}
