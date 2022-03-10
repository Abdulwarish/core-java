package JdbcDemo;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws SQLException {

		String URL="jdbc:mysql://localhost:3307/jdbc";
		String USER="root";
		String PASS="root";
		String sql="Create Table StudentRegister (ID int PRIMARY KEY,Name varchar(30),Email varchar(30),Adderess varchar(30),MobNo varchar(10));";
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Table SuccessFully Created");
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
