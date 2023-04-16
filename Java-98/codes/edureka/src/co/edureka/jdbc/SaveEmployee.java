package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(101,'Sunil',2500)";
		try {
			int employeesSaved = st.executeUpdate(sql);
			System.out.println("employee saved - " + employeesSaved);
		}catch(Exception ex) {
			System.err.println("Error ---> " + ex.getMessage());
		}
		
		st.close();
		con.close();
	}

}
