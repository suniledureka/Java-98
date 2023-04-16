
public class StringMethods1 {

	public static void main(String[] args) {
		String s1 = new String("edureka");
		String s2 = new String("edureka");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.contentEquals(s2)); //true
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		String s3 = new String("edureka");
		String s4 = new String("Edureka");	
		System.out.println(s3==s4); //false
		System.out.println(s3.equals(s4)); //false
		System.out.println(s3.contentEquals(s4)); //false
		System.out.println(s3.equalsIgnoreCase(s4)); //true	
	}
}