package com.critc.service;

import com.critc.dao.UserDao;
import com.critc.model.User;

/**
 * Created by 孔垂云 on 2017/5/6.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
        System.out.println("Service执行新增用户。。。");
    }
}
