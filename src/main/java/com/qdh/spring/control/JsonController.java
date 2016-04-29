package com.qdh.spring.control;

import com.qdh.spring.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Repeat;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyqdhgo on 2016/4/28.
 *
 * result json data test
 */
@Controller
public class JsonController {
    @RequestMapping("getJson")
    public User getUserInfo(){
        User user=new User();
        user.setUserName("qdh");
        user.setPassword("123456");
        return user;
    }
}
