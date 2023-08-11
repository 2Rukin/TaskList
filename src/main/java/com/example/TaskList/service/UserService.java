package com.example.TaskList.service;

import domain.user.User;

public interface UserService {

    User getById(Long id);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userid, Long taskld);

    void delete(Long id);
}
