package com.yyg.service.impl;

import com.yyg.dao.UserRepository;
import com.yyg.po.User;
import com.yyg.service.UserService;
import com.yyg.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName：UserServiceImpl
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/9/25 19:57
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
