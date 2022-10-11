package com.han.gulimall.product;

import com.han.gulimall.product.entity.BrandEntity;
import com.han.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = brandService.getById("10");

        System.out.println(brandEntity);

    }



}
