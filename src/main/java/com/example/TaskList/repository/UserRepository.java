package com.example.TaskList.repository;

import com.example.TaskList.domain.user.Role;
import com.example.TaskList.domain.user.User;

import java.util.Optional;

public interface UserRepository {


    Optional<User> findById(Long id);

    //дл проверки во время реги и чтобы секьюрити мог авторизовать
    Optional<User> findByUsername(String username);

    //будет сохранять  в базу если пользователь уже есть ,
    void update(User user);

    // будет принимать юзера , база будет сетать ид и это ид уже будет засетано в юзер , нет необходимости возвразать какойто обххект
    // а он уже сразу засетается
    void create(User user);

    // т.е. при реги пользователь получает роль и она должна сохраниться
    void insertUserRole(Long userId, Role role);

    //Task owner то есть этот метод будет проверять является ли пользователь с ID

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);

}
