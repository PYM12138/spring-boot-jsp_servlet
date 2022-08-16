package com.atguigu.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    //跳转到success页面
    @GetMapping("/abc")
    public String toPage(Model model){
        model.addAttribute("msg", "我是什么东西?");
        return "success";
    }

}
