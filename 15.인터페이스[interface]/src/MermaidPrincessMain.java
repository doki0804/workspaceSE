
public class MermaidPrincessMain {
	
	public static void main(String[] args) {
		System.out.println("---------MermaidPrincess----------");
		MermaidPrincess mp = new MermaidPrincess();
		mp.speak();
		mp.think();
		mp.fastSwim();
		mp.liveSea();
		System.out.println("---------Mermaid----------");
		Mermaid m = null;
		m=mp;
		m.fastSwim();
		m.liveSea();
		System.out.println("---------Princess----------");
		Princess p = mp;
		p.speak();
		p.think();
		System.out.println("---------Mermaid <--> Princess----------");
		Mermaid m2=new MermaidPrincess();
		m2.fastSwim();
		m2.liveSea();
		Princess p2 = (Princess)m2;
		p2.speak();
		p2.think();
		
	}
}
