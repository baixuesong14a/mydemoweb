package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.devDao;
import com.javaweb.demo.dao.impl.devDaoImpl;
import com.javaweb.demo.entity.Device_Data;
import com.javaweb.demo.util.Automation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddDeviceServlet  extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //获取jsp页面传过来的参数
        String code = request.getParameter("code");
        String sys = request.getParameter("sys");
        String sta = request.getParameter("sta");
        String type = request.getParameter("type");
        String usetime = request.getParameter("usetime");
        String isall = request.getParameter("isall");
        String num = request.getParameter("num");
        String protype = request.getParameter("protype");
        String sertype = request.getParameter("sertype");

        //String isbad = request.getParameter("isbad");
        //String badtime = request.getParameter("badtime");
        //String badseason = request.getParameter("badseason");


        //System.out.println(time);

        Device_Data devicedata = new Device_Data(); //实例化一个对象，组装属性

        devicedata.set(code,sys,sta,type,usetime,isall,num,protype,sertype);//赋值

        //System.out.println(blockthing.getTime() + blockthing.getSeason());
        //blockDao blockDao = new blockDaoImpl();
        devDao devdao = new devDaoImpl();
        if(devdao.add(devicedata)){
            Automation a = new Automation();
            a.Auto_protest();
            //System.out.println("success");
            //request.setAttribute("username", );  //向request域中放置参数
            //request.setAttribute("xiaoxi", "注册成功");
            request.getRequestDispatcher("/success.jsp").forward(request, response);  //转发到登录页面
        }else{
            request.getRequestDispatcher("/fail.jsp").forward(request, response);  //转发到登录页面
        }
    }
}
