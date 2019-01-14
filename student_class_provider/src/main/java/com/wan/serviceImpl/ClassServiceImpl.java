package com.wan.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wan.dao.ClassDao;
import com.wan.pojo.Class;
import com.wan.pojo.ClassExample;
import com.wan.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author 万星明
 * @Date 2019/1/14
 */
@Service
public class ClassServiceImpl implements IClassService {

    @Autowired
    private ClassDao classDao;

    /**
     * 查询全部学生
     * @return
     */
    @Override
    public List<Class> findAllClass() {
        ClassExample classExample = new ClassExample();
        List<Class> classeList = classDao.selectByExample(classExample);
        return classeList;
    }
}
