package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 代表这是一个注册中心服务
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka_ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_ServerApplication.class,args);
    }
}
