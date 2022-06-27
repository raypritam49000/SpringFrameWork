package services;

import java.util.List;

import org.springframework.stereotype.Repository;

import entities.User;

@Repository
public interface UserService {
	void add(User user);
    List<User> listUsers();
}