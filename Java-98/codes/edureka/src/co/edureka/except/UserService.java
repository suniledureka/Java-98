package co.edureka.except;

import java.io.IOException;
import java.sql.SQLException;

public class UserService {
	public String findUserNameById(int id) throws SQLException,IOException 
	{
		//logic to get user name from DB
		return "Sanjay";
	}
}	
