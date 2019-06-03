<%--
  Created by IntelliJ IDEA.
  User: cedar
  Date: 2019/5/23
  Time: 11:07
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
    <title>新增设备</title>
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
            <span>新增设备</span>
        </h1>
    </div>
    <div class="container">
        <form class="contact" action="AddDevice" method="post" id="form">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="code">网元名称</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="code" name="code" placeholder="Ex: xx站xx系统xx网元">
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
                    <label for="sta">所属台站</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="sta" name="sta" placeholder="Ex: xx站">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="type">设备类型</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="type" name="type" placeholder="Ex: OSN3500">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="usetime">开设时间</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="usetime" name="usetime" placeholder="Ex: 2019年1月">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="tag">备品备件是否齐全</label>
                </div>
                <div class="ctrl">
                    <input type="radio" id="tag" name="isall"value="是"checked>是
                    <input type="radio" name="isall"value="否">否<br>
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="num">备品备件数量</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="num" name="num" placeholder="Ex:15">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="protype">保护类型</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="protype" name="protype" placeholder="Ex: 复用段保护环">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="sertype">服务器容灾类型</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="sertype" name="sertype" placeholder="Ex: 双机热备份">
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