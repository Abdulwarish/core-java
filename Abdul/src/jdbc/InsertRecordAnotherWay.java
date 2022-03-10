package jdbc;
import java.sql.*;
public class InsertRecordAnotherWay {

	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/jdbc";
		String UserName="root";
		String Password="admin";
		Connection con=null;
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(URL, UserName, Password);
			stmt=con.createStatement();
			String InsertRecord1="insert into Student values(57,'jay','basti','Baghnagar','91616161','asassdsa23@gmail.com');";
			String InsertRecord2="insert into Student values(58,'suraj','basti','Baghnagar','91616161','asassdsa23@gmail.com');";
			String InsertRecord3="insert into Student values(59,'nasru','basti','Baghnagar','91616161','asassdsa23@gmail.com');";
			String InsertRecord4="insert into Student values(60,'saifullah','basti','Baghnagar','91616161','asassdsa23@gmail.com');";
			String InsertRecord5="insert into Student values(61,'basit','basti','Baghnagar','91616161','asassdsa23@gmail.com');";
			String InsertRecord6="insert into Student values(62,'wahid','basti','Baghnagar','91616161','asassdsa23@gmail.com');";
			String InsertRecord7="insert into Student values(63,'Abatin','basti','Baghnagar','91616161','asassdsa23@gmail.com');";

			stmt.addBatch(InsertRecord1);
			stmt.addBatch(InsertRecord2);
			stmt.addBatch(InsertRecord3);
			stmt.addBatch(InsertRecord4);
			stmt.addBatch(InsertRecord5);
			stmt.addBatch(InsertRecord6);
			stmt.addBatch(InsertRecord7);
			stmt.executeBatch();
			System.out.println("Record Successfully inserted");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
