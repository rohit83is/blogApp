package org.rohit.java.blogapp;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Path("blogs")
public class BlogApp {

	@GET
	@Path("/users")
	public List<User> findUsers() throws ClassNotFoundException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		JdbcDao dao = context.getBean("jdbcDao",JdbcDao.class);

//		List<User> usrs= dao.getUsers();
	    
	    return dao.getUsers();	
	}
	
	@GET  
	@Path("/users/{user}")  
  	public List<Blogs> showPosts(@PathParam("user") String user)
	{
		 
		
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDao dao = context.getBean("jdbcDao",JdbcDao.class);
		return dao.getPosts(user);
		
	} 	
    @POST
    @Path("/users/adduser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public void createUser(User u)
 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDao dao = context.getBean("jdbcDao",JdbcDao.class);
		dao.insertUser(u);
	}
}
