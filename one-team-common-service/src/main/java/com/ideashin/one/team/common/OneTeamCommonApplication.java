package com.ideashin.one.team.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: Shin
 * @Date: 15/3/2020 下午2:13
 * @Blog: ideashin.com
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OneTeamCommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(OneTeamCommonApplication.class, args);
    }
}
