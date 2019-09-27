package com.yyg.dao;

import com.yyg.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName：TypeRepository
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/9/26 19:22
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);
}
