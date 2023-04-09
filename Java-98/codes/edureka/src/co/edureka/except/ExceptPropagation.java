package co.edureka.except;

public class ExceptPropagation {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		m2();
	}

	private static void m2() {
		m3();
	}

	private static void m3() {
		int x = 10;
		int y = 0;
		int z = x / y;
		System.out.println(x + " / " + y + " = " + z);
		System.out.println("---- done ----");		
	}
	
}
