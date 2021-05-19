package com.study.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Desc
 * @Author lgl
 * @Date 2021/3/25
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain90 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain90.class,args);
    }
}
