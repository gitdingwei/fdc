package com.mt.model;

import java.io.Serializable;
import java.util.List;

public class Tree implements Serializable {
    private Integer id;
    private String text;
    private Integer pid;
    private String url;
    private List<Tree> nodes;

    public List<Tree> getNodes() {
        return nodes;
    }

    public void setNodes(List<Tree> nodes) {
        this.nodes = nodes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", pid='" + pid + '\'' +
                ", url='" + url + '\'' +
                ", nodes=" + nodes +
                '}';
    }


    public Integer getId() {
        return id;
    }
}
