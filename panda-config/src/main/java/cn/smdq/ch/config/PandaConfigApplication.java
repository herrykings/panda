package cn.smdq.ch.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author shuimodanqing
 * create at:  2019/11/17  7:00 PM
 * @description
 */
@SpringCloudApplication
@EnableConfigServer
public class PandaConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(PandaConfigApplication.class, args);
    }
}
