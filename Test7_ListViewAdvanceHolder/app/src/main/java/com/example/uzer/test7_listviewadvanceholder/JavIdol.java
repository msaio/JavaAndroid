package com.example.uzer.test7_listviewadvanceholder;

public class JavIdol {
    private String name;
    private String detail;
    private Integer picture;

    public JavIdol(String name, String detail, Integer picture) {
        this.name = name;
        this.detail = detail;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getPicture() {
        return picture;
    }

    public void setPicture(Integer picture) {
        this.picture = picture;
    }
}
