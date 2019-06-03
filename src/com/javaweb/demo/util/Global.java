package com.javaweb.demo.util;

import java.io.File;
import java.nio.file.Path;
import java.util.logging.Logger;

public class Global {
    public String getXmlPath()
    {
        //file:/D:/JavaWeb/.metadata/.me_tcat/webapps/TestBeanUtils/WEB-INF/classes/
        String path=Thread.currentThread().getContextClassLoader().getResource("").toString();
        //System.out.println("getXmlPath:  "+ path);
        path=path.replace('/', '\\'); // 将/换成\
        path=path.replace("file:", ""); //去掉file:
        path=path.replace("classes\\", ""); //去掉class\
        path=path.replace("WEB-INF\\", ""); //去掉class\
        path=path.substring(1); //去掉第一个\,如 \D:\JavaWeb...
        path+="DB\\mydb.db";
        //System.out.println(path);
        return path;
    }
}