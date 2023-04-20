package com.lingh.dynamicdatasourcenativetest.controller;

import com.lingh.dynamicdatasourcenativetest.service.spel.User;
import com.lingh.dynamicdatasourcenativetest.service.spel.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/session")
    public List<User> session(HttpServletRequest request) {
        request.getSession().setAttribute("tenantName", "tenant1");
        return userService.selectSpelBySession();
    }

    @GetMapping("/header")
    public String header() {
        userService.selectSpelByHeader();
        return "success";
    }
}