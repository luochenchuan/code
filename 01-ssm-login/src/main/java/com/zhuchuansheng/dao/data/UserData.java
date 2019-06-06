package com.zhuchuansheng.dao.data;

import com.zhuchuansheng.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 *      用户数据
 *
 * @Author zhuchuansheng
 * @CreateDate 2019/6/5 - 16:35
 * @Version v1.0
 */
@Repository
public class UserData {

    /**
     * 用户id
     */
    private static Integer id = 1000;
    /**
     * 用户数据存储容器
     */
    public static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(id++, "admin", "admin"));
        userList.add(new User(id++, "tom", "123456"));
    }

}
