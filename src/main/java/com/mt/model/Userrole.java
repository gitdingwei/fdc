package com.mt.model;

import java.io.Serializable;

public class Userrole implements Serializable {

    private Integer urid;
    private Integer userid;
    private String roleid;

    @Override
    public String toString() {
        return "Userrole{" +
                "urid=" + urid +
                ", userid='" + userid + '\'' +
                ", roleid='" + roleid + '\'' +
                '}';
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}
