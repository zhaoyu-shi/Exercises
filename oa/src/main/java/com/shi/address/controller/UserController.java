package com.shi.address.controller;

import com.shi.address.pojo.People;
import com.shi.address.pojo.User;
import com.shi.address.service.PeopleService;
import com.shi.address.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PeopleService peopleService;

    static User user;

    @RequestMapping("/login")
    public String login(String name, String password, HttpSession session, Model model){
        String url = "error";
        /*System.out.println(name);
        System.out.println(password);*/
        user = userService.getUser(name);

        System.out.println(user);
        int uid = user.getId();
        if(user!=null){
            if(user.getPassword().equals(password)){
                url = "userManagement";
                List<People> allPeople = peopleService.getAllPeople(uid);
                List sort = peopleService.getSort(uid);

                session.setAttribute("sort",sort);
                // System.out.println(sort);
                model.addAttribute("list",allPeople);
            }
        }
        return url;
    }

    @RequestMapping("/register")
    public String register(String name,String password,String slogan){
        HashMap map = new HashMap();
        map.put("name",name);
        map.put("password",password);
        map.put("slogan",slogan);
        userService.addUser(map);
        return "redirect:login.jsp";
    }

    @RequestMapping("/addPeople")
    public String addPeople(String name,String department,String address,String email,String sex,
                            String telephone,String iphone,String unit,String sort){
        HashMap map = new HashMap();
        map.put("name",name);
        map.put("department",department);
        map.put("address",address);
        map.put("email",email);
        map.put("sex",sex);
        map.put("telephone",telephone);
        map.put("iphone",iphone);
        map.put("unit",unit);
        map.put("sort",sort);
        int userId = user.getId();
        map.put("uid",userId);
        peopleService.addPeople(map);
        return "redirect:jsp/userManagement.jsp";
    }

}
