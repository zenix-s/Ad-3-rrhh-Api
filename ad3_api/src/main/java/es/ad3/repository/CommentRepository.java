package es.ad3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.ad3.model.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{
	
}
