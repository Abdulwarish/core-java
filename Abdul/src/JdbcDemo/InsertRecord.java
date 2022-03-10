package JdbcDemo;
import java.sql.*;
public class InsertRecord {
	
	public static void main(String[] args) throws SQLException {
		String URL="jdbc:mysql://localhost:3307/jdbc";
		String USER="root";
		String PASS="root";
		String SQL="insert into StudentRegister values(?,?,?,?,?)";
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement stmt=con.prepareStatement(SQL);
			stmt.setInt(1, 2);
			stmt.setString(2, "Saif");
			stmt.setString(3, "Wajid124@gmail.com");
			stmt.setString(4, "Mumbai");
			stmt.setString(5, "972737738");
			stmt.executeUpdate();
			System.out.println("Record Has been Inserted in your table");
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
