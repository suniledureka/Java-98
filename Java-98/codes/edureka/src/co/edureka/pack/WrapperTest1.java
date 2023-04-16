package co.edureka.pack;

public class WrapperTest1 {

	public static void main(String[] args) {
		int n1 = 25;
		Integer n2 = n1; //boxing
		int n3 = n2; //un-boxing
		System.out.println(n1 + " | " + n2 + " | " + n3);
	}
}