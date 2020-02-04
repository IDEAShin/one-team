package com.ideashin.one.team.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class OneTeamConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneTeamConfigApplication.class, args);
    }

}
