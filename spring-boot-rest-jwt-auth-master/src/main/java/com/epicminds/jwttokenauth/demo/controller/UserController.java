package com.epicminds.jwttokenauth.demo.controller;

import com.epicminds.jwttokenauth.demo.model.UserEntity;
import com.epicminds.jwttokenauth.demo.service.UserDetailsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @PostMapping("/userRegister")
    public UserEntity getProductList(@RequestBody UserEntity user) {
        UserEntity u = userDetailsService.addUser(user);
        return u;
    }
}
