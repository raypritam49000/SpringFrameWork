package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entities.User;

@Repository
public interface UserDao {
   void add(User user);
   List<User> listUsers();
}