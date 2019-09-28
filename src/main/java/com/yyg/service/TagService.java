package com.yyg.service;

import com.yyg.NotFoundException;
import com.yyg.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * ClassName：TagService
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/9/27 19:27
 */
public interface TagService {

    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTagTop(Integer size);

    List<Tag> listTag(String ids);

    Tag updateTag(Long id,Tag tag) throws NotFoundException;

    void deleteTag(Long id);

    Tag getTagByName(String name); 
}
