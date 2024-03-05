package es.ad3.service;

import java.util.List;

import es.ad3.model.entity.Member;

public interface MemberService {
	List<Member> getMembers();
	Member newMember(Member member);
	Member getMember(int id);
	Member updateMember(Member member);
	boolean deleteMember(int id);
}
