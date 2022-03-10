package InterviewProgran;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureCall{

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.Oracle.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			CallableStatement stmt=con.prepareCall("{call INSERTR(?,?)}");
			stmt.setInt(1, 102);
			stmt.setString(2, "Abdul Waris");
			stmt.execute();
			System.out.println("Successful");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

