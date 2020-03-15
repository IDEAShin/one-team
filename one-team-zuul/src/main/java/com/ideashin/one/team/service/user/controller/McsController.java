package com.ideashin.one.team.service.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Shin
 * @Date: 1/12/2020 3:11 PM
 * @Blog: ideashin.com
 */

@RestController
public class McsController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message) {
        return String.format("Hi your message is : %s port : %s", message, port);
    }
}
