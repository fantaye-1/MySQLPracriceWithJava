package practiceOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class MySQLPracticeOne {

	public MySQLPracticeOne() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// practice MySQL and post it to github.
		String url = "jdbc:mysql://localhost:3306/sakila";
		String userName = "root";
		String password = "root";
		Properties info = new Properties();
		info.put("user", "root"); 
		info.put("password", "root");		
		Connection dbConnection = null;
		
		try { 			
			dbConnection = DriverManager.getConnection(url, userName,password);
			if (dbConnection != null) 
			{ 
				System.out.println("Successfully connected to MySQL database test"); 
				Statement stmt = dbConnection.createStatement();
				
				//int count = stmt.executeUpdate("UPDATE actor SET first_name = ED WHERE student_id = 2");

			} 
		} catch (SQLException ex) 
			{ 
				System.out.println("An error occurred while connecting MySQL databse");
				ex.printStackTrace(); 
			}
		//Read more: https://javarevisited.blogspot.com/2016/09/javasqlsqlexception-no-suitable-driver-mysql-jdbc-localhost.html#ixzz6Ouu0XunU
		
	
	}

}
