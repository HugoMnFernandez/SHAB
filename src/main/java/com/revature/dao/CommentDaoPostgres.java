package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.revature.pojo.Battle;
import com.revature.pojo.Comment;
import com.revature.util.SessionUtil;

@Component
public class CommentDaoPostgres implements CommentDao{

	Session sess = SessionUtil.getSession();
	
	public Integer makeComment(Comment c) {
		return (Integer) sess.save(c);
	}

	public Comment getComentById(int id) {
		return sess.get(Comment.class, id);
	}

	public void removeComment(Comment c) {
		Transaction trans = sess.beginTransaction();
		sess.delete(c);
		trans.commit();
	}

	public List<Comment> getCommentsByBattle(Battle battle) {
		
		Query<Comment> query = sess.createQuery("from Comment AS c WHERE c.battle = :battle");
		query.setParameter("battle", battle);
		List<Comment> comments = query.list();
		return comments;
	}

}
