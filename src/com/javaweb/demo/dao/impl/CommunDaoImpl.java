package com.javaweb.demo.dao.impl;

import com.javaweb.demo.dao.CommunDao;
import com.javaweb.demo.entity.Commun_Data;
import com.javaweb.demo.util.DBconn;

public class CommunDaoImpl implements CommunDao {
    @Override
    public boolean add(Commun_Data dat) {
        boolean flag = false;

        DBconn.init();
        if(DBconn.addcommou(dat) == 0){ flag = true; }
        DBconn.closeConn();

        return flag;
    }
}
