package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String user(){
        String a="apple";// use model to display or migrate this data with templaye engine

        return "/user/userInfo.html"; // need to go to folder user to find it
    }


}
