<%--
  Created by IntelliJ IDEA.
  User: 蒙奇·D·辉辉
  Date: 2019/6/12
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="p" uri="http://yanzhenwei.com/common/" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>课程管理</title>
    <!-- <style type="text/css">
        tr {
            text-align: center;
        }
    </style> -->

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/confirm.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>

</head>
<body>
<nav class="navbar navbar-inverse" style="margin-bottom: 0px">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-9"
                    aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">视频管理系统</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-9">
            <ul class="nav navbar-nav">
                <li><a href="moviesList">视频管理</a></li>
                <li><a href="personManager">主讲人管理</a></li>
                <li class="active"><a href="classManager">课程管理</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">admit</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in" aria-hidden="true">&nbsp;退&nbsp;出</span></a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<!-- 巨幕 -->
<div class="jumbotron" , class="container" style="padding-bottom: 28px;padding-top: 20px;">
    <h2 class="container">课程管理</h2>
</div>

<!-- 按钮 -->
<div class="row; container">
    <div class="col-md-6">
        <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                aria-expanded="false" onclick="location.href='addClass'">添加</button>
    </div>
</div>

<!-- 表格 -->
<div class="container" style="margin-top:20px;">
    <table class="table table-bordered table-hover table-striped" style="text-align:center; table-layout:fixed;">
    <thead>
    <tr>
        <th style="text-align:center; width: 7%;">序号</th>
        <th style="text-align:center; width: 20%;">标题</th>
        <th style="text-align:center;">简介</th>
        <th style="text-align:center; width: 7%;">编辑</th>
        <th style="text-align:center; width: 7%;">删除</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.rows}" var="list1" varStatus="var">
        <tr>
            <td>${var.count}</td>
            <td>${list1.course_title}</td>
            <td style="overflow:hidden; white-space: nowrap;  text-overflow: ellipsis;">${list1.course_desc}</td>
            <td><a href="${pageContext.request.contextPath}/editClass?id=${list1.id}"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a></td>
            <td><a href="${pageContext.request.contextPath}/deleteClass?id=${list1.id}"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>
        </tr>
    </c:forEach>


    </tbody>
    </table>

</div>
<!-- 分页 -->
<div class="navbar-right" style="padding-right:130px; margin-top: -15px">
    <p:page url="${pageContext.request.contextPath}/classManager"></p:page>
</div>


<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function() {
        $('[data-toggle="popover"]').popover()
    })
</script>
</body>
</html>

