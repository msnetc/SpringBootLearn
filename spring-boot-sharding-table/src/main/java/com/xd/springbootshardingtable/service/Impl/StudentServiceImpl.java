package com.xd.springbootshardingtable.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.springbootshardingtable.entity.Student;
import com.xd.springbootshardingtable.entity.User;
import com.xd.springbootshardingtable.mapper.StudentMapper;
import com.xd.springbootshardingtable.mapper.UserMapper;
import com.xd.springbootshardingtable.service.StudentService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl  extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Override
    public boolean save(Student entity) {
        return super.save(entity);
    }

    public List<Student> getUserList() {
        return baseMapper.selectList(Wrappers.<Student>lambdaQuery());
    }
}
