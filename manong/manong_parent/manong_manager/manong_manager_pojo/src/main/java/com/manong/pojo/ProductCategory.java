package com.manong.pojo;

public class ProductCategory {
    private Integer id;

    private String name;

    private Integer sorderorder;

    private Integer status;

    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSorderorder() {
        return sorderorder;
    }

    public void setSorderorder(Integer sorderorder) {
        this.sorderorder = sorderorder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}