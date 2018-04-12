package com.shihu.demo.mongodb.model;

import java.util.Date;

public class Address {
    private String addr;
    private Date date;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Address(String addr, Date date) {
        this.addr = addr;
        this.date = date;
    }

    public Address() {
    }
}
