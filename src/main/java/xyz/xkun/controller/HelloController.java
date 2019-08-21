package xyz.xkun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.xkun.aop.ljq;
import xyz.xkun.utils.JsonUtils;
import xyz.xkun.vo.User;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @title: wzdlanlj@163.com
 * @projectName: spring-boot-05
 * @description: TODO
 * @author: fkun
 * @date: 2019/7/25 16:00
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    @ljq
    public String hello() {
        LinkedList<Object> objects = new LinkedList<>();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        return "hello world";
    }

    @RequestMapping("nihao")
    @ResponseBody
    public String nihao() {
        User user = new User();
        user.setId(66);
        user.setUname("fkun");
        user.setUpwd("qweasd");
        String object = JsonUtils.objectToJson(user);
        return object;
    }
}
