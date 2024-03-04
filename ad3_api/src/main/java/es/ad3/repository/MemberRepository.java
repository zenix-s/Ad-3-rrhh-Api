package es.ad3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.ad3.model.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{
	
}
