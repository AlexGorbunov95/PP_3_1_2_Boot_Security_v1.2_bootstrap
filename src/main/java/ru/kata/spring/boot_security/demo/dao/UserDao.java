package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;


public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User showUser(long id);

    void update(Long id, User user,String roleName);

    void delete(Long id);

    void updateUser(User user);

    User getUserByUsername(String name);

    List<Role> listRole();
    Role showRole(long id);
}
