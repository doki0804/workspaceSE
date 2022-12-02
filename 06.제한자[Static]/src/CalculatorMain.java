

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
	
		int add=calculator.add(23,34);
		System.out.println(add);
		int sub=calculator.sub(23,34);
		System.out.println(sub);
		int mul=calculator.mul(23,34);
		System.out.println(mul);
		double div=calculator.div(45435,34);
		System.out.println(div);
		
		
	}

}