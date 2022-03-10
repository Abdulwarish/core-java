package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Select {
	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/jdbc";
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(URL, "root", "admin");
		Statement st=con.createStatement();
		String query1 = "select * from Student";
		ResultSet rs=st.executeQuery(query1); 
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			}
		con.close();
		}catch(Exception e){
			System.out.println("Query executed");
		}
		}
	}