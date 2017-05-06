package com.critc.factory;

import com.critc.model.User;
import com.critc.service.UserService;

/**
 * Created by 孔垂云 on 2017/5/6.
 */
public class Test {
    public static void main(String[] args)throws  Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        User user = new User();
        UserService userService = (UserService) context.getBean("userService");
        userService.add(user);
    }
}
