package com.yyg.service;

import com.yyg.po.User;

/**
 * ClassName：UserService
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/9/25 19:56
 */
public interface UserService {

    User checkUser(String username, String password);
}
