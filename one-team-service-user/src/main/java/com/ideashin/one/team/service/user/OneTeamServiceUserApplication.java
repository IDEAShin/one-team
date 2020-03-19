package com.ideashin.one.team.service.user;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.ideashin.one.team.service.user.mapper")
public class OneTeamServiceUserApplication {

//    @Bean
//    @ConfigurationProperties(prefix = "db")
//    public DataSource dateSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        return dataSource;
//    }

    public static void main(String[] args) {
        SpringApplication.run(OneTeamServiceUserApplication.class, args);
    }

}
