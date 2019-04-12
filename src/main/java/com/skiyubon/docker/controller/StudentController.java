package com.skiyubon.docker.controller;

import com.skiyubon.docker.entity.Student;
import com.skiyubon.docker.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/3/29 下午 5:43
 */

@Api("Student")
@Controller
public class StudentController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/index")
    public String index(Model model){
        model.addAttribute("welcome","welcome,ooo!");
        return "student/index";
    }

    @RequestMapping("/student/send")
    public void sendMessage(){
        jmsTemplate.convertAndSend("hw","hello,world");
    }

    @ApiOperation("创建")
    @PostMapping("/student/create")
    @ResponseBody
    public Student create(@RequestBody Student student){
        return studentService.create(student);
    }

    @ApiOperation("查询")
    @GetMapping("/student")
    @ResponseBody
    public List<Student> findAll(){
        return studentService.findAll();
    }

}
