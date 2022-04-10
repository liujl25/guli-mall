package com.liujl.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 1.
 */
@EnableFeignClients(basePackages = "com.liujl.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = "com.liujl.gulimall")
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
