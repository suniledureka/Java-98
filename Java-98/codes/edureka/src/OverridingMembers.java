class A2 {
	int a=10, b=20;
	void display() {
		System.out.println("in class A2 - " + a + " | " + b);		
	}
}

class B2 extends A2{
	int a=11, b=22;
	@Override
	void display() {
		System.out.println("in class B2 - " + a + " | " + this.b + " | " + super.a + " | " + super.b);
		super.display();
	}
}


public class OverridingMembers {

	public static void main(String[] args) {
		B2 obj = new B2();
		obj.display();
	}

}
