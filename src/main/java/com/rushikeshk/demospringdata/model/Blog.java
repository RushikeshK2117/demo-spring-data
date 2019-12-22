package com.rushikeshk.demospringdata.model;

import javax.persistence.Id;

public class Blog {

	@Id
	private int blogId;
	private String blogName;
	private String blogInfo;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogInfo() {
		return blogInfo;
	}
	public void setBlogInfo(String blogInfo) {
		this.blogInfo = blogInfo;
	}
	
}
