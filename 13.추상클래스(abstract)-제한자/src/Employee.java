public abstract class Employee {
    private int no;		//사원번호
    private String name;//사원이름
    private int pay;	//사원급여
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}
    
	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	/*
	  급여계산메쏘드
	   - 실제구현작업불가능
	   - 자식클래스에서 반드시 재정의(구현)해야하는 메쏘드
	   - 재정의를 강제(규칙,specification)
	*/
    public abstract void calculatePay();

    public void print(){
    	System.out.println(this.no+"\t"+this.name+"\t"+this.pay);
    }

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
