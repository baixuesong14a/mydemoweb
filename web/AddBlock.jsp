<%--
  Created by IntelliJ IDEA.
  User: cedar
  Date: 2019/5/19
  Time: 21:04
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
    <title>新增阻断事件</title>
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
            <span>新增阻断事件</span>
        </h1>
    </div>
    <div class="container">
        <form class="contact" action="AddBlock" method="post" id="form">
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
                    <label for="unit">所属方向</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="unit" name="unit" placeholder="Ex: 南部战区">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="station">所属台站</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="station" name="station" placeholder="Ex: 长沙站">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="local">阻断地点</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="local" name="local" placeholder="Ex: xx站至xx站据xx站xx公里">
                </div>
            </div>
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
                    <label for="tag">阻断类别</label>
                </div>
                <div class="ctrl">
                    <input type="radio" id="tag" name="tag"value="人为"checked>人为
                    <input type="radio" name="tag"value="自然">自然
                    <input type="radio" name="tag"value="割接">割接<br>
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="season">阻断原因</label>
                </div>
                <div class="ctrl">
                    <textarea id="season" name="season" rows="6" cols="10"></textarea>
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