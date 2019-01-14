package com.wan.admin;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wan")
@DubboComponentScan("com.wan.serviceImpl")
@MapperScan("com.wan.dao")
public class StudentClassProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentClassProviderApplication.class, args);
    }

}

