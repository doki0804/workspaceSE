
public class SynchronizeUpperLowerPintSharedObject {

	public synchronized void printLower() {
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print("d");
		System.out.print("e");
		System.out.print("f");
		System.out.print("g");
		System.out.print("h");
		System.out.print("i");
		System.out.print("j");
		System.out.print("k");
		System.out.print("l");
		System.out.print("m");
		System.out.print("n");
		System.out.print("o");
		System.out.print("p");
		System.out.print("q");
		System.out.print("r");
		System.out.print("s");
		System.out.print("t");
		System.out.print("u");
		System.out.print("v");
		System.out.print("w");
		System.out.print("x");
		System.out.print("y");
		System.out.print("z");
	}
	public synchronized void printUpper() {
		for(int i=0 ; i<26 ;i++) {
			System.out.print((char)('A'+i));
		}
	}
}
