package co.edureka.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		FileWriter fout = new FileWriter("src/co/edureka/io/edureka1.txt");
				
		String str = "Edureka is an online training provider with the most effective learning system in the world.\n";
		fout.write(str);
		
		fout.close();
	}
}