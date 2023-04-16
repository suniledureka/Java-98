package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt", true);
		
		String str = "Edureka is an online training provider with the most effective learning system in the world.\n";
		byte[] data = str.getBytes(); //to convert string to byte[]
		fout.write(data);
		
		fout.close();
	}
}