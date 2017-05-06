package com.critc.dao;

import com.critc.model.User;

/**
 * Created by 孔垂云 on 2017/5/6.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("新增用户成功");
    }
}
