package com.yang.va.service.impl;

import com.yang.va.dao.UserDao;
import com.yang.va.dto.UserDto;
import com.yang.va.entity.User;
import com.yang.va.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<UserDto> listUsers() {
        List<User> userList = userDao.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        UserDto userDto;
        for (User user : userList) {
            userDto = new UserDto();
            BeanUtils.copyProperties(user, userDto);
            userDtoList.add(userDto);
        }
        return userDtoList;
    }
}
