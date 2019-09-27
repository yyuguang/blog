package com.yyg.dao;

import com.yyg.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName：UserRepository
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/9/25 19:58
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username,String password);
}
