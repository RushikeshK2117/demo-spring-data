package com.rushikeshk.demospringdata.service;

import java.util.List;

import com.rushikeshk.demospringdata.model.Blog;

public interface BlogService {

	Blog saveInfo(Blog user);

	List<Blog> allUsers();

	void deleteBlog(Integer id);

	Blog updateBlogInfo(Blog blog);

}
