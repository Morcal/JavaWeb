package com.qdh.spring.service;

import com.qdh.spring.bean.User;
import com.qdh.spring.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lyqdhgo on 2016/4/28.
 */
@Service
public class UserService {
    @Resource
    UserDao dao;

    public User doLogin(String name, String password) throws Exception {
        if(name==null||"".equals(name)){
            throw new Exception("用户名不能空");
        }
        if(password==null||"".equals(password)){
            throw new Exception("密码不能空");
        }

        User user=dao.selectByUserName(name);
        if(user==null){
            throw new Exception("用户名不存在");
        }
        if(user.getPassword()==null){
            throw new Exception("密码为空");
        }

        return user;
    }
}
