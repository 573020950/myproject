package com.kekexili.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther Tianpenghao
 * @Create 2019-12-12--2019/12/12-16:35
 */
@Controller
public class IndexController {
    @RequestMapping()
    public String index(){
        return  "index";
    }
}
