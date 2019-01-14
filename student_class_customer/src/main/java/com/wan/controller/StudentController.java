package com.wan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wan.pojo.Class;
import com.wan.pojo.Student;
import com.wan.service.IClassService;
import com.wan.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author 万星明
 * @Date 2019/1/14
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Reference
    private IStudentService studentService;
    @Reference
    private IClassService classService;

    @RequestMapping("/findAllStudent1")
    public List<Student> findAllStudent1(){
        System.out.println("进入消费端查询全部学生");
        List<Student> studentList = studentService.findAllStudent();
        return studentList;
    }

    @RequestMapping("/findAllStudent")
    public String findAllStudent(Model model){
        System.out.println("进入消费端查询全部学生");
        List<Student> studentList = studentService.findAllStudent();
        List<Class> classList = classService.findAllClass();
        model.addAttribute("classList",classList);
        model.addAttribute("studentList",studentList);
        return "StudentList";
    }



}
