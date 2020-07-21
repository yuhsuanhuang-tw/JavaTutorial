package pers.sample.tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	//JDBC driver
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	//Database url
	//Normal 
	//final static String URL = "jdbc:mysql://localhost:3306/test";
	//If have this error "The server time zone value 'EDT' is unrecognized or represents more than one time zone."
	final static String URL = "jdbc:mysql://localhost/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	//Database user name
	final static String USER = "root";
	
	//Database user password
	final static String PASSWORD = "1234";

	
	/**
	 * Connect to the database
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		
		try{
			Class.forName(DRIVER);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			throw new IllegalStateException("fail to class load : " + e.getMessage());
		}
		
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		return con;
	}

}
