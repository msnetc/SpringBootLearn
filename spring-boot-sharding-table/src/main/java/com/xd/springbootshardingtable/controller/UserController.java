package com.xd.springbootshardingtable.controller;

import com.xd.springbootshardingtable.entity.User;
import com.xd.springbootshardingtable.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname UserController
 * @Description 用户测试控制类
 * @Author 李号东 lihaodongmail@163.com
 * @Date 2019-05-26 17:36
 * @Version 1.0
 */
@Api(tags = "user管理")
@RestSchema(schemaId = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户")
    @PostMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }

    @ApiOperation(value = "新增用户")
    @PostMapping("/insert")
    public Boolean insert(@ApiParam("request") @RequestBody User user) {
        return userService.save(user);
    }

}
