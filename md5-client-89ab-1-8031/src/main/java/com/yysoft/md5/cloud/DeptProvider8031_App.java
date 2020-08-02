package com.yysoft.md5.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//开启EurekaClient功能 自动注册到EurekaServer
@EnableEurekaClient
//开启服务发现功能
@EnableDiscoveryClient
public class DeptProvider8031_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8031_App.class,args);
    }
}
