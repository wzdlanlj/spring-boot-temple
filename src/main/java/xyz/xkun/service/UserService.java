package xyz.xkun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.xkun.dao.UserDao;
import xyz.xkun.vo.User;

import javax.annotation.Resource;

/**
 * @title: wzdlanlj@163.com
 * @projectName: spring-boot-05
 * @description: TODO
 * @author: fkun
 * @date: 2019/7/25 21:13
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryUserByUserId(Integer userId){
        return userDao.queryByUserId(3);
    }

}
