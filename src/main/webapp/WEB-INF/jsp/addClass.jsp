<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 蒙奇·D·辉辉
  Date: 2019/6/12
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加或修改课程</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">


    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->

    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>

    <script>
        // 下拉框出现内容
        function showName(obj,id) {
            var name = $(obj).text();
            $("#course_name").val(name);
            $("#course_id").val(id);
        }

        //修改时下拉框对应的input框显示有值
        $(function () {
            var course_id = '${courseList.id}';
            $("#selectSubject li").each(function () {

                if ($(this).val() == course_id) {
                    $("#course_name").val($(this).text());
                }
            });

        });

    </script>
</head>
<body>
<div>
    <nav class="navbar navbar-inverse" style="margin-bottom: 0px;">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-9"
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
                    <li><a href="personManager">主讲人管理</a></li>
                    <li class="active"><a href="classManager">课程管理</a></li>
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
            <c:if test="${empty courseList.id}">
                <h2>添加课程</h2>
            </c:if>
            <c:if test="${not empty courseList.id}">
                <h2>修改课程</h2>
            </c:if>
        </div>

    </div>
    <div class="container">
        <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/saveOrUpdateClass">
            <c:if test="${empty courseList.id}">
                <input name="id" value="0" type="hidden" />
            </c:if>
            <c:if test="${not empty courseList.id}">
                <input name="id" value="${courseList.id}" type="hidden" />
            </c:if>
            <div class="form-group">
                <label for="lastname" class="col-sm-2 control-label">所属学科</label>
                <div class="col-lg-10">
                    <div class="input-group">
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                                    aria-expanded="false">下拉菜单 <span class="caret"></span></button>
                            <ul id="selectSubject" class="dropdown-menu">
                                <c:forEach items="${subjectList}" var="subject">
                                    <li value="${subject.id}"><a href="#" onclick="showName(this, ${subject.id})">${subject.subjectName}</a> </li>
                                </c:forEach>
                            </ul>
                        </div>
                        <c:if test="${empty courseList.id}">
                            <input type="hidden" name="id" id="course_id" value="0" />
                        </c:if>
                        <c:if test="${not empty courseList.id}">
                            <input type="hidden" name="id" id="course_id" value="${courseList.id}" />
                        </c:if>
                        <input type="text" id="course_name" disabled class="form-control" aria-label="...">
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label for="lastname" class="col-sm-2 control-label">标题</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="lastname" name="course_title" value="${courseList.course_title}" placeholder="课程标题">
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">简介</label>
                <div class="col-sm-10">
                    <textarea class="form-control" name="course_desc" rows="3">${courseList.course_desc}</textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default" onclick="location.href='classManager'">保存</button>
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

