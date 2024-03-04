package es.ad3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.ad3.model.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
