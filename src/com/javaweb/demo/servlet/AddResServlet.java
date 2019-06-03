package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.ResourcDao;
import com.javaweb.demo.dao.impl.ResourcDaoImpl;
import com.javaweb.demo.entity.Resourc_Data;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddResServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //System.out.println("addresservlet is used");
        //获取jsp页面传过来的参数
        String station = request.getParameter("station");
        String direction = request.getParameter("direction");
        String capacity = request.getParameter("capacity");
        String UsageRate = request.getParameter("UsageRate");

        Resourc_Data resourcdata = new Resourc_Data();
        resourcdata.set(station,direction,capacity,UsageRate);
        //System.out.println(resourcdata.getStation());

        ResourcDao resourcDao = new ResourcDaoImpl();
        if(resourcDao.add(resourcdata)){
            request.getRequestDispatcher("/success.jsp").forward(request, response);  //转发到登录页面
        }else{
            request.getRequestDispatcher("/fail.jsp").forward(request, response);  //转发到登录页面
        }
    }
}
