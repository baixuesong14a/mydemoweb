<%--
  Created by IntelliJ IDEA.
  User: cedar
  Date: 2019/5/23
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>执勤指标数据维护系统</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/fontAwesome.css">
    <link rel="stylesheet" href="css/hero-slider.css">
    <link rel="stylesheet" href="css/templatemo-main.css">
    <link rel="stylesheet" href="css/owl-carousel.css">

    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">
    <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>

<body>
<div class="fixed-side-navbar">
    <ul class="nav flex-column">
        <li class="nav-item"><a class="nav-link" href="#home"><span>Intro</span></a></li>
        <li class="nav-item"><a class="nav-link" href="#services"><span>Services</span></a></li>
        <li class="nav-item"><a class="nav-link" href="#portfolio"><span>Portfolio</span></a></li>
        <li class="nav-item"><a class="nav-link" href="#our-story"><span>Our Story</span></a></li>
        <li class="nav-item"><a class="nav-link" href="#contact-us"><span>Contact Us</span></a></li>
    </ul>
</div>

<div class="parallax-content baner-content" id="home">
    <div class="container">
        <div class="first-content">
            <h1>数据采集系统</h1>
            <span><em>21站</em>v0.0.1 版本</span>
            <div class="primary-button">
                <a href="#services">Discover More</a>
            </div>
        </div>
    </div>
</div>


<div class="service-content" id="services">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="left-text">
                    <h4>关于数据录入系统</h4>
                    <div class="line-dec"></div>
                    <p>这个系统……</p>
                    <ul>
                        <li>-  数据采集</li>
                        <li>-  数据分析</li>
                        <li>-  图形展示</li>
                        <li>-  辅助决策</li>
                    </ul>
                    <div class="primary-button">
                        <a href="http://localhost:8075/webroot/decision/v10/entry/access/b780ce36-b49b-45f8-aa06-4aa3a911d03b?preview=true">查看数据信息</a>
                    </div>
                </div>
            </div>

            <div class="col-md-8">
                <div class="row">
                        <div class="col-md-6">
                            <a href="AddBlock.jsp">
                            <div class="service-item">
                                <h4>新增阻断事件</h4>
                                <div class="line-dec"></div>
                                <p></p>
                            </div>
                            </a>
                        </div>
                    <div class="col-md-6">
                        <a href="AddCommun.jsp">
                        <div class="service-item">
                            <h4>通信数据录入</h4>
                            <div class="line-dec"></div>
                            <p></p>
                        </div>
                        </a>>
                    </div>
                    <div class="col-md-6">
                        <a href="AddDevice.jsp">
                        <div class="service-item">
                            <h4>新增设备</h4>
                            <div class="line-dec"></div>
                            <p></p>
                        </div>
                        </a>>
                    </div>
                    <div class="col-md-6">
                        <a href="AddEqu.jsp">
                        <div class="service-item">
                            <h4>新增故障</h4>
                            <div class="line-dec"></div>
                            <p></p>
                        </div>
                        </a>>
                    </div>
                    <div class="col-md-6">
                        <a href="AddRes.jsp">
                        <div class="service-item">
                            <h4>更改使用率</h4>
                            <div class="line-dec"></div>
                            <p></p>
                        </div>
                        </a>>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="js/vendor/jquery-1.11.2.min.js"></script>
<script src="js/vendor/bootstrap.min.js"></script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script>
<script>
    function openCity(cityName) {
        var i;
        var x = document.getElementsByClassName("city");
        for (i = 0; i < x.length; i++) {
            x[i].style.display = "none";
        }
        document.getElementById(cityName).style.display = "block";
    }
</script>

<script>
    $(document).ready(function(){
        // Add smooth scrolling to all links
        $(".fixed-side-navbar a, .primary-button a").on('click', function(event) {

            // Make sure this.hash has a value before overriding default behavior
            if (this.hash !== "") {
                // Prevent default anchor click behavior
                event.preventDefault();

                // Store hash
                var hash = this.hash;

                // Using jQuery's animate() method to add smooth page scroll
                // The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area
                $('html, body').animate({
                    scrollTop: $(hash).offset().top
                }, 800, function(){

                    // Add hash (#) to URL when done scrolling (default click behavior)
                    window.location.hash = hash;
                });
            } // End if
        });
    });
</script>
</body>
</html>