package com.ideashin.one.team.common.tk.mybatis.mapper.common.mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OneTeamEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneTeamEurekaApplication.class, args);
    }

}
