package co.edureka.pack;

import co.edureka.pack1.Nums;

public class PackTest {
	public static void main(String[] args) {
		System.out.println("user-defined package example");
		
		Nums numsRef = new Nums();
		System.out.println("sum = " + numsRef.add(10,20));
	}
}