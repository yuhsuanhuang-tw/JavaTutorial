package pers.sample.jdbc.tutorial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pers.sample.jdbc.tutorial.model.User;
import pers.sample.jdbc.tutorial.util.DataAccessObject;

public class UserDAO extends DataAccessObject<User> {
	//basic
	private static final String INSERT = "INSERT INTO user (name) VALUES (?)"; 
	private static final String GET_ONE = "SELECT id, name FROM user WHERE id = ?";
	private static final String UPDATE = "UPDATE user SET name = ? WHERE id = ?";
	private static final String DELETE = "DELETE FROM user WHERE id = ?";
	//extra
	private static final String GET_LIMIT = "SELECT id, name FROM user ORDER BY name LIMIT ?";
	private static final String GET_PAGED = "SELECT id, name FROM user ORDER BY name LIMIT ? OFFSET ?";

	public UserDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public User findById(long id) {
		User user = new User();
		try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
			statement.setLong(1, id);
			
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User dto) {
		User user = null;
		/*
		 * This part is for transaction (Commits / Rollback)
		 */
		try {
			this.connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		/*
		 * 
		 */
		
		
		try (PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
			statement.setString(1, dto.getName());
			statement.setLong(2, dto.getId());
			statement.execute();
			
			//transacrion part - commit
			this.connection.commit();
			
			user = this.findById(dto.getId());
		} catch (SQLException e) {
			
			//transacrion part - rollback
			try {
				this.connection.rollback();
			} catch(SQLException er) {
				er.printStackTrace();
				throw new RuntimeException();
			}
			
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		return user;
	}

	@Override
	public User create(User dto) {
		try (PreparedStatement statement = this.connection.prepareStatement(INSERT);){
			statement.setString(1, dto.getName());
			
			statement.execute();
			
			return null; //TODO return object or id
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Override
	public void delete(long id) {
		try (PreparedStatement statement = this.connection.prepareStatement(DELETE);){
			statement.setLong(1, id);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	
	public List<User> findAllSorted(int limit) {
		List<User> users = new ArrayList<>();
		
		try (PreparedStatement statement = this.connection.prepareStatement(GET_LIMIT);){
			statement.setInt(1, limit);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("name"));
				users.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return users;
	}
	
	
	public List<User> findPagedSorted(int limit, int pageNumber) {
		List<User> users = new ArrayList<>();
		int offset = ( (pageNumber-1) * limit);
		
		try (PreparedStatement statement = this.connection.prepareStatement(GET_PAGED);){
			if(limit < 1) {
				offset = 10;
			}
			
			statement.setInt(1, limit);
			statement.setInt(2, offset);
			System.out.println(statement.toString());
			
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("name"));
				users.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return users;
	}

}
