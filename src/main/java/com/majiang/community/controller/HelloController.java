package com.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: community
 * @description
 * @author: tina.liu
 * @create: 2019-11-14 09:25
 **/
@Controller
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }








}
