package com.ideashin.oneteam.uap.service;

import com.ideashin.oneteam.uap.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Shin
 * @Date: 1/12/2020 3:06 PM
 * @Blog: ideashin.com
 */

@FeignClient(value = "one-team-mcs", fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
