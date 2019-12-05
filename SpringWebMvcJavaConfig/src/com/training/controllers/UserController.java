package com.training.controllers;


import com.training.dao.UserDao;
import com.training.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private Users users;

    @Autowired
    private UserDao dao;

    @Autowired
    private ModelAndView mdlView;

    @RequestMapping(method = RequestMethod.GET,value = "/registerUser")
    public ModelAndView getUserDetails(){
        mdlView.addObject("command",users);
        mdlView.setViewName("register");
        return mdlView;
    }


    @RequestMapping(method=RequestMethod.POST, value = "/registerUser")
    public ModelAndView onRegister(@ModelAttribute("addedObject") Users users){
        try {
            int rowAdded = dao.add(users);
            if (rowAdded == 1) {
                mdlView.addObject("messageHolder", "User Registered Successfully!");

            }
        }catch(Exception e){
            e.printStackTrace();
            mdlView.addObject("messageHolder", "User Registered Failed");
        }
        mdlView.setViewName("index");
        return mdlView;
    }

    @RequestMapping(method=RequestMethod.POST, value = "/login")
    public String onLogin(@ModelAttribute("addedObject") Users users, Model model){
        model.addAttribute("command",users);
        String returnPage = "index";
        Boolean flg=dao.validate(users);
        if(flg==true){
            returnPage = "menu";
        }
        return returnPage;
    }

}
