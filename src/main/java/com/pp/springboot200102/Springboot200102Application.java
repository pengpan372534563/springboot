package com.pp.springboot200102;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.pp.springboot200102.core.dao"})    //扫描DAO
public class Springboot200102Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot200102Application.class, args);
    }

}
