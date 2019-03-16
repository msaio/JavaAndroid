package com.example.uzer.test4_class;

public class student {
    private String fullname;
    private String address;
    private int birthday;

    public student(String fullname, String address, int birthday) {
        this.fullname = fullname;
        this.address = address;
        this.birthday = birthday;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

}
