package com.yyg.web;

import com.yyg.po.Type;
import com.yyg.service.BlogService;
import com.yyg.service.TypeService;
import com.yyg.vo.BlogQuery;
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
 * ClassName：TypeShowController
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/10/11 19:01
 */
@Controller
public class TypeShowController {

    @Autowired
    private TypeService typeService;
    @Autowired
    private BlogService blogService;

    @GetMapping("/types/{id}")
    public String types(@PathVariable Long id, @PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                        Model model) {

        List<Type> types = typeService.listTypeTop(1000);
        if (id == -1) {
            id = types.get(0).getId();
        }
        BlogQuery blogQuery = new BlogQuery();
        blogQuery.setTypeId(id);
        model.addAttribute("types", types);
        model.addAttribute("page", blogService.listBlog(pageable, blogQuery));
        model.addAttribute("activeTypeId",id);
        return "types";
    }
}
