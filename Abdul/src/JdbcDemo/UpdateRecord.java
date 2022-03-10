package JdbcDemo;
import java.sql.*;
public class UpdateRecord {

	public static void main(String[] args) throws SQLException {
		String URL="jdbc:mysql://localhost:3306/crudeDemo";
		String USER="root";
		String PASS="admin";
		String sql="update studentregister set Adderess = 'Baghnagar' where id=3";
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(URL, USER, PASS);
			Statement st=con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Record Succcesfully updated");
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
