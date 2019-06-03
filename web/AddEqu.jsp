<%--
  Created by IntelliJ IDEA.
  User: cedar
  Date: 2019/5/26
  Time: 11:17
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
    <title>新增故障事件</title>
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
            <span>新增故障事件</span>
        </h1>
    </div>
    <div class="container">
        <form class="contact" action="AddEqu" method="post" id="form">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="badtime">时间</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="badtime" name="badtime" placeholder="Ex: 2019年1月">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="baddev">故障网元</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="baddev" name="baddev" placeholder="Ex: xx站xx系统xx网元">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="badseason">故障原因</label>
                </div>
                <div class="ctrl">
                    <textarea id="badseason" name="badseason" rows="6" cols="10"></textarea>
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