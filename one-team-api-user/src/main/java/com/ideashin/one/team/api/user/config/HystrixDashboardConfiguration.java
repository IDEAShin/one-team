package com.ideashin.one.team.api.user.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * @Author: Shin
 * @Date: 2020/2/3 15:32
 * @Blog: ideashin.com
 *
 * 熔断器仪表盘监控servlet配置
 */

@Configuration
public class HystrixDashboardConfiguration {

    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        // springboot webServlet提供的servletBean注册
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.setUrlMappings(Collections.singleton("/hystrix.stream"));
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
