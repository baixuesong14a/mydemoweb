<%--
  Created by IntelliJ IDEA.
  User: cedar
  Date: 2019/5/23
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    //System.out.println(basePath);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增通信基础数据</title>
    <link href="css/demo.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--Framework-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
    <!--End Framework-->
    <script src="js/jquery.ffform.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#form').ffform({ animation: 'flip', submitButton: '#submit', validationIndicator: '#validation', errorIndicator: '#error', successIndicator: '#success', 'fields': [{ 'id': 'name', required: true, requiredMsg: 'Name is required', type: 'alpha', validate: true, msg: 'Invalid Name' }, { 'id': 'email', required: true, requiredMsg: 'E-Mail is required', type: 'email', validate: true, msg: 'Invalid E-Mail Address' }, { 'id': 'phone', required: false, type: 'custom', validate: false, msg: 'Invalid Phone #' }, { 'id': 'message', required: false, type: 'text', validate: false, msg: ''}] });
        });
    </script>
</head>

<body style="">
<section id="getintouch" class="bounceIn animated">
    <div class="container" style="border-bottom: 0;">
        <h1>
            <span>新增通信基础数据</span>
        </h1>
    </div>
    <div class="container">
        <form class="contact" action="AddCommun" method="post" id="form">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="sys">所属系统</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="sys" name="sys" placeholder="Ex: G01">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="time">时间</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="time" name="time" placeholder="Ex: 2019年1月">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="stas">起始台站</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="stas" name="stas" placeholder="Ex: xx站">
                </div>
            </div>

            <div class="row clearfix">
                <div class="lbl">
                    <label for="ends">终点台站</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="ends" name="ends" placeholder="Ex: xx站">
                </div>
            </div>

            <div class="row clearfix">
                <div class="lbl">
                    <label for="oss">起始站标准收光</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="oss" name="oss" placeholder="Ex: -xx.xx">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="oes">终点站标准收光</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="oes" name="oes" placeholder="Ex: -xx.xx">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="osn">起始站实际收光</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="osn" name="osn" placeholder="Ex: -xx.xx">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="oen">终点站实际收光</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="oen" name="oen" placeholder="Ex: -xx.xx">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="att">线路衰耗</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="att" name="att" placeholder="Ex: 30.6">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="err">误码计数</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="err" name="err" placeholder="Ex:562">
                </div>
            </div>
            <div class="row  clearfix">
                <div class="span10 offset2">
                    <input type="submit" class="submit" value="增加">
                </div>
            </div>
        </form>
    </div>
</section>
</body>
</html>