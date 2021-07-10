/**
 * Author: Yu-Hsuan Huang
 * Date 2021-07-08 
 */

package pers.sample.jdbc.tutorial;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import pers.sample.jdbc.tutorial.dao.UserDAO;
import pers.sample.jdbc.tutorial.model.User;

public class JDBCExecutor {

	public static void main(String[] args) {
		//Sample 1 - Test Connection
//		testConnection();
		
		//Sample 2 - Test Creating a new Data using DAO
//		createData();
		
		//Sample 3 - Test Getting data by ID
//		readData(1);
		
		//Sample 4 - Test Updating data
//		updateData();
		
		//Sample 5 - Test Deleting data
//		testConnection(); //count total
//		deleteData(10);
//		testConnection(); //count total
		
		//Sample 6 - Limit results
//		limitData(3);
		
		//Sample 7 - Page results
		pageData(3, 1);
		pageData(3, 2);
		pageData(6, 1);
	}
	
	/**
	 * Sample 1 - Test Connection 
	 */
	public static void testConnection() {
		//instantiate database connection manager object
		DatabaseConnctionManager dcm = new DatabaseConnctionManager("localhost", "jdbc_tutorial", "root", "1qaz!QAZ");
		
		//test connect
		try {
			Connection connection = dcm.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM USER");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Sample 2 - create util (1. DataTransferObject, 2. DataAccessObject), model (User) and DAO (UserDAO), then useing the DAO to create a new data
	 */
	public static void createData() {
		//instantiate database connection manager object
		DatabaseConnctionManager dcm = new DatabaseConnctionManager("localhost", "jdbc_tutorial", "root", "1qaz!QAZ");
		
		
		try {
			Connection connection = dcm.getConnection();
			UserDAO userDAO = new UserDAO(connection);
			User user = new User();
			user.setName("Bob");
			
			userDAO.create(user);
			System.out.println("Finished adding...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Sample 3 - get data by id
	 */
	public static void readData(int id) {
		//instantiate database connection manager object
		DatabaseConnctionManager dcm = new DatabaseConnctionManager("localhost", "jdbc_tutorial", "root", "1qaz!QAZ");
		
		try {
			Connection connection = dcm.getConnection();
			UserDAO userDAO = new UserDAO(connection);
			User user = userDAO.findById(id);
			
			System.out.println(user.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Sample 4 - update data
	 */
	public static void updateData() {
		//instantiate database connection manager object
		DatabaseConnctionManager dcm = new DatabaseConnctionManager("localhost", "jdbc_tutorial", "root", "1qaz!QAZ");
		
		try {
			Connection connection = dcm.getConnection();
			UserDAO userDAO = new UserDAO(connection);
			User user = userDAO.findById(10);
			System.out.println("Before:\t" + user.toString());
			
			user.setName("Emily");;
			
			user = userDAO.update(user);
			System.out.println("After:\t" + user.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Sample 5 - deleting data
	 */
	public static void deleteData(int id) {
		//instantiate database connection manager object
		DatabaseConnctionManager dcm = new DatabaseConnctionManager("localhost", "jdbc_tutorial", "root", "1qaz!QAZ");
		
		try {
			Connection connection = dcm.getConnection();
			UserDAO userDAO = new UserDAO(connection);
			userDAO.delete(id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	/**
	 * Sample 6 - Limiting results
	 */
	public static void limitData(int limit) {
		//instantiate database connection manager object
		DatabaseConnctionManager dcm = new DatabaseConnctionManager("localhost", "jdbc_tutorial", "root", "1qaz!QAZ");
		
		try {
			Connection connection = dcm.getConnection();
			UserDAO userDAO = new UserDAO(connection);
			List<User> users = userDAO.findAllSorted(limit);
			
			for(User user: users) {
				System.out.println(user.toString());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Sample 7 - Paging results
	 */
	public static void pageData(int limit, int pageNumber) {
		//instantiate database connection manager object
		DatabaseConnctionManager dcm = new DatabaseConnctionManager("localhost", "jdbc_tutorial", "root", "1qaz!QAZ");
		
		try {
			Connection connection = dcm.getConnection();
			UserDAO userDAO = new UserDAO(connection);
			List<User> users = userDAO.findPagedSorted(limit, pageNumber);
			
			for(User user: users) {
				System.out.println(user.toString());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
