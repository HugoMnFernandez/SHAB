package com.revature.dao;

import java.util.List;

import com.revature.pojo.Battle;
import com.revature.pojo.Comment;

public interface CommentDao {

	public Integer makeComment(Comment c);
	
	public Comment getComentById(int id);
	
	public void removeComment(Comment c);
	
	public List<Comment> getCommentsByBattle(Battle battle);
	
}
