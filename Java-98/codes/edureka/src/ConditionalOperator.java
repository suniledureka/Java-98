import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		/*
		int x = 101;
		int y = 25;
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		
		System.out.print("enter second no: ");
		int y = sc.nextInt();		
	
		int lar = (x > y) ? x : y;
		System.out.println("largest of (" + x + ", " + y + ") = " + lar);
	}
}