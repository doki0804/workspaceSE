public class HourlyEmploYee extends Employee {
	private int worksHour;//일한시간
	private int payPerHour;//시간당급여
	
	public HourlyEmploYee() {
	}

	public HourlyEmploYee(int no,String name, int worksHour, int payPerHour) {
		super(no,name);
		this.worksHour = worksHour;
		this.payPerHour = payPerHour;
	}
	
	public void print() {
		super.print();
		System.out.println(this.worksHour+"\t"+this.payPerHour);
	}
	
	@Override
	public void calculatePay() {
		this.setPay(this.worksHour*payPerHour);
	}

	public int getWorksHour() {
		return worksHour;
	}

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setWorksHour(int worksHour) {
		this.worksHour = worksHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
}
