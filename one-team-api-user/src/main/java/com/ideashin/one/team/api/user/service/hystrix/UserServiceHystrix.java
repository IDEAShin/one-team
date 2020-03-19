package com.ideashin.one.team.api.user.service.hystrix;

import com.google.common.collect.Lists;
import com.ideashin.one.team.api.user.service.UserService;
import com.ideashin.one.team.common.constants.HttpStatusConstants;
import com.ideashin.one.team.common.dto.BaseResult;
import com.ideashin.one.team.common.utils.MapperUtils;
import org.springframework.stereotype.Component;

/**
 * @Author: Shin
 * @Date: 1/13/2020 10:19 PM
 * @Blog: ideashin.com
 * <p>
 * 熔断器实现类
 */

@Component
public class UserServiceHystrix implements UserService {

    @Override
    public String login(String account, String password) {
        try {
            return MapperUtils.obj2json(
                    BaseResult.notOk(
                            Lists.newArrayList(
                                    new BaseResult.Error(
                                            String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()),
                                            HttpStatusConstants.BAD_GATEWAY.getContent()))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
