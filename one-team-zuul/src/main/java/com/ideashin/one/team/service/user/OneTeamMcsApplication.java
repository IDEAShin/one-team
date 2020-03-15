package com.ideashin.one.team.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OneTeamMcsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneTeamMcsApplication.class, args);
    }

}
