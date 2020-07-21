/**
 * @author hsuanhuang
 * 
 * Use JDBC connect to MySQL database.
 * 
 *  following these sql to create databse:
 *  		CREATE DATABASE IF NOT EXISTS test;
 *  		USE test;
 *  		DROP TABLE IF EXISTS test_table;
 *  		CREATE TABLE test_table(	id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50)); 
 * 	
 * 	Import JDBC driver library to build.gradle file: (if using Maven, you also need import JDBC driver to your configuration file)
 * 		Gradle:		
 * 			// https://mvnrepository.com/artifact/mysql/mysql-connector-java
 * 			compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.19'
 * 		Maven:
 * 			<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
 * 			<dependency>
 * 				<groupId>mysql</groupId>
 * 				<artifactId>mysql-connector-java</artifactId>
 * 				<version>8.0.19</version>
 * 			</dependency>
 * 
 */
package pers.sample.tutorial;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTester {
	
	public static void main(String[] argc) throws Exception {
		//Connect to the db
		Connection conn = ConnectDB.getConnection();
		
		//Creates a Statement object for sending SQL statements to the database
		Statement sta = conn.createStatement();
		
		//Test insert statement
		try{
			String name = "Sean";
			String ins = "INSERT INTO test_table(name)" + "VALUES ('"+name+"')";
			sta.executeUpdate(ins);
		}catch(SQLException e){
			e.printStackTrace();
		}
			
		ShowData();
	}
	
	/**
	 * Query data from db
	 * @throws SQLException
	 */
	public static void ShowData() throws SQLException{
		//Connect to the db
		Connection conn = ConnectDB.getConnection();
		
		//Creates a Statement object for sending SQL statements to the database
		Statement smt = conn.createStatement();
		
		
		ResultSet rs = smt.executeQuery("SELECT * FROM test_table");
		while(rs.next()){
			String data = "id: " + rs.getString("id") + ",name: " + rs.getString("name");
			System.out.println(data);
		}
		
		//Released statement resources
		smt.close();
		
		//Released DB resources
		conn.close();
	}
}
