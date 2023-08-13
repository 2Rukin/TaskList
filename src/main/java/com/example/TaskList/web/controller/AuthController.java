package com.example.TaskList.web.controller;


import com.example.TaskList.domain.user.User;
import com.example.TaskList.service.AuthService;
import com.example.TaskList.service.UserService;
import com.example.TaskList.web.dto.auth.JwtRequest;
import com.example.TaskList.web.dto.auth.JwtResponse;
import com.example.TaskList.web.dto.user.UserDto;
import com.example.TaskList.web.dto.validation.OnCreate;
import com.example.TaskList.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Validated
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    private final UserMapper userMapper;

    @PostMapping("/login")
    public JwtResponse login(@Validated @RequestBody JwtRequest loginRequest) {
        return authService.login(loginRequest);
    }

    @PostMapping("/register")
    public UserDto register(@Validated(OnCreate.class)
                            @RequestBody  UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        User createdUser = userService.create(user);
        return userMapper.toDto(createdUser);
    }

    @PostMapping("/refresh")
    public JwtResponse refresh(@RequestBody  String refreshToken) {
        return authService.refresh(refreshToken);
    }
/*
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
//        ProblemDetail problemDetail = new ProblemDetail(4001); // Пример: создание объекта ProblemDetail
        ErrorResponse errorResponse = new ErrorResponse("Validation Error", errorMessage,);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

 */

}
