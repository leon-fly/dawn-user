package com.dawn.user.controller;

import com.dawn.user.model.po.UserPO;
import com.dawn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/23
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/api/users")
    public String save(@RequestBody UserPO userPO) {
        userService.save(userPO);
        return "success";
    }
}
