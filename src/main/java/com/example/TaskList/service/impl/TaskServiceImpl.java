package com.example.TaskList.service.impl;

import com.example.TaskList.service.TaskService;
import com.example.TaskList.domain.task.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAHByUserId(Long id) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Task> getAllByUserId(Long id) {
        return null;
    }
}
