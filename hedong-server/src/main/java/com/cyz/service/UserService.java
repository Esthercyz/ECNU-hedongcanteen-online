package com.cyz.service;

import com.cyz.dto.UserLoginDTO;
import com.cyz.entity.User;

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
