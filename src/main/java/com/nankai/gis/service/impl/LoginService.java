package com.nankai.gis.service.impl;

import com.nankai.gis.domain.PUser;
import com.nankai.gis.mapper.PUserMapper;
import com.nankai.gis.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {
    @Autowired
    private PUserMapper userMapper;

    @Override
    public int isadmin(String username, String pwd) {
        PUser user = userMapper.selectUser(username);
        if (pwd.equals(user.getUserPwd()))
            return 1;
        else
            return 0;
    }
}
