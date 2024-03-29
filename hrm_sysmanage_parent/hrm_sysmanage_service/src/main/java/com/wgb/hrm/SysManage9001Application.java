package com.wgb.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wgb.hrm.mapper")
public class SysManage9001Application {
    public static void main(String[] args) {
        SpringApplication.run(SysManage9001Application.class,args);
    }
}
