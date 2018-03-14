package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lenovo on 2018/3/14.
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_ClientApplication.class,args);
    }
}
