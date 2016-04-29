package com.qdh.spring.dao;

import com.qdh.spring.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by lyqdhgo on 2016/4/28.
 */
@Repository
public class UserDao {
    public User selectByUserName(String name) {
        if ("admin".equals(name)) {
            User user = new User();
            user.setPassword("123");
            user.setUserName("admin");
            return user;
        }
        return null;
    }
}
