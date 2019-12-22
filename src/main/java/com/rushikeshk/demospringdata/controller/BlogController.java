package com.rushikeshk.demospringdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rushikeshk.demospringdata.model.Blog;
import com.rushikeshk.demospringdata.service.BlogService;

@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@GetMapping("/blog/post")
	public Blog saveBlog()
	{
		return new Blog();
	}
	
	@PostMapping("/blog/savepost")
	public Blog saveBloginfo(@RequestBody Blog user)
	{
		
		return blogService.saveInfo(user);
	}
	
	
	@GetMapping("/blog/allusers")
	public List<Blog> listOfUsers()
	{
		
		return blogService.allUsers();
	}
	
	// delete a blog
	@DeleteMapping("/delete/{blogId}")
	public void deleteBlog(@PathVariable("blogId") Integer id)
	{
		blogService.deleteBlog(id);
	}
	
	//update blog
	@PutMapping("/update/{id}")
	public Blog updateBlog(@PathVariable("id") long id, @RequestBody Blog blog)
	{
		return blogService.updateBlogInfo(blog);
	}
}
