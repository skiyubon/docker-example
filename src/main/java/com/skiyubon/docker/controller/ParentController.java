package com.skiyubon.docker.controller;

import com.skiyubon.docker.entity.Parent;
import com.skiyubon.docker.service.ParentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/4/12 上午 11:56
 */
@Controller
@Api(value = "Parent")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @ApiOperation("创建")
    @PostMapping("/parent/create")
    @ResponseBody
    public Parent create(@RequestBody Parent parent){
        return parentService.create(parent);
    }

    @ApiOperation("查询")
    @GetMapping("/parent")
    @ResponseBody
    public List<Parent> findAll(){
        return parentService.findAll();
    }
}
