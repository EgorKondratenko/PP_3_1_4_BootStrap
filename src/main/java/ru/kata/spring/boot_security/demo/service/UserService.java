package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService{
    void save(User user);
    List<User> listUsers();
    User getUserById(Integer id);
    void update(User updatedUser);
    void delete(Integer id);
    User findUsersByEmail(String username);
    void updateUser(User updateduser, Integer id);
}
