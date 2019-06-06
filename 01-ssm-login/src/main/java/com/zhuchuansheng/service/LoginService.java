package com.zhuchuansheng.service;

import com.zhuchuansheng.dao.LoginDao;
import com.zhuchuansheng.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhuchuansheng
 * @CreateDate 2019/6/5 - 16:27
 * @Version v1.0
 */
@Service("loginService")
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    /**
     * 用户登录服务
     * @param user 用户实体
     * @return
     */
    public boolean login(User user) {

        return this.loginDao.findUserByUserAndPasswrd(user);
    }

}
