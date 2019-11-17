package com.smdq.ch.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shuimodanqing
 * create at:  2019/11/5  10:54 PM
 * @description
 */
@EnableEurekaServer
@SpringBootApplication
public class PandaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandaEurekaApplication.class, args);
    }
}
