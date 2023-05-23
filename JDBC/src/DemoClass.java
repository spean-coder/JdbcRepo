// Java Database Connectivity -> (JDBC)
/*
 * 1. import package --> java.sql.*
 * 2. load and register Driver --> com.mysql.jdbc.Driver
 * 3. Create connection --> Connection interface Obj
 * 4. Create statement -->  Statement interface Obj
 * 5. execute query
 * 6. process the results
 * 7. close 
 * 
 */

// import the Package
import java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws Exception
	{
		Operations op = new Operations();
		
		String query = "insert into employee(emp_id, emp_name,emp_dept, emp_doj, emp_salary) values(103,'Radha','Health','1995-12-25',55000)";
		String query2 = "select * from employee";
		String updatequery = " Update employee" + " SET emp_name = 'Krishan' where emp_id = 103";
		String deletequery = " Delete from employee where emp_id = 13";
		String sql = "DROP TABLE REGISTRATION ";
		String createTable =  "CREATE TABLE REGISTRATION " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))";
		
		
		
		op.printResult(query2);
				
		Operations.connect().close();
		
		
	
		
		
		
		
		
		
	
		
	

	}

}
