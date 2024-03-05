package es.ad3.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/comment")
public class RestComment {
	@GetMapping("/hola")
	public ResponseEntity<String> hola() {
		return ResponseEntity.status(418).body("Hola");
	}
}
