package xyz.xkun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.xkun.service.UserService;
import xyz.xkun.vo.User;

/**
 * @title: wzdlanlj@163.com
 * @projectName: spring-boot-05
 * @description: TODO
 * @author: fkun
 * @date: 2019/7/25 21:20
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user/{userId}")
    public User queryUserByUserId(@PathVariable Integer userId) {
        return userService.queryUserByUserId(userId);
    }
}
