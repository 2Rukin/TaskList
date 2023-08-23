package com.example.tasklist.web.mappers;

import com.example.tasklist.domain.task.Task;
import org.mapstruct.Mapper;
import com.example.tasklist.web.dto.task.TaskDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper extends Mappable<Task,TaskDto> {

}
