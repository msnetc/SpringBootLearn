package com.xd.springbootshardingtable.service;

import com.xd.springbootshardingtable.entity.Student;


import java.util.List;

public interface StudentService {
    /**
     * 保存用户信息
     * @param entity
     * @return
     */
    boolean save(Student entity);

    /**
     * 查询全部用户信息
     * @return
     */
    List<Student> getUserList();
}
