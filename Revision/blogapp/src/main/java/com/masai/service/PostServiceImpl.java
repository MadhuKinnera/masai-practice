package com.masai.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.PostException;
import com.masai.model.Post;
import com.masai.repository.PostRepo;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostRepo pRepo;

	@Override
	public List<Post> getPosts() throws PostException {
		List<Post> posts = pRepo.findAll();
		
		if(posts.isEmpty())
			throw new PostException("No Posts Found ");
		return posts;
		
	}

	@Override
	public Post getPostById(Integer id) throws PostException {
		Optional<Post> opt = pRepo.findById(id);
		if(opt.isEmpty())
			throw new PostException("Post Not Found with id "+id);
		return opt.get();
	}

	@Override
	public Post createPost(Post post) throws PostException {
		 return pRepo.save(post);
	}

	@Override
	public Post updatePost(Integer id, Post post) throws PostException {
		Optional<Post> opt = pRepo.findById(id);
		if(opt.isEmpty())
			throw new PostException("Post Not Found with id "+id);
		 pRepo.save(post);
		return opt.get();
	}

	@Override
	public Post deletePost(Integer id) throws PostException {
		Optional<Post> opt = pRepo.findById(id);
		if(opt.isEmpty())
			throw new PostException("Post Not Found with id "+id);
		pRepo.deleteById(id);
		return opt.get();
		
	}

}
