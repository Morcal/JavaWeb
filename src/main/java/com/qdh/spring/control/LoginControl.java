package com.qdh.spring.control;

import com.qdh.spring.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyqdhgo on 2016/4/28.
 */
@Controller
@RequestMapping("/user")
public class LoginControl {

    @RequestMapping("/user/{name}/{password}")
    public
    @ResponseBody
    User getUser(@PathVariable("name") String name, @PathVariable("password") String password) {
        User user = new User();
        user.setUserName(name);
        user.setPassword(password);
        return user;
    }
}
