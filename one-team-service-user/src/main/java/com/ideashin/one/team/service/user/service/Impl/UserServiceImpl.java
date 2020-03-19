package com.ideashin.one.team.service.user.service.Impl;

import com.ideashin.one.team.service.user.entity.OneTeamUser;
import com.ideashin.one.team.service.user.mapper.OneTeamUserMapper;
import com.ideashin.one.team.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import tk.mybatis.mapper.entity.Example;

/**
 * @Author: Shin
 * @Date: 11/2/2020 01:34
 * @Blog: ideashin.com
 */
@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private OneTeamUserMapper oneTeamUserMapper;

    @Override
    @Transactional(readOnly = false)
    public void register(OneTeamUser oneTeamUser) {
        oneTeamUser.setPassword(DigestUtils.md5DigestAsHex(oneTeamUser.getPassword().getBytes()));
        oneTeamUserMapper.insert(oneTeamUser);
    }

    @Override
    public OneTeamUser login(String loginCode, String plantPassword) {
        Example example = new Example(OneTeamUser.class);
        example.createCriteria().andEqualTo("account", loginCode);

        OneTeamUser oneTeamUser = oneTeamUserMapper.selectOneByExample(example);
        String password = DigestUtils.md5DigestAsHex(plantPassword.getBytes());
        if (password.equals(oneTeamUser.getPassword())) {
            return oneTeamUser;
        }
        return null;
    }
}
