package jdbc;
import java.sql.*;
public class DeleteJdbc {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/jdbc";
		String UserName="root";
		String Password="admin";
		String DeleteQuery="delete from emp where Emp_id =1";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(jdbcUrl, UserName, Password);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(DeleteQuery);
			System.out.println("Record deleted whoes you are selected");
			con.close();
		}catch(Exception e) {
			
		
		}
		
	}

}
