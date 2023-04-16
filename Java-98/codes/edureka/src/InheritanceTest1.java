class A1{
	int a=10, b=20;
	void displayAB() {
		System.out.println("in class A1 - " + a + ", " + b);
	}
}

class B1 extends A1{
	int c=30;
	void displayABC() {
		System.out.println("in class B1 - " + a + ", " + b + ", " + c);
	}
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		B1 obj = new B1();
		System.out.println(obj.a + " | " + obj.b + " | " + obj.c);
		obj.displayAB();
		obj.displayABC();
	}

}
