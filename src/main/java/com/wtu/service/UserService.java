package com.wtu.service;

import com.wtu.model.User;

/**
 *  业务层 接口
 *
 * menglanyingfei
 * on 2017.11.02 14:46
 */
public interface UserService {
    User getUserById(int userId);
}
