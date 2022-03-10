package jdbc;

import java.sql.*;
public class Jdbsinsert {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/jdbc";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, "root", "admin");
			//System.out.println("Queryexecuted");
			PreparedStatement stmt = con.prepareStatement("insert into Student values(?,?,?,?,?,?)");
			stmt.setInt(1, 7);
			stmt.setString(2, "suraj");
			stmt.setString(3, "Waris");
			stmt.setString(4, "Sant Kabir nagar");
			stmt.setString(5, "9161619963");
			stmt.setString(6, "awaris458@gmail.com");
			stmt.executeUpdate();
			System.out.println("Record Inserted");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Query");
		}

	}

}
