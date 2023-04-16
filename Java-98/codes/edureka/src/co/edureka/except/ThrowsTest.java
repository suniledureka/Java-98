package co.edureka.except;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService service = new UserService();
		
		String name="";
		
		try {
			name = service.findUserNameById(101);
		} catch (SQLException | IOException e) {		
			e.printStackTrace();
		} 
		System.out.println(name);
		
		System.out.println("please wait for 6 seconds");
		Thread.sleep(6000); //6000ms
		System.out.println("thanks for waiting");
		
		System.out.println("---------- DONE ------------");
	}

}
