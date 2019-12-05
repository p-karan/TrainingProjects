package com.training.controllers;

import com.training.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @Autowired
    private ModelAndView mdlView;
    @Autowired
    private Users users;

    @RequestMapping("/")
    public ModelAndView init(){
        mdlView.addObject("majorHeading","Rajesh Khanna Hospitals");
        mdlView.addObject("command",users);
        mdlView.setViewName("index");

        return mdlView;
    }

}
