package com.javaweb.demo.entity;

public class Equ_Data {
    private String time;
    private String name;
    private String season;

    public Equ_Data set(String a,String b,String c){
        this.time = a;
        this.name = b;
        this.season = c;
        return this;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
