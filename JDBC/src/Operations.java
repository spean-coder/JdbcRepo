import java.sql.*;
import java.util.Scanner;

public class Operations {
	
	Statement st;
	PreparedStatement psmt;
	
	// Connection Method
	public static Connection connect() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String uname = "root";
		String pass = "Shubham@0498";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return con;
		
	}
	// Create table Method
	public String createTable(String query) throws SQLException {
		
		st = Operations.connect().createStatement();
		
		st.executeUpdate(query);
		
		return "Table has been created successfully ";
		
	}
	
	// Fetch all the Record Method
	public void printResult(String query) throws SQLException {
		
		String rows = "";
		
		Operations.connect();
		
		psmt = Operations.connect().prepareStatement(query);
		
		ResultSet rs = psmt.executeQuery();
		while(rs.next()) {
		rows = rs.getInt(1) + ":" + rs.getString(2)+ ":" + rs.getString(3) +":" + rs.getDate(4) + ":" + rs.getInt(5);
		System.out.println(rows);
		}
	}
	
	//Update Record Method
	
	public void updateEntry(String query) throws SQLException {
		psmt = Operations.connect().prepareStatement(query);
		
		int count = psmt.executeUpdate();
		
		System.out.println(count + " row's affected");
	}
	
	// Delete Record Method
	public void deleteEntry(String query) throws SQLException {
		
		psmt = Operations.connect().prepareStatement(query);
		
		int count = psmt.executeUpdate();
		
		System.out.println(count + " row/s deleted successfully");
		
	}
	//Drop table
	public String dropTable(String query) throws SQLException {
		
		st = Operations.connect().createStatement();
		
		st.executeUpdate(query);
		
		return "Table has been dropped successfully";
	}
	//insert into table
	public String InsertEntry(String query) throws SQLException {
		psmt = Operations.connect().prepareStatement(query);
		
		int count = psmt.executeUpdate();
		
		return count + " row/s inserted.";
		
	}

	
	
	
}
