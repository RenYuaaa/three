package com.qfedu.controller;

import com.qfedu.pojo.Admin;
import com.qfedu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;
    /**
     * 展示登录界面
     *
     * @return
     */
    @RequestMapping("/showLogin")
    public String showLogin() {

        return "login";
    }

    /**
     * 进行登录，登录成功跳转moviesList页面，失败跳转到showLogin页面
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(Admin admin) {
        boolean result = adminService.validateLogin(admin);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }
}
