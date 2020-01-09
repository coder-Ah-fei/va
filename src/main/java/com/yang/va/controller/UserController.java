package com.yang.va.controller;

import com.yang.va.dto.UserDto;
import com.yang.va.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/list")
    public List<UserDto> userList(){
        List<UserDto> userDtoList = userService.listUsers();
        return userDtoList;
    }

}
