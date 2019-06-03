package com.javaweb.demo.dao.impl;

import com.javaweb.demo.dao.EquDao;
import com.javaweb.demo.entity.Equ_Data;
import com.javaweb.demo.util.DBconn;

public class EquDaoImpl implements EquDao {
    @Override
    public boolean add(Equ_Data dat) {
        boolean flag = false;

        DBconn.init();
        if(DBconn.addequ(dat) == 0){ flag = true; }
        DBconn.closeConn();

        return flag;
    }
}
