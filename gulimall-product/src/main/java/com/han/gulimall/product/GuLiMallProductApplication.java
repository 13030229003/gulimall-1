package com.han.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//配置dao包扫描
@MapperScan("com.han.gulimall.product.dao")
@SpringBootApplication
public class GuLiMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuLiMallProductApplication.class, args);
    }

}
