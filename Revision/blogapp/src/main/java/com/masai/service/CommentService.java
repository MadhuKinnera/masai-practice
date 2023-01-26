package com.masai.service;

import java.util.List;

import com.masai.exception.CommentException;
import com.masai.exception.PostException;
import com.masai.model.Comment;
import com.masai.model.CommentDTO;

public interface CommentService {
	
	List<CommentDTO> getCommentByPostId(Integer id) throws CommentException,PostException;
	
	CommentDTO getCommentByPostIdAndCommentId(Integer pid,Integer cid)throws PostException,CommentException;
	
	Comment postCommentToPost(Integer id,CommentDTO comm)throws PostException;
	
	Comment updateCommentByPidAndCid(Integer pid,Integer cid,CommentDTO comm)throws PostException,CommentException;
	
	Comment deleteCommentByPidAndCid(Integer pid,Integer cid)throws PostException,CommentException;

}
