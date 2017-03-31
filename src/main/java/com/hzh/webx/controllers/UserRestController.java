package com.hzh.webx.controllers;

import com.hzh.webx.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangzehai on 2017/3/31.
 */

@RestController
@RequestMapping("/user/rest")
public class UserRestController {
    @RequestMapping("{userName}")
    public User user(@PathVariable String userName) {
        User user = new User();
        user.setUserName(userName);
        user.setAge(30);
        return user;
    }
}
