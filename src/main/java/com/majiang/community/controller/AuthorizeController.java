package com.majiang.community.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: community
 * @description
 * @author: tina.liu
 * @create: 2019-11-14 11:54
 **/
@Controller
public class AuthorizeController {

    @GetMapping(value = "/callback")
    public String callback(@RequestParam(name="cod") String code,
                           @RequestParam(name="state") String state){
        return "index";
    }

}









