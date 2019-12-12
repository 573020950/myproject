package com.kekexili.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther Tianpenghao
 * @Create 2019-12-12--2019/12/12-16:35
 */
@Controller
public class IndexController {
    @RequestMapping(value={"/","/index"},method = {RequestMethod.GET, RequestMethod.POST})
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        return  "index";
    }
}
