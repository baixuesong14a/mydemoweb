package com.javaweb.demo.dao.impl;

import com.javaweb.demo.dao.ResourcDao;
import com.javaweb.demo.entity.Resourc_Data;
import com.javaweb.demo.util.DBconn;

public class ResourcDaoImpl implements ResourcDao {
    @Override
    public boolean add(Resourc_Data dat) {
        boolean flag = false;

        DBconn.init();
        if(DBconn.addres(dat) == 0){ flag = true; }
        DBconn.closeConn();

        return flag;
    }
}