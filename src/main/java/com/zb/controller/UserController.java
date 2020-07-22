package com.zb.controller;

import com.zb.entity.User;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @create 2020-07-22 16:15
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/register")
    public String register(String username, String password) {
        if (!"".equals(username)&&!"".equals(password)){
            Boolean register = userService.register(username, password);
            if (register){
                return "redirect/success";//为了防止页面刷新时表单重复提交
            }
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/user/login")
    public String login(String username, String password, Model model) {
        if (!"".equals(username)&&!"".equals(password)){
            User user = userService.login(username, password);
            if (user!=null){
                model.addAttribute("username",user.getUsername());
                return "success";
            }
        }
        return "redirect:/";
    }

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/success")
    public String showSuccess() {
        return "success";
    }

}
