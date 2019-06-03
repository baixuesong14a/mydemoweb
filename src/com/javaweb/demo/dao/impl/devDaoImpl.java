package com.javaweb.demo.dao.impl;

import com.javaweb.demo.dao.devDao;
import com.javaweb.demo.entity.Device_Data;
import com.javaweb.demo.util.DBconn;

public class devDaoImpl implements devDao {
    @Override
    public boolean add(Device_Data dat) {
        boolean flag = false;

        DBconn.init();
        if(DBconn.adddev(dat) == 0){ flag = true; }
        DBconn.closeConn();

        return flag;
    }
}
