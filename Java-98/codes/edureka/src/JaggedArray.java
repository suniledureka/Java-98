
public class JaggedArray {

	public static void main(String[] args) {
		int[][] n = new int[5][];
		
		n[0] = new int[7];
		n[1] = new int[3];
		n[2] = new int[5];
		n[3] = new int[2];
		n[4] = new int[6];
		
		System.out.println("size of array = " + n.length);
		System.out.println();
		
		for(int i=0; i<n.length; i++) {
			System.out.println("size of n["+i+"] = " + n[i].length);
		}
		System.out.println();
		
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j] + "      ");
			}
			System.out.println();
		}

	}

}
