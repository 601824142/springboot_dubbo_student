package com.wan.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wan.dao.StudentDao;
import com.wan.pojo.Student;
import com.wan.pojo.StudentExample;
import com.wan.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author 万星明
 * @Date 2019/1/14
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student findStudentById(Integer id) {
        return studentDao.selectByPrimaryKey(1);
    }

    /**
     * 查询全部学生
     * @return
     */
    @Override
    public List<Student> findAllStudent() {
        StudentExample studentExample = new StudentExample();
        List<Student> studentList = studentDao.selectByExample(studentExample);
        return studentList;
    }

}
