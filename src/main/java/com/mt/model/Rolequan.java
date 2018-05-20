package com.mt.model;

import java.io.Serializable;

public class Rolequan implements Serializable {

    private Integer rqid;
    private String id;
    private String qid;

    public Integer getRqid() {
        return rqid;
    }

    public void setRqid(Integer rqid) {
        this.rqid = rqid;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "Rolequan{" +
                "rqid=" + rqid +
                ", id='" + id + '\'' +
                ", qid='" + qid + '\'' +
                '}';
    }
}
