package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.blockDao;
import com.javaweb.demo.dao.impl.blockDaoImpl;
import com.javaweb.demo.entity.Block_Data;
import com.javaweb.demo.entity.User;
import com.javaweb.demo.util.Automation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddBlockServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //System.out.println("成功执行dopost");

        //System.out.println(request.toString());

        //获取jsp页面传过来的参数
        String time = request.getParameter("time");
        String unit = request.getParameter("unit");
        String station = request.getParameter("station");
        String local = request.getParameter("local");
        String season = request.getParameter("season");
        String sys = request.getParameter("sys");
        String tag = request.getParameter("tag");
        //System.out.println(time);

        Block_Data blockthing = new Block_Data(); //实例化一个对象，组装属性

        blockthing.setTime(time);
        blockthing.setUnit(unit);
        blockthing.setStation(station);
        blockthing.setLocal(local);
        blockthing.setSeason(season);
        blockthing.setSys(sys);
        blockthing.setTag(tag);


        //System.out.println(blockthing.getTime() + blockthing.getSeason());
        blockDao blockDao = new blockDaoImpl();

        if(blockDao.add(blockthing)){
            new Automation().Auto_Commun();
            request.getRequestDispatcher("/success.jsp").forward(request, response);  //转发到成功页面
        }else{
            request.getRequestDispatcher("/fail.jsp").forward(request, response);  //转发到失败页面
        }
    }
}
