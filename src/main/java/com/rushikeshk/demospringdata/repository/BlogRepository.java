package com.rushikeshk.demospringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushikeshk.demospringdata.model.Blog;

public interface BlogRepository extends JpaRepository<Blog , Integer>{

}
