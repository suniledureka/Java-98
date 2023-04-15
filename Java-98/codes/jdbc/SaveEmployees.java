package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {
	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "insert into emp(empno,ename,sal) values(102,'Anil',2500), (103,'Sanjay',3250.5),"
				+ "(104,'Praveen',2575.5), (105,'Prakash',3500)";
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
