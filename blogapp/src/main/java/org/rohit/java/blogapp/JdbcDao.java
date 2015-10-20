package org.rohit.java.blogapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcDao {

    String str;
    @Autowired
    private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Integer getName() throws ClassNotFoundException 
	{
		//validateUser(u);
		Connection conn = null;
		ResultSet resultSet = null;
		
	   
		String sql = "SELECT COUNT(*) FROM TEST";
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(sql, Integer.class);
		
//		return str;
		
			}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM USER";
		jdbcTemplate.setDataSource(getDataSource());
	    return jdbcTemplate.query(sql, new UserMapper());
		
	 	} 

	
	
	public List<Blogs> getPosts(String name) {
	    String Sql2 = "SELECT A.* FROM POSTS AS A JOIN USER AS B ON A.AUTHOR_ID = B.USER_ID WHERE B.USER_NAME = ?";
		jdbcTemplate.setDataSource(getDataSource());
	    return  jdbcTemplate.query(Sql2, new Object[]{name}, new BlogMapper());
	}

	public void insertUser(User user)
	{
		User user = new User();
		String Sql3 = ("INSERT INTO USER VALUES(?,?,?,?)");
		
		jdbcTemplate.update(Sql3, new Object[] {user.getId(),user.getName(),user.getUserName(),user.getPassword()});
	}

	
	}
