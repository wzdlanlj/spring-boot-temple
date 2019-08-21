package xyz.xkun.vo;

/**
 * @title: wzdlanlj@163.com
 * @projectName: spring-boot-05
 * @description: TODO
 * @author: fkun
 * @date: 2019/7/25 21:08
 */
public class User {

    private Integer id;
    private String uname;
    private String upwd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public User(Integer id, String uname, String upwd) {
        this.id = id;
        this.uname = uname;
        this.upwd = upwd;
    }

    public User() {
    }
}
