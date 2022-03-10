package jdbc;

import java.sql.*;
//import com.mysql.jdbc.Driver;

public class UpdateJdbc {
	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/jdbc";
		String Username="root";
		String Password="admin";
		String sql = "update emp set Name_='Nasruddin khan' where Emp_id=2";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL, Username, Password);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Update successfully");
			con.close();
		}catch(Exception e){
	
		}
	
		

	}

}
