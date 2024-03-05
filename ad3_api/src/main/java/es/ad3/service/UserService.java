package es.ad3.service;

import es.ad3.model.entity.User;

public interface UserService {
	User getUser(int id);
  User getUser(String username);	
	User newUser(User user);
	User updateUser(User user);
	boolean deleteUser(int id);
}