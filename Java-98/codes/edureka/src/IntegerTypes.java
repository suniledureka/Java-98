
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = 127;
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		System.out.println(b);
		
		//long pop = 2147483647;
		//long pop = 2147483648; //The literal 2147483648 of type int is out of range
		long pop = 2147483648L;
		System.out.println("world population = " + pop);
		
		//int n = 25;
		int n = (int) 25L;
		System.out.println(n);
	}

}
