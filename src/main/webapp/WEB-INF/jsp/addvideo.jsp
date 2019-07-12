<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 蒙奇·D·辉辉
  Date: 2019/6/12
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加或修改视频</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">


    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>

    <![endif]-->
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">
        // 下拉框出现内容
        function showName(obj,id,type) {
            var name = $(obj).text();

            if(type == 1) {
                $("#speaker_name").val(name);
                $("#speaker_id").val(id);
            }else {
                $("#course_name").val(name);
                $("#course_id").val(id);
            }
        }

        //修改时下拉框对应的input框显示有值
        $(function () {
            var speaker_id = '${video.speaker_id}';

            $("#selectSpeaker li").each(function () {

                if ($(this).val() == speaker_id) {
                    $("#speaker_name").val($(this).text());
                }
            });

            var course_id = '${video.course_id}';
            $("#selectCourse li").each(function () {

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
                    <li class="active"><a href="moviesList">视频管理</a></li>
                    <li><a href="personManager">主讲人管理</a></li>
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
            <c:if test="${empty video.id}">
                <h2>添加视频信息</h2>
            </c:if>
            <c:if test="${not empty video.id}">
                <h2>修改视频信息</h2>
            </c:if>

        </div>

    </div>
    <div class="container">
        <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/saveOrUpdate">
            <c:if test="${empty video.id}">
                <input name="id" value="0" type="hidden" />
            </c:if>
            <c:if test="${not empty video.id}">
                <input name="id" value="${video.id}" type="hidden" />
            </c:if>
            <div class="form-group">
                <label class="col-sm-2 control-label">名称</label>
                <div class="col-sm-10">
                    <input type="text" name="title" value="${video.title}" class="form-control" placeholder="视频名称">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">教师名字</label>
                <div class="col-lg-10">
                    <div class="input-group">
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown"
                                    aria-haspopup="true"
                                    aria-expanded="false">下拉菜单 <span class="caret"></span></button>
                            <ul id="selectSpeaker" class="dropdown-menu">
                                <c:forEach items="${speakerList}" var="speaker">
                                    <li value="${speaker.id}"><a href="#" onclick="showName(this, ${speaker.id}, 1)">${speaker.speaker_name}</a> </li>
                                </c:forEach>
                            </ul>
                        </div><!-- /btn-group -->
                        <c:if test="${empty video.speaker_id}">
                            <input type="hidden" name="speaker_id" id="speaker_id" value="0" />
                        </c:if>
                        <c:if test="${not empty video.speaker_id}">
                            <input type="hidden" name="speaker_id" id="speaker_id" value="${video.speaker_id}" />
                        </c:if>
                        <input type="text" class="form-control" disabled id="speaker_name" aria-label="...">
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">所属课程</label>
                <div class="col-lg-10">
                    <div class="input-group">
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown"
                                    aria-haspopup="true"
                                    aria-expanded="false">下拉菜单 <span class="caret"></span></button>
                            <ul id="selectCourse" class="dropdown-menu">
                                <c:forEach items="${courseList}" var="course">
                                    <li value="${course.id}"><a href="#" onclick="showName(this, ${course.id}, 2)">${course.course_title}</a> </li>
                                </c:forEach>
                            </ul>
                        </div><!-- /btn-group -->
                        <c:if test="${empty video.course_id}">
                            <input type="hidden" name="course_id" id="course_id" value="0" />
                        </c:if>
                        <c:if test="${not empty video.course_id}">
                            <input type="hidden" name="course_id" id="course_id" value="${video.course_id}" />
                        </c:if>
                        <input type="text" class="form-control" disabled id="course_name" aria-label="...">
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">时长</label>
                <div class="col-sm-10">
                    <c:if test="${empty video.time}">
                        <input type="number" class="form-control" value="0" name="time" placeholder="精确到毫秒（正整数）">
                    </c:if>
                    <c:if test="${not empty video.time}">
                        <input type="number" class="form-control" value="${video.time}" name="time"
                               placeholder="精确到毫秒（正整数）">
                    </c:if>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">封面图片地址</label>
                <div class="col-sm-10">
                    <input type="text" name="image_url" value="${video.image_url}" class="form-control" placeholder="具体的url">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">视频播放地址</label>
                <div class="col-sm-10">
                    <input type="text" name="video_url" value="${video.video_url}" class="form-control" placeholder="具体的URL">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">介绍</label>
                <div class="col-sm-10">
                    <textarea name="detail" class="form-control" rows="3">${video.detail}</textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">保存</button>
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

