package com.ideashin.one.team.api.user.controller;

import com.ideashin.one.team.api.user.service.UserService;
import com.ideashin.one.team.common.dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Shin
 * @Date: 1/12/2020 3:26 PM
 * @Blog: ideashin.com
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到登录页
     * @param message
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(String account, String password) {
        return userService.login(account, password);
    }
}
