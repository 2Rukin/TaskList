package com.example.TaskList.service;

import domain.task.Task;

import java.util.List;

public interface TaskService {
    Task getById(Long id);

    List<Task> getAHByUserId(Long id);

    Task update(Task task);

    Task create(Task task);

    void delete(Long id);
}
