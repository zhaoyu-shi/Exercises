package com.shi.controller;

import com.shi.pojo.User;
import com.shi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/welcome")
    public String user(String username, String password, Model model){
        String url = "error";
        System.out.println(username);
        System.out.println(password);
        User user = userService.getUser(username);
        System.out.println(user);
        if(user!=null){
            if(user.getPwd().equals(password)){
                url = "welcome";
                model.addAttribute("username",user.getName());
            }
        }
        return url;
    }

}
