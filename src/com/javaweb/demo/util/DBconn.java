package com.javaweb.demo.util;

import com.javaweb.demo.entity.*;

import java.sql.*;

public class DBconn {
    //static String sql="jdbc:sqlite://E:\\Workspaces\\IDEA\\demoweb\\web\\DB\\mydb.db";
    static String sql="jdbc:sqlite://E:\\DB\\mydb.db";
    //E:\Workspaces\IDEA\demoweb\out\artifacts\demoweb_war_exploded\DB\mydb.db
    static Connection conn = null;
    static Statement stat = null;
    static ResultSet rs = null; // 初始化一个结果集 rs
    static PreparedStatement ps =null; // 初始化一个PreparedStatement对象 ps

    public static void init(){
        //System.out.println("init 运行");
        //System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径

        //System.out.println(new Global().getRootPath());
        //System.out.println("jdbc:sqlite://" + new Global().getXmlPath());
        //System.out.println(sql);

        //String sql = "jdbc:sqlite://" + new Global().getXmlPath();

        try {
            Class.forName("org.sqlite.JDBC");//连接JDBC
            //  建立一个数据库名mydb的连接，如果不存在就在当前目录下创建之
            conn = DriverManager.getConnection(sql );
            stat = conn.createStatement();
        }catch (SQLException e) {
            System.out.println("init [SQL驱动程序初始化失败！]");
            e.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        /*
        try {
            // 连接SQLite的JDBC
            Class.forName("org.sqlite.JDBC");
            //  建立一个数据库名myDb的连接，如果不存在就在当前目录下创建之
            conn = DriverManager.getConnection(sql);
            //Statement stat = conn.createStatement();
/*
            stat.executeUpdate("insert into Data_Block values(20190612,'南部','长沙','地点','原因');");// 插入数据
            //stat.executeUpdate("insert into tbl1 values('LiSi',7800);");
            //stat.executeUpdate("insert into tbl1 values(\'WangWu\',5800);\");
            //stat.executeUpdate("insert into tbl1 values(\'ZhaoLiu\',9100);\");
            ResultSet rs = stat.executeQuery("select * from Data_Block;");// 查询数据
            System.out.println("创建表结构录入数据操作演示：");*/
/*
        }catch(Exception e){
            System.out.println("init [SQL驱动程序初始化失败！]");
            e.printStackTrace();
        }*/
    }

/*
    public static int addUpdDel(String sql){
        int i = 0;
        try{
            PreparedStatement ps =  conn.prepareStatement(sql);
            i = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return i;
    }
*/
    public static int addblock(Block_Data dat){
        try{
            String str = "insert into Data_Block " +
                    "values('"+dat.getTime()+"','"+dat.getUnit()+"','"+dat.getStation()+"','"+dat.getLocal()+"','"+dat.getSeason()+"','"+dat.getSys()+"','"+dat.getTag()+"')";

            //System.out.println(str);
            stat.executeUpdate(str);// 插入数据
            //stat.executeUpdate("insert into Data_Block values(20190612,'南部','长沙','地点','原因');");// 插入数据
            //stat.executeUpdate("insert into tbl1 values('LiSi',7800);");
            //stat.executeUpdate("insert into tbl1 values(\'WangWu\',5800);\");
            //stat.executeUpdate("insert into tbl1 values(\'ZhaoLiu\',9100);\");
            //ResultSet rs = stat.executeQuery("select * from Data_Block;");// 查询数据
            //System.out.println("创建表结构录入数据操作演示：");
            //System.out.println(rs.toString());


        }catch(Exception e){
            System.out.println("数据插入失败");
            e.printStackTrace();
        }
        return 0;
    }

    public static int adddev(Device_Data dat){
        if(dat == null) return 1;
        try{
            String str = "insert into Data_device " +
                    "values('"+dat.getCode()+"','"+dat.getSys()+"','"+dat.getStation() + "','"+dat.getDevtype()+"','"+dat.getUsetime()+"','" +
                    dat.getIsAll()+"','"+dat.getNum()+ "','"+dat.getProtype()+ "','"+dat.getSertype()+"')";
            //+"','" +  dat.getIsbad()+"','"+dat.getBadtime()+"','"+dat.getBadseason()
            //System.out.println(str);
            stat.executeUpdate(str);// 插入数据
        }catch(Exception e){
            System.out.println("数据插入失败");
            e.printStackTrace();
        }
        return 0;
    }

    public static int addres(Resourc_Data dat){
        if(dat == null) return 1;
        try{
            String str = "insert into Resourc_red " +
                    "values('"+dat.getStation() + "','"+dat.getDirection()+"','"+dat.getCapacity()+"','" +
                    dat.getUsageRate()+"')";
            //+"','" +  dat.getIsbad()+"','"+dat.getBadtime()+"','"+dat.getBadseason()
            //System.out.println(str);
            stat.executeUpdate(str);// 插入数据
        }catch(Exception e){
            System.out.println("数据插入失败");
            e.printStackTrace();
        }
        return 0;
    }

    public static int addequ(Equ_Data dat){
        if(dat == null) return 1;
        try{
            String str = "insert into Equipment_failure " +
                    "values('"+dat.getTime()+"','"+ dat.getName()+"','"+dat.getSeason() + "')";
            //System.out.println(str);
            stat.executeUpdate(str);// 插入数据
        }catch(Exception e){
            System.out.println("数据插入失败");
            e.printStackTrace();
        }
        return 0;
    }

    public static int addcommou(Commun_Data dat){
        if(dat == null) return 1;
        try{
            String str = "insert into Data_Communication " +
                    "values('"+dat.getSys()+"','"+dat.getTime()+"','"+dat.getStaS()+"','"+dat.getEndS()+"','"+dat.getO_star_st()+"','"+dat.getO_end_st()+"','" +
                    dat.getO_star_now()+"','"+dat.getO_end_now()+ "','"+dat.getAttenuation()+ "','"+dat.getErrorCode()+"')";
            //System.out.println(str);
            stat.executeUpdate(str);// 插入数据
        }catch(Exception e){
            System.out.println("数据插入失败");
            e.printStackTrace();
        }
        return 0;
    }
/*
    public static ResultSet selectSql(String sql){
        try {
            ps =  conn.prepareStatement(sql);
            rs =  ps.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("sql数据库查询异常");
            e.printStackTrace();
        }
        return rs;
    }
*/

    public static void closeConn(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("sql数据库关闭异常");
            e.printStackTrace();
        }
    }

}
