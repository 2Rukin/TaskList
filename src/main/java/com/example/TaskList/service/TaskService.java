package com.example.TaskList.service;

import com.example.TaskList.domain.task.Task;

import java.util.List;

public interface TaskService {
    Task getById(Long id);

    List<Task> getAHByUserId(Long id);

    Task update(Task task);

    Task create(Task task, Long id);

    void delete(Long id);

    List<Task> getAllByUserId(Long id);
}
