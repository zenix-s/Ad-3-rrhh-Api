package es.ad3.service;

import java.util.List;

import es.ad3.model.entity.Comment;

public interface CommentService {

	List<Comment> getCommentsMember(int idMember);
	List<Comment> getCommentsUser(int idUser);
	Comment newComment(Comment comment);
	Comment getComment(int id);
	Comment updateComment(Comment comment);
	boolean deleteComment(int id);

}
