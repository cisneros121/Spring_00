package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Struct;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
        public String homePage(Model model){

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");
        //model offers


        return "/student/welcome"; // no html since its thymeleaf
    }





}
