package com.yyg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName：AboutShowController
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/10/11 22:30
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
