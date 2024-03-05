package es.ad3.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ad3.model.entity.Comment;
import es.ad3.model.entity.Member;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/comment")
public class RestComment {
	@GetMapping("/member/{idMember}")
	public ResponseEntity<Comment> CommentsMember(@PathVariable int idMember) {
		Comment comment = new Comment();
		Member member = new Member();
		member.setId(idMember);
		comment.setMember(member);
		return ResponseEntity.status(200).body(comment);
	}
}
