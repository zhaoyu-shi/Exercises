package com.shi.address.controller;

import com.shi.address.pojo.People;
import com.shi.address.pojo.User;
import com.shi.address.service.PeopleService;
import com.shi.address.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    static int uid;
     // static  HttpSession session;
    //
    // public HttpSession allpeo(int uid){
    //     List<People> allPeople = peopleService.getAllPeople(uid);
    //     List sort = peopleService.getSort(uid);
    //
    //     session.setAttribute("sort",sort);
    //     session.setAttribute("list",allPeople);
    //     return session;
    // }

    @RequestMapping("/login")
    public String login(String name, String password, HttpSession session){
        String url = "error";
        /*System.out.println(name);
        System.out.println(password);*/
        user = userService.getUser(name);

        System.out.println(user);
        uid = user.getId();
        System.out.println(uid);
        if(user!=null){
            if(user.getPassword().equals(password)){
                System.out.println("11");
                url = "userManagement";
                List<People> allPeople = peopleService.getAllPeople(uid);
                // System.out.println(allPeople);
                List sort = peopleService.getSort(uid);
                 System.out.println(sort);
                session.setAttribute("sort",sort);
                // System.out.println(sort);
                session.setAttribute("list",allPeople);

                // System.out.println(allpeo(uid));
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
        return "redirect:jsp/login.jsp";
    }

    @RequestMapping("/addPeople")
    public String addPeople(String name,String department,String address,String email,String sex,
                            String telephone,String iphone,String unit,String sort, HttpSession session){
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

        List<People> allPeople = peopleService.getAllPeople(uid);
        System.out.println(allPeople);
        List sort1 = peopleService.getSort(uid);
        // System.out.println(sort1);
        // session.setAttribute("sort",sort1);
        // System.out.println(sort);
        session.setAttribute("list",allPeople);

        return "success";
    }

    @RequestMapping("/deletePeople")
    public String deletePeople(int id , HttpSession session){
        peopleService.deletePeople(id);
        List<People> allPeople = peopleService.getAllPeople(uid);
        System.out.println(allPeople);
        List sort = peopleService.getSort(uid);
        // System.out.println(sort);
        // session.setAttribute("sort",sort);
        // System.out.println(sort);
        session.setAttribute("list",allPeople);
        return "userManagement";
    }

}
