package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.EquDao;
import com.javaweb.demo.dao.impl.EquDaoImpl;
import com.javaweb.demo.entity.Equ_Data;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddEquServlet  extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //获取jsp页面传过来的参数
        String time = request.getParameter("badtime");
        String name = request.getParameter("baddev");
        String season = request.getParameter("badseason");

        Equ_Data equdata = new Equ_Data();

        EquDao equdao = new EquDaoImpl();
        if(equdao.add(equdata)){
            request.getRequestDispatcher("/success.jsp").forward(request, response);  //转发到登录页面
        }else{
            request.getRequestDispatcher("/fail.jsp").forward(request, response);  //转发到登录页面
        }
    }
}
