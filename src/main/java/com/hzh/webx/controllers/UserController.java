package com.hzh.webx.controllers;

import com.hzh.webx.model.User;
import com.hzh.webx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huangzehai on 2016/2/26.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("welcome")
    public String userInfo(Model model) {
        model.addAttribute("message", "Hello World!");
        model.addAttribute("userName", "Adam");
        return "userInfo";
    }

    @RequestMapping("{userName}")
    public @ResponseBody
    User user(@PathVariable String userName) {
        User user = new User();
        user.setUserName(userName);
        user.setAge(18);
        return user;
    }

}