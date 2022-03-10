package JdbcDemo;
import java.sql.*;
public class FetchDetials {

	public static void main(String[] args) throws SQLException {
		String URL="jdbc:mysql://localhost:3307/jdbc";
		String USER="root";
		String PASS="root";
		String SQL="select * from studentregister";
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(URL, USER, PASS);
			Statement stmt=con.createStatement();
			stmt.executeQuery(SQL);
			ResultSet rs=stmt.executeQuery(SQL);
			while(rs.next()) {
				System.out.println("["+rs.getInt(1)+"]  ["+rs.getString(2)+"]  ["+rs.getString(3)+"]  ["+rs.getString(4)+"]  ["+rs.getString(5)+"]");
			}
			con.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
