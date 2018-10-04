package net.shareclub.service.impl;

import net.shareclub.bean.User;
import net.shareclub.mapper.UserMapper;
import net.shareclub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
