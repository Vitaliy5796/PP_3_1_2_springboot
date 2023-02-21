package ru.sidorov.springboot.service;

import ru.sidorov.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOne(Long id);
    void save(User user);
    void update(Long id, User updateUser);
    void delete(Long id);

}
