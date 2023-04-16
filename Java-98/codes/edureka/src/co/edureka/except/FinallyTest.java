package co.edureka.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			
			System.out.print("enter second no: ");
			int y = sc.nextInt();
			
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		}catch(ArithmeticException ex) {
			System.out.println("in catch block");
		}finally {
			System.out.println("finally block $$$$$");
			System.out.println("application designed & developed by");
			System.out.println("\tteam@edureka");
			sc.close();
		}
		System.out.println("---------- DONE ---------");
	}

}
