package com.javaweb.demo.entity;

public class Resourc_Data {
    private String station;
    private String direction;
    private String capacity;
    private String UsageRate;

    public Resourc_Data set(String a,String b,String c,String d){
        this.station = a;
        this.direction = b;
        this.capacity = c;
        this.UsageRate = d;
        return this;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getUsageRate() {
        return UsageRate;
    }

    public void setUsageRate(String usageRate) {
        UsageRate = usageRate;
    }
}
