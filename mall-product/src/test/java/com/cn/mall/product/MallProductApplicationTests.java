package com.cn.mall.product;

import com.cn.mall.product.entity.BrandEntity;
import com.cn.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void uploadFileTest() {
 /*       // Endpoint以成都为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-chengdu.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
        String accessKeyId = "";
        String accessKeySecret = "";
        String bucketName = "mall-project-dzf";
        // <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        String objectName = "C:\\Users\\duanzhf\\Desktop\\test.jfif";
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传文件到指定的存储空间（bucketName）并将其保存为指定的文件名称（objectName）。
        String content = "test";
        ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));

        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("success...");*/
    }

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("apple");
        brandEntity.setDescript("手机");
        brandService.save(brandEntity);
    }

}
