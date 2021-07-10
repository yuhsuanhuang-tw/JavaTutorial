/**
 * Auther: Yu-Hsuan Huang
 * Date: 2021-07-08
 * 
 * Step 1: Create a 'DatabaseConnectionManager' class
 * Step 2: Init connection information for database
 * Step 3: Use DriverManager to get the database connection
 * 
 */
package pers.sample.jdbc.tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnctionManager {

	private final String url;
	private final Properties properties;
	
	public DatabaseConnctionManager(String host, String databaseName, String username, String password) {
		//The connection statement depend on which database you are use
		//Ex. postgreSQL -> "jdbc:postgresql://... ..."
		this.url = "jdbc:mysql://" + host + "/" + databaseName + "?autoReconnect=true&useSSL=false";// + "?serverTimezone=UTC";
		
		
		//set user and password to properties
		this.properties = new Properties();
		this.properties.setProperty("user", username);
		this.properties.setProperty("password", password);
	}
	
	// connection
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, this.properties);
	}
}
