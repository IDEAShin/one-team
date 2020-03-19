package com.ideashin.one.team.api.user.service;

import com.ideashin.one.team.api.user.service.hystrix.UserServiceHystrix;
import com.ideashin.one.team.common.dto.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Shin
 * @Date: 1/12/2020 3:06 PM
 * @Blog: ideashin.com
 */

@FeignClient(value = "one-team-servie-user", fallback = UserServiceHystrix.class)
public interface UserService {

    /**
     * 登录
     *
     * @param account
     * @param password
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    String login(@RequestParam(value = "account") String account,
                     @RequestParam(value = "password") String password);
}
