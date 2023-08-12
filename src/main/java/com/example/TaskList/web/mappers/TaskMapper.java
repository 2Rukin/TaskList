package com.example.TaskList.web.mappers;

import com.example.TaskList.domain.task.Task;
import org.mapstruct.Mapper;
import com.example.TaskList.web.dto.task.TaskDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto dto);
}
