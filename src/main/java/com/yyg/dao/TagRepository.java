package com.yyg.dao;

import com.yyg.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName：TagRepository
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/9/27 19:30
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}
