
public class Main {
  public static void main(String[] args) {
    int x = 5;
    x |= 3; // x = x | 3;
    System.out.println("binary of 5 = " + Integer.toBinaryString(5));//0101
    System.out.println("binary of 3 = " + Integer.toBinaryString(3));//0011
    																 //0111
    System.out.println(x);
  }
}
