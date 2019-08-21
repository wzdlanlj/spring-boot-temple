package xyz.xkun.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import xyz.xkun.utils.JsonUtils;
import xyz.xkun.vo.User;

/**
 * @title: wzdlanlj@163.com
 * @projectName: spring-boot-05
 * @description: TODO
 * @author: fkun
 * @date: 2019/8/14 10:22
 */
@Component
@Aspect
public class permiss {
    @Pointcut("@annotation(xyz.xkun.aop.ljq)")
    public void cut() {
    }

    @Around("cut()")
    public Object aroud(ProceedingJoinPoint pjp) {
        System.out.println("伞兵一号卢本伟准备就绪");
        String s = JsonUtils.objectToJson(new User(233, "lihui", "qweasd"));
        return s;
    }

    @After("cut()")
    public void after(){
        System.out.println("从现在开始这里叫做卢本伟广场");
    }

}
