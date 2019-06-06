package com.zhuchuansheng.controller;

import com.zhuchuansheng.entity.User;
import com.zhuchuansheng.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 *
 *        用户登录控制器
 *
 * @Author zhuchuansheng
 * @CreateDate 2019/6/5 - 16:07
 * @Version v1.0
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Map<String, String> map){

        boolean login = loginService.login(user);

        System.out.println(login);

        if(login){

            return "home";
        }
        map.put("msg", "用户名或密码错误");

        return "redirect:/";
    }

}
