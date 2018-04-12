package com.shihu.demo.mongodb.model;

public class Corporation {
    private String name;
    private int percent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public Corporation(String name, int percent) {
        this.name = name;
        this.percent = percent;
    }

    public Corporation() {
    }
}
