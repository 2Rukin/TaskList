package com.example.TaskList.domain.exeption;

public class ResourceNotFoundExeption extends RuntimeException{
    public ResourceNotFoundExeption(String message) {
        super(message);
    }

}
