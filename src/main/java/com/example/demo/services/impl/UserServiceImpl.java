package com.example.demo.services.impl;

import com.example.demo.authentication.JwtUtil;
import com.example.demo.models.UserModel;
import com.example.demo.models.dto.requests.UserCreateRequest;
import com.example.demo.models.dto.response.ApiResponse;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ApiResponse<String> registerUser(UserCreateRequest userCreateRequest) {
        UserModel userModel = modelMapper.map(userCreateRequest, UserModel.class);
        userModel.setPassword(passwordEncoder.encode(userCreateRequest.getPassword()));
        UserModel userModel1 = userRepository.save(userModel);
        String token = jwtUtil.createJwtToken(userModel1.getId(), userModel1.getRole().name());
        return new ApiResponse<>(HttpStatus.OK, "Registered successfully", token);
    }
}
