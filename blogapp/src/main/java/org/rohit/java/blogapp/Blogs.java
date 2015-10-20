package org.rohit.java.blogapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Blogs  {
	
	public int postId;
	public String blogTitle;
	public String postContent;
    public String postedOn;
	public int authorId;
	
	public Blogs()
	{
		
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public String getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(String postedOn) {
		this.postedOn = postedOn;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	
	
}
