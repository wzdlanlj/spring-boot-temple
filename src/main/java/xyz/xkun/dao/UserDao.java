package xyz.xkun.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.xkun.vo.User;

/**
 * @title: wzdlanlj@163.com
 * @projectName: spring-boot-05
 * @description: TODO
 * @author: fkun
 * @date: 2019/7/25 21:09
 */
@Mapper
public interface UserDao {

    @Select("select uno as id,uname,upwd from fk_user where uno = #{userId}")
    User queryByUserId(@Param("userId") Integer userId);
}
