package com.springboot.practise.controllers;

import com.springboot.practise.mapper.UserMapper;
import com.springboot.practise.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Adrien
 */

@Controller
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String test(Model md) {
        User user = new User();
        user.setIduser(0);
        user.setName("Adrien");
        userMapper.insert(user);
        md.addAttribute("user", user);
        return "hello";
    }
}
