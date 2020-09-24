package com.cn.mall.product;

import com.cn.mall.product.entity.BrandEntity;
import com.cn.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("apple");
        brandEntity.setDescript("手机");
        brandService.save(brandEntity);
    }

}
