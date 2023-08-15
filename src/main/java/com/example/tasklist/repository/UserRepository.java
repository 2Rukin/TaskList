package com.example.tasklist.repository;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;
@Mapper
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
    void insertUserRole(@Param("userID")Long userId, @Param("role")Role role);

    //Task owner то есть этот метод будет проверять является ли пользователь с ID

    boolean isTaskOwner(@Param("userID")Long userId, @Param("taskId")Long taskId);

    void delete(Long id);

}
