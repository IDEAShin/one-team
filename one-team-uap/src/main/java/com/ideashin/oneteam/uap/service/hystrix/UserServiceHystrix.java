package com.ideashin.oneteam.uap.service.hystrix;

import com.ideashin.oneteam.uap.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author: Shin
 * @Date: 1/13/2020 10:19 PM
 * @Blog: ideashin.com
 *
 * 熔断器实现类
 */

@Component
public class UserServiceHystrix implements UserService {
    @Override
    public String sayHi(String message) {
        return String.format("His your message is : %s but request bad", message);
    }

}
