package com.xd.springbootshardingtable.controller;

import com.xd.springbootshardingtable.entity.Student;
import com.xd.springbootshardingtable.entity.User;
import com.xd.springbootshardingtable.service.StudentService;
import com.xd.springbootshardingtable.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Classname UserController
 * @Description 用户测试控制类
 * @Author 李号东 lihaodongmail@163.com
 * @Date 2019-05-26 17:36
 * @Version 1.0
 */
@Api(tags = "student管理")
@RestSchema(schemaId = "student")
public class StudentController {

    @Autowired
    private StudentService userService;

    @ApiOperation(value = "查询用户")
    @PostMapping("/select")
    public List<Student> select() {
        return userService.getUserList();
    }

    @ApiOperation(value = "新增用户")
    @PostMapping("/insert")
    public Boolean insert(@ApiParam("request") @RequestBody Student user) {
        return userService.save(user);
    }

}
