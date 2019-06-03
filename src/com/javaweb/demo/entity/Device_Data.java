package com.javaweb.demo.entity;

public class Device_Data {
    private String Code;
    private String sys;
    private String station;
    private String devtype;
    private String usetime;
    private String isAll;
    private String num;
    private String protype;
    private String sertype;
    //private String isbad;
    //private String badtime;
    //private String badseason;

    public Device_Data set(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        this.Code = a;
        this.sys = b;
        this.station =c;
        this.devtype = d;
        this.usetime = e;
        this.isAll = f;
        this.num = g;
        this.protype = h;
        this.sertype = i;
        //this.isbad = j;
        //this.badtime = k;
        //this.badseason = l;
        return this;
    }
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDevtype() {
        return devtype;
    }

    public void setDevtype(String devtype) {
        this.devtype = devtype;
    }

    public String getUsetime() {
        return usetime;
    }

    public void setUsetime(String usetime) {
        this.usetime = usetime;
    }

    public String getIsAll() {
        return isAll;
    }

    public void setIsAll(String isAll) {
        this.isAll = isAll;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }

    public String getSertype() {
        return sertype;
    }

    public void setSertype(String sertype) {
        this.sertype = sertype;
    }
    /*

    public String getIsbad() {
        return isbad;
    }

    public void setIsbad(String isbad) {
        this.isbad = isbad;
    }

    public String getBadtime() {
        return badtime;
    }

    public void setBadtime(String badtime) {
        this.badtime = badtime;
    }

    public String getBadseason() {
        return badseason;
    }

    public void setBadseason(String badseason) {
        this.badseason = badseason;
    }*/
}
