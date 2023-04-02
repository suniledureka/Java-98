class A3{
	A3(int n){
		System.out.println("A3 constructor");
	}
}

class B3 extends A3{
	B3(){
		super(12);
		System.out.println("B3 constructor");
	}
}

public class SuperConstructors {
	public static void main(String[] args) {
		B3 obj = new B3();
	}
}
