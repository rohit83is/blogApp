package org.rohit.java.blogapp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


	public class UserMapper implements RowMapper<User>
	{

		public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			User usr = new User();
			usr.setId(resultSet.getInt("USER_ID"));
			usr.setName(resultSet.getString("USER_NAME"));
			usr.setUserName(resultSet.getString("USERNAME"));
			usr.setPassword(resultSet.getString("PASSWORD"));
			System.out.println(usr.getName());
			return usr;
			
		}
		
	}



