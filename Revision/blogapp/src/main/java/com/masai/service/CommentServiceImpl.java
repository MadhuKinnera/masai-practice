package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CommentException;
import com.masai.exception.PostException;
import com.masai.model.Comment;
import com.masai.model.CommentDTO;
import com.masai.model.Post;
import com.masai.repository.CommentRepo;
import com.masai.repository.PostRepo;


@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private PostRepo pRepo;
	@Autowired
	private CommentRepo cRepo;

	@Override
	public List<CommentDTO> getCommentByPostId(Integer id) throws CommentException,PostException {
		 Optional<Post> opt = pRepo.findById(id);
		 
		 if(opt.isEmpty())
			 throw new PostException("Post Not Found With id "+id);
		 List<Comment> comments = opt.get().getComments();
		 
		 if(comments.isEmpty())
			 throw new CommentException("No Comments Found to The Post ");
		 
		 List<CommentDTO> comms = new ArrayList<>();
		 
		 for(int i=0;i<comments.size();i++) {
			 comms.add(new CommentDTO(comments.get(i).getText()));
		 }
		 
		 return comms;
	}
	

	@Override
	public CommentDTO getCommentByPostIdAndCommentId(Integer pid, Integer cid) throws PostException, CommentException {
	  Optional<Post> opt  = pRepo.findById(pid);
	  if(opt.isEmpty())
		  throw new PostException("Post Not Found With Id "+pid);
	  
	  Post post = opt.get();
	  
	  List<Comment> comments = post.getComments();
	  if(comments.isEmpty())
		  throw new CommentException("Comment Not Found with id "+cid);
	  CommentDTO cdto = new CommentDTO();
	  
	 List<Comment> dummy = comments.stream().filter(c->c.getId()==cid).collect(Collectors.toList());
	 if(dummy.isEmpty())
		 throw new CommentException("Comment Not Found with the id "+cid);
	 cdto.setText(dummy.get(0).getText());
	 
	  return cdto;
	  
	  
	}
    @Transactional
	@Override
	public Comment postCommentToPost(Integer id,CommentDTO comm) throws PostException {
		Optional<Post> opt =  pRepo.findById(id);
		if(opt.isEmpty())
			throw new PostException("Post Not Found With id "+id);
		String msg = comm.getText();
		
		 Post post = opt.get();
		 Comment com= cRepo.save(new Comment(msg,post));
		 post.getComments().add(com);
		 
		 return com;
		
		
		
	}

    @Transactional
	@Override
	public Comment updateCommentByPidAndCid(Integer pid, Integer cid,CommentDTO comm) throws PostException, CommentException {
	 Optional<Post> opt =	pRepo.findById(pid);
	 if(opt.isEmpty())
		 throw new PostException("Post Not Found With Id "+pid);
	 
	 Post post = opt.get();
	 
	 List<Comment> comments = post.getComments();
	 
	 comments.stream().filter(c->c.getId()==cid).collect(Collectors.toList()).get(0).setText(comm.getText());
	 
	Optional<Comment> opt2 =  cRepo.findById(cid);
	
	if(opt2.isEmpty())
		throw new CommentException("Comment Not Found with id "+cid);
	
	return opt2.get();
	 
	}

	@Override
	public Comment deleteCommentByPidAndCid(Integer pid, Integer cid) throws PostException, CommentException {
		 Optional<Post> opt =	pRepo.findById(pid);
		 if(opt.isEmpty())
			 throw new PostException("Post Not Found With Id "+pid);
		 
		 Post post = opt.get();
		List<Comment> comments = post.getComments();
		
		 Comment comment = new Comment();
		 
		 for(int i=0;i<comments.size();i++) {
			 if(comments.get(i).getId()==cid) {
				 comment = comments.get(i);
				 break;
			 }
		 }
		  comments.remove(comment);
		  post.setComments(comments);
		  pRepo.save(post);
		 return comment;
		 
	}

}
