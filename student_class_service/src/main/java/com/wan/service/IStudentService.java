package com.wan.service;

import com.wan.pojo.Student;

import java.util.List;

/**
 * @Author 万星明
 * @Date 2019/1/14
 */
public interface IStudentService {

    Student findStudentById(Integer id);
    List<Student> findAllStudent();

}
