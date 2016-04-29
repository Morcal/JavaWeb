package com.qdh.spring.control;

import com.qdh.spring.bean.User;
import com.qdh.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lyqdhgo on 2016/4/28.
 */
@Controller
@SessionAttributes("user")
public class UserController {
    @Resource
    UserService service;

    @RequestMapping("login")
    public String toLoginPage() {
        return "/WEB-INF/page/login.jsp";
    }

    @RequestMapping(value = "dologin", method = RequestMethod.POST)
    public String doLogin(@RequestParam String name, @RequestParam String password, HttpServletRequest request) {
        try {
            User user = service.doLogin(name, password);
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            return "/WEB_INF/page/login.jsp";
        }
        return "/WEB_INF/page/loginsuccess.jsp";
    }
}
