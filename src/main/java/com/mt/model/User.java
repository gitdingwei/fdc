package com.mt.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 */
public class User implements Serializable {
    private Integer userid;
    private String username;
    private String userpass;
    private String usersex;
    private String userage;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", usersex='" + usersex + '\'' +
                ", userage='" + userage + '\'' +
                '}';
    }
}
