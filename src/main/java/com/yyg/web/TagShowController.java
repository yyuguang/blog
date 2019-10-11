package com.yyg.web;

import com.yyg.po.Tag;
import com.yyg.service.BlogService;
import com.yyg.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * ClassName：TagShowController
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/10/11 20:58
 */
@Controller
public class TagShowController {
    @Autowired
    private TagService tagService;
    @Autowired
    private BlogService blogService;

    @GetMapping("/tags/{id}")
    public String tags(@PathVariable Long id, @PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                       Model model){
        List<Tag> tags = tagService.listTagTop(1000);
        if (id == -1) {
            id = tags.get(0).getId();
        }
        model.addAttribute("tags", tags);
        model.addAttribute("page", blogService.listBlog(id,pageable));
        model.addAttribute("activeTagId", id);
        return "tags";
    }
}
