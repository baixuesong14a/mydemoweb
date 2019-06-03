package com.javaweb.demo.entity;

public class Commun_Data {
    private String sys;
    private String time;
    private String staS;
    private String endS;
    private String O_star_st;
    private String O_end_st;
    private String O_star_now;
    private String O_end_now;
    private String Attenuation;
    private String ErrorCode;

    public Commun_Data set(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j){
        this.sys = a;
        this.time = b;
        this.staS = c;
        this.endS =d;
        this.O_star_st = e;
        this.O_end_st = f;
        this.O_star_now = g;
        this.O_end_now = h;
        this.Attenuation = i;
        this.ErrorCode = j;
        return this;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String timme) {
        this.time = timme;
    }

    public String getStaS() {
        return staS;
    }

    public void setStaS(String staS) {
        this.staS = staS;
    }

    public String getEndS() {
        return endS;
    }

    public void setEndS(String endS) {
        this.endS = endS;
    }

    public String getO_star_st() {
        return O_star_st;
    }

    public void setO_star_st(String o_star_st) {
        O_star_st = o_star_st;
    }

    public String getO_end_st() {
        return O_end_st;
    }

    public void setO_end_st(String o_end_st) {
        O_end_st = o_end_st;
    }

    public String getO_star_now() {
        return O_star_now;
    }

    public void setO_star_now(String o_star_now) {
        O_star_now = o_star_now;
    }

    public String getO_end_now() {
        return O_end_now;
    }

    public void setO_end_now(String o_end_now) {
        O_end_now = o_end_now;
    }

    public String getAttenuation() {
        return Attenuation;
    }

    public void setAttenuation(String attenuation) {
        Attenuation = attenuation;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }
}
