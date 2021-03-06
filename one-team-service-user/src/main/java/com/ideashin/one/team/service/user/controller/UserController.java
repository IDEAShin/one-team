package com.ideashin.one.team.service.user.controller;

import com.google.common.collect.Lists;
import com.ideashin.one.team.common.dto.BaseResult;
import com.ideashin.one.team.service.user.entity.OneTeamUser;
import com.ideashin.one.team.service.user.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Shin
 * @Date: 12/2/2020 3:11 PM
 * @Blog: ideashin.com
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     *
     * @param account
     * @param password
     * @return
     */
    @ApiOperation(value = "登录接口", httpMethod = "GET")
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public BaseResult login(String account, String password) {
        System.out.println(account + "--" + password);
        // 检查登录信息
        BaseResult baseResult = cheakLogin(account, password);
        if (baseResult != null) {
            return baseResult;
        }

        // 登录业务
        OneTeamUser oneTeamUser = userService.login(account, password);
        // 登录成功
        if (oneTeamUser != null) {
            return BaseResult.ok(oneTeamUser);
            // 登录失败
        } else {
            return BaseResult.notOk(Lists.newArrayList(new BaseResult.Error("", "login failed！")));
        }
    }

    /**
     * 检查登录
     *
     * @param account
     * @param password
     * @return
     */
    private BaseResult cheakLogin(String account, String password) {
        BaseResult baseResult = null;
        // 使用google工具类创建ArrayList
//        List<BaseResult.Error> errorList = Lists.newArrayList();

        if (StringUtils.isBlank(account) || StringUtils.isBlank(password)) {
            baseResult = BaseResult.notOk(Lists.newArrayList(
                    new BaseResult.Error("account", "Account cannot be empty!"),
                    new BaseResult.Error("password", "Password cannot be empty!")
            ));
        }

        return baseResult;
    }
}
