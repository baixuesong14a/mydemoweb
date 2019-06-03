package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.CommunDao;
import com.javaweb.demo.dao.impl.CommunDaoImpl;
import com.javaweb.demo.dao.blockDao;
import com.javaweb.demo.entity.Commun_Data;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddCommunServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //获取jsp页面传过来的参数
        String sys = request.getParameter("sys");
        String time = request.getParameter("time");
        String stas = request.getParameter("stas");
        String ends = request.getParameter("ends");
        String oss = request.getParameter("oss");
        String oes = request.getParameter("oes");
        String osn = request.getParameter("osn");
        String oen = request.getParameter("oen");
        String att = request.getParameter("att");
        String err = request.getParameter("err");

        //System.out.println(time);

        Commun_Data commundata = new Commun_Data(); //实例化一个对象，组装属性

       commundata.set(sys,time,stas,ends,oss,oes,osn,oen,att,err);//赋值

        //System.out.println(blockthing.getTime() + blockthing.getSeason());
        //blockDao blockDao = new blockDaoImpl();
        CommunDao commundao = new CommunDaoImpl();
        if(commundao.add(commundata)){
            request.getRequestDispatcher("/success.jsp").forward(request, response);  //转发到成功页面
        }else{
            request.getRequestDispatcher("/fail.jsp").forward(request, response);  //转发到失败页面
        }
    }
}
