package com.ideashin.one.team.service.user.service;

import com.ideashin.one.team.service.user.entity.OneTeamUser;

/**
 * @Author: Shin
 * @Date: 11/2/2020 01:34
 * @Blog: ideashin.com
 */
public interface UserService {

    /**
     * 注册
     *
     * @param oneTeamUser 用户信息类
     */
    void register(OneTeamUser oneTeamUser);

    /**
     * 登录
     *
     * @param loginCode 登录账号
     * @param plantPassword 明文密码
     * @return
     */
    OneTeamUser login(String loginCode, String plantPassword);
}
