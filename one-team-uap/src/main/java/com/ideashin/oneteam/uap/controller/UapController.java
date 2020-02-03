package com.ideashin.oneteam.uap.controller;

import com.ideashin.oneteam.uap.service.UserService;
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
public class UapController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message) {
        return userService.sayHi(message);
    }
}
