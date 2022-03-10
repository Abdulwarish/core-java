package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Createtable {

	public static void main(String[] args) {
		String Url="jdbc:mysql://localhost:3306/college";
		String UserName="root";
		String Password="root";
		String Sql="create table ibrahim(Student_id int primary key,First_Name varchar(50),"
				+ "Last_Name varchar(50),Adderess varchar(50),"
				+ "Mob_No varchar(10),Email varchar(50));";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(Url,UserName ,Password );
			Statement stmt = con.createStatement();
			stmt.executeUpdate(Sql);
			System.out.println("Table has been Created Successfully");
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
