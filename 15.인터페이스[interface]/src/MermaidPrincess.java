
public class MermaidPrincess implements Mermaid,Princess{

	@Override
	public void speak() {
		System.out.println("Princess.speak()의 구현[재정의]");
	}

	@Override
	public void think() {
		System.out.println("Princess.think()의 구현[재정의]");
	}

	@Override
	public void fastSwim() {
		System.out.println("Mermaid.fastSwing의 구현[재정의]");
	}

	@Override
	public void liveSea() {
		System.out.println("Mermaid.liveSea()의 구현[재정의]");
	}

}
