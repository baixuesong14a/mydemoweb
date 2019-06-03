package com.javaweb.demo.util;

import java.sql.*;
import java.util.Calendar;

public class Automation {
    public void  Auto_protest(){
        Calendar date = Calendar.getInstance();
        //String years = String.valueOf();
        int years = date.get(Calendar.YEAR);

        //System.out.println("数据库更新");
        Connection conn = null;
        Statement stat = null;
        //DBconn.init();
        try {
            double total = 0.0;
            double prodev = 0;
            double proser = 0;
            double old = 0;
            Class.forName("org.sqlite.JDBC");//连接JDBC
            conn = DriverManager.getConnection("jdbc:sqlite://E:\\Workspaces\\IDEA\\demoweb\\web\\DB\\mydb.db" );
            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select * from Data_device where 所属台站 = '21';");// 查询数据
            while (rs.next()) {
                int flag = 0;
                total ++;
                if(rs.getString(6) != "否") flag = 1;
                if(rs.getString(8) != "无")  prodev += 1 ;
                if(rs.getString(9) != "无")  proser += 1;

                int year = Integer.parseInt(rs.getString(2).substring(0,4));
                int bj = years - year;
                if(bj > 15) { old += 100; }
                else if(bj <= 15 && bj > 10) {
                    old = bj*6 - 5;
                    if(flag == 1) old += 15;
                }
                else if(bj > 0 && bj <= 10) {
                    old = 115 - 6 * bj;
                    if(flag == 1) old += 15;
                }
            }

            String sql = "UPDATE Indicator_statistics set 机线设备保护率 = " + String.valueOf(prodev/total) +  ",服务器容灾率 = " + String.valueOf(proser/total) +
                    ",机线设备老旧率 = " + String.valueOf(old/total) + ",传输系统保护率 = " + String.valueOf(prodev/total) +" where 台站 = '21';";
            stat.executeUpdate(sql);

            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //  建立一个数据库名mydb的连接，如果不存在就在当前目录下创建之
    }

    public void Auto_Commun(){
        Connection conn = null;
        Statement stat = null;
        //DBconn.init();
        int total = 0;
        int standard = 0;
        int err = 0;

        try {
            Class.forName("org.sqlite.JDBC");//连接JDBC
            conn = DriverManager.getConnection("jdbc:sqlite://E:\\Workspaces\\IDEA\\demoweb\\web\\DB\\mydb.db");
            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select * from Data_Communication where 起始台站 = '21';");// 查询数据
            while (rs.next()) {
                total += 2;
                if( Math.abs(Integer.parseInt(rs.getString(5))-Integer.parseInt(rs.getString(7)))> 3){
                    standard += 1;
                }
                if( Math.abs(Integer.parseInt(rs.getString(6))-Integer.parseInt(rs.getString(8)))> 3){
                    standard += 1;
                }
                if(Integer.parseInt(rs.getString(10)) > 100){
                    err += 1;
                }
                String sql = "UPDATE Indicator_statistics set 再生段合格率 = " + String.valueOf(standard/total) + ",主光合格率 = " +
                        String.valueOf(err/total)+ ",传输质量合格率 = " + String.valueOf((standard + err)/(total * 2)) + " where 台站 = '21';";
                stat.executeUpdate(sql);
            }

            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
