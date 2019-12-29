package com.nankai.gis.controller;

import com.nankai.gis.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class loginController {
    @Autowired
    private ILoginService service;

    @RequestMapping(value = "/")
    public String loginCommit() {
        return "/user/login";
    }

    @RequestMapping(value = "/commit")
    public String login(String userName, String password, HttpServletRequest request) {
        if (service.isadmin(userName, password) == 1) {
            request.getSession().setAttribute("userName", userName);
            request.getSession().setAttribute("loginflag", "success");
            return "/user/hhh";
        } else {
            request.getSession().setAttribute("loginflag", "fail");
            return "/user/login";
        }
    }

    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/user/login";
    }
}
