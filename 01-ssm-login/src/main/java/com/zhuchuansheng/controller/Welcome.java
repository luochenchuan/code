package com.zhuchuansheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zhuchuansheng
 * @CreateDate 2019/6/5 - 21:40
 * @Version v1.0
 */
@Controller
public class Welcome {

    @RequestMapping("/")
    public String welcome(){

        return "/WEB-INF/login.jsp";
    }

}
