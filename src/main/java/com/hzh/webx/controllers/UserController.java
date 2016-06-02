package com.hzh.webx.controllers;

import com.hzh.webx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adam on 2016/2/26.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userInfo")
    public String userInfo(Model model) {
        model.addAttribute("message", "Hello World!");
        model.addAttribute("userName", "Adam");
        return "userInfo";
    }
}