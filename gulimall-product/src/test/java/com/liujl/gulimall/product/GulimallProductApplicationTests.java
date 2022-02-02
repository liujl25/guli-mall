package com.liujl.gulimall.product;

import com.liujl.gulimall.product.entity.BrandEntity;
import com.liujl.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(14L);
        brandEntity.setLogo("http://url");
        brandEntity.setName("test");
        brandEntity.setDescript("测试品牌");
        brandEntity.setShowStatus(1);
        brandService.updateById(brandEntity);
    }

}
