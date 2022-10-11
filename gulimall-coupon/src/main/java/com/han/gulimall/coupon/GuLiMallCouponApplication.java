package com.han.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.han.gulimall.coupon.dao")
public class GuLiMallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuLiMallCouponApplication.class, args);
	}
}
