package com.javaweb.demo.dao.impl;

import com.javaweb.demo.dao.blockDao;
import com.javaweb.demo.entity.Block_Data;
import com.javaweb.demo.util.DBconn;

public class blockDaoImpl implements blockDao {
    //@Override
    public boolean add(Block_Data block) {
        boolean flag = false;
       /* DBconn.init();
        int i =DBconn.addUpdDel("insert into Data_Block values(20190612,'南部','长沙','地点','原因');");
        if(i>0){
            flag = true;
        }
        DBconn.closeConn();
        return flag;
        //DBconn.test();
        //System.out.println("sql test is success!!");
        //return flag;*/
       DBconn.init();
       if(DBconn.addblock(block) == 0){ flag = true; }
       DBconn.closeConn();
       return flag;
    }
}
