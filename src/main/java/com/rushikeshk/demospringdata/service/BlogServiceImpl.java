package com.rushikeshk.demospringdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rushikeshk.demospringdata.model.Blog;
import com.rushikeshk.demospringdata.repository.BlogRepository;

public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogRepository blogRepository;

	@Override
	public Blog saveInfo(Blog user) {
		return blogRepository.save(user);
	}

	@Override
	public List<Blog> allUsers() {
		return blogRepository.findAll();
	}

	@Override
	public void deleteBlog(Integer id) {
		blogRepository.deleteById(id);
		
	}

	@Override
	public Blog updateBlogInfo(Blog blog) {
		return blogRepository.save(blog);
	}

}
