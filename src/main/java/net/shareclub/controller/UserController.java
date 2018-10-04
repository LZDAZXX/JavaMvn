package net.shareclub.controller;

import net.shareclub.bean.User;
import net.shareclub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public String register(User user){
        userService.insert(user);
        return "/index";
    }
}
