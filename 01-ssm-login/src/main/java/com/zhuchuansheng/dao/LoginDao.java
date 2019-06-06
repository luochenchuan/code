package com.zhuchuansheng.dao;

import com.zhuchuansheng.dao.data.UserData;
import com.zhuchuansheng.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *         用户登录的dao
 *
 * @Author zhuchuansheng
 * @CreateDate 2019/6/5 - 16:31
 * @Version v1.0
 */
@Repository("loginDao")
public class LoginDao {

    private List<User> userList = UserData.userList;

    /**
     *      根据用户名和密码查询用户信息
     *
     * @param user  用户实体
     * @return
     */
    public boolean findUserByUserAndPasswrd(User user) {

        for(User u : userList){

            if(u.getUserName().equalsIgnoreCase(user.getUserName())
                    && u.getPassword().equalsIgnoreCase(user.getPassword())){

                return true;
            }

        }

        return false;
    }

}
