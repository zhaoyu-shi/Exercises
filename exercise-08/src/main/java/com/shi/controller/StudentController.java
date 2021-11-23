package com.shi.controller;

import com.shi.pojo.Student;
import com.shi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*@RequestMapping("/Student")*/
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/find")
    public String student(String name, Model model){
        String url = "/error";
        Student student = studentService.getStudentByName(name);
        System.out.println(student);
        if (student!=null){
            url="/information";
        }
        model.addAttribute("list",student);
        return url;
    }

}
