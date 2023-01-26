package com.masai.service;

import java.util.List;

import com.masai.exception.PostException;
import com.masai.model.Post;

public interface PostService {

	List<Post> getPosts() throws PostException;
	
	Post getPostById(Integer id) throws PostException;
	
	Post createPost(Post post)throws PostException;
	
	Post updatePost(Integer id,Post post) throws PostException;
	
	Post deletePost(Integer id) throws PostException;
}
