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

import com.masai.exception.CommentException;
import com.masai.exception.PostException;
import com.masai.model.Comment;
import com.masai.model.CommentDTO;
import com.masai.service.CommentService;

@RestController
public class CommentController {
	
	@Autowired
    private	CommentService cservice;
	
	@GetMapping("/posts/{id}/comments")
	public ResponseEntity<List<CommentDTO>> getAllCommentsHandler(@PathVariable("id") Integer id) throws CommentException, PostException{
		return new ResponseEntity<List<CommentDTO>>(cservice.getCommentByPostId(id),HttpStatus.OK);
	}
	
	@GetMapping("/posts/{pid}/comments/{cid}")
	public ResponseEntity<CommentDTO> getCommentByIdsHandler(@PathVariable("pid") Integer pid,@PathVariable("cid") Integer cid) throws PostException, CommentException{
		return new ResponseEntity<CommentDTO>(cservice.getCommentByPostIdAndCommentId(pid, cid),HttpStatus.OK);
	}
	@PostMapping("/posts/{id}/comments")
	public ResponseEntity<Comment> postCommentHandler(@PathVariable("id") Integer id,@RequestBody CommentDTO comm) throws PostException{
		return new ResponseEntity<Comment>(cservice.postCommentToPost(id, comm),HttpStatus.CREATED);
	}
	
	@PutMapping("/posts/{pid}/comments/{cid}")
	public ResponseEntity<Comment> updateCommentHandler(@PathVariable("pid") Integer pid,@PathVariable("cid") Integer cid,@RequestBody CommentDTO comm) throws PostException, CommentException{
		return new ResponseEntity<Comment>(cservice.updateCommentByPidAndCid(pid, cid, comm),HttpStatus.OK);
	}
	@DeleteMapping("/posts/{pid}/comments/{cid}")
	public ResponseEntity<Comment> deleteCommentHandler(@PathVariable("pid") Integer pid,@PathVariable("cid") Integer cid) throws PostException, CommentException{
		return new ResponseEntity<Comment>(cservice.deleteCommentByPidAndCid(pid, cid),HttpStatus.OK);
	}
	

}
