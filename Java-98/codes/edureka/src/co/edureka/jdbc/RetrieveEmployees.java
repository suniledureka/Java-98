package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		//String sql = "select * from emp";
		String sql = "select empno,ename,sal from emp";
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3); //rs.getFloat("sal")
			
			System.out.println(String.format("%-3d | %-10s | %.2f", eno,name,sal));
			Thread.sleep(1000);
		}
		
		rs.close();
		st.close();
		con.close();
	}
}