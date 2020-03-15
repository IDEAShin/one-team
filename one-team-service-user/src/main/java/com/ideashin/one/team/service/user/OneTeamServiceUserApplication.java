package com.ideashin.one.team.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.ideashin.one.team.service.user.mapper")
public class OneTeamServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneTeamServiceUserApplication.class, args);
    }

}
