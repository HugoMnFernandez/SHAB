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
		sess = SessionUtil.getSession();
		Transaction trans = sess.beginTransaction();
		Integer newId = (Integer) sess.save(c) ;
		trans.commit();
		 sess.close();
		 return newId;
	}

	public Comment getComentById(int id) {
		sess = SessionUtil.getSession();
		Comment c = sess.get(Comment.class, id);
		sess.close();
		return c;
	}

	public void removeComment(Comment c) {
		sess = SessionUtil.getSession();
		Transaction trans = sess.beginTransaction();
		sess.delete(c);
		trans.commit();
		sess.close();
	}

	public List<Comment> getCommentsByBattle(Battle battle) {
		sess = SessionUtil.getSession();
		Query<Comment> query = sess.createQuery("from Comment AS c WHERE c.battle = :battle");
		query.setParameter("battle", battle);
		List<Comment> comments = query.list();
		sess.close();
		return comments;
	}

}
