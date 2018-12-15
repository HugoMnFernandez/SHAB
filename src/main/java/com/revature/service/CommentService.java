package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.CommentDao;
import com.revature.pojo.Comment;

@Service
public class CommentService {

	@Autowired
	CommentDao cDao;
	
	public Integer createComment(Comment c) {
		return cDao.makeComment(c);
	}
	
	public Comment getCommentById(int id) {
		return cDao.getComentById(id);
	}
	
	public void delteComment(Comment c) {
		cDao.removeComment(c);
	}
	
	
}
