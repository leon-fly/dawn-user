package com.dawn.user.service;

import com.dawn.user.dao.UserDao;
import com.dawn.user.model.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/23
 */
@Component
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public UserPO save(UserPO userPO) {
        return userDao.save(userPO);
    }
}
