package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.PostException;
import com.masai.model.Post;
import com.masai.service.PostService;


@RestController
public class PostController {
	
	@Autowired
	private PostService pService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Madhu";
	}
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getAllPostsHandler() throws PostException{
	return new ResponseEntity<List<Post>>(pService.getPosts(),HttpStatus.OK);	
	}
	@GetMapping("/posts/{id}")
	public ResponseEntity<Post> getPostByIdHandler(@PathVariable("id") Integer id) throws PostException{
		return new ResponseEntity<Post>(pService.getPostById(id),HttpStatus.OK);
	}
	
	@PostMapping("/posts")
	public ResponseEntity<Post> createPostHandler(@RequestBody  @javax.validation.Valid Post post) throws PostException{
		return new ResponseEntity<Post>(pService.createPost(post),HttpStatus.CREATED);
	}
	
	@PutMapping("/posts/{id}")
	public ResponseEntity<Post> updatePostHandler(@PathVariable("id") Integer id,@RequestBody @javax.validation.Valid Post post) throws PostException{
		return new ResponseEntity<Post>(pService.updatePost(id, post),HttpStatus.OK);
	}
	
	@DeleteMapping("/posts/{id}")
	public ResponseEntity<Post> deletePostHandler(@PathVariable("id") Integer id) throws PostException{
		return new ResponseEntity<Post>(pService.deletePost(id),HttpStatus.OK);
	}
	
	
	

}
