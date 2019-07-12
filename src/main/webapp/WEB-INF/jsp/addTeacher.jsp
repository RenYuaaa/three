<%--
  Created by IntelliJ IDEA.
  User: 蒙奇·D·辉辉
  Date: 2019/6/12
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加或修改主讲人</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">


    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <![endif]-->
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>

</head>
<body>
<div>
    <nav class="navbar navbar-inverse" style="margin-bottom: 0px;">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-9"
                        aria-expanded="false">
                    <span class="sr-only"></span>
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
                    <li class="active"><a href="personManager">主讲人管理</a></li>
                    <li><a href="classManager">课程管理</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">admin</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-log-out"></span>&nbsp;退&nbsp;出</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->

        </div><!-- /.container-fluid -->
    </nav>

    <div class="jumbotron" style="height: 100px;padding-bottom: 30px;padding-top: 20px;">

        <div class="container">
            <c:if test="${empty speaker.id}">
                <h2>添加主讲人</h2>
            </c:if>
            <c:if test="${not empty speaker.id}">
                <h2>修改主讲人</h2>
            </c:if>
        </div>

    </div>
    <div class="container">
        <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/saveOrUpdateTeacher">
            <c:if test="${empty speaker.id}">
                <input name="id" value="0" type="hidden" />
            </c:if>
            <c:if test="${not empty speaker.id}">
                <input name="id" value="${speaker.id}" type="hidden" />
            </c:if>
            <div class="form-group">
                <label class="col-sm-2 control-label">姓名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="speaker_name" value="${speaker.speaker_name}" placeholder="主讲人姓名">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">职位</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="speaker_job" value="${speaker.speaker_job}" placeholder="主讲人职位">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">头像地址</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="head_img_url" value="${speaker.head_img_url}" placeholder="主讲人头像">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">简介</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="speaker_desc" value="${speaker.speaker_desc}" placeholder="主讲人简介">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default" onclick="location.href='personManager'">保存</button>
                </div>
            </div>
        </form>
    </div>
</div>


<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>

