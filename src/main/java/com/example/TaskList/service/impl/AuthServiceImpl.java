package com.example.TaskList.service.impl;

import com.example.TaskList.service.AuthService;
import org.springframework.stereotype.Service;
import web.dto.auth.JwtRequest;
import web.dto.auth.JwtResponse;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
