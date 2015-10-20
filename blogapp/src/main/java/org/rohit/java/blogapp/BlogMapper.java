package org.rohit.java.blogapp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BlogMapper implements RowMapper<Blogs>
	{

		public Blogs mapRow(ResultSet resultSet, int rowNum) throws SQLException
		{
			// TODO Auto-genec rated method stub
			Blogs blgs = new Blogs();
			blgs.setPostId(resultSet.getInt("POST_ID"));
            blgs.setBlogTitle(resultSet.getString("BLOG_TITLE"));
            blgs.setPostContent(resultSet.getString("POST_CONTENT"));
            blgs.setPostedOn(resultSet.getString("POSTED_ON"));
            blgs.setAuthorId(resultSet.getInt("AUTHOR_ID"));
            return blgs;
          
			        }
	
		
	}
	
