<%--
  Created by IntelliJ IDEA.
  User: 蒙奇·D·辉辉
  Date: 2019/6/12
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="p" uri="http://yanzhenwei.com/common/" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>视频管理</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/confirm.js"></script>


    <style type="text/css">
        th {
            text-align: center;
        }
    </style>

    <script>

        <!--小标签的值 -->
        var deleteNum = 0;

        function selectAll(obj) {
            var value = obj.checked;
            var arr = document.getElementsByName("ids");
            for (var i = 0; i < arr.length; i++) {
                arr[i].checked = value;
            }
            if (value) {
                deleteNum = arr.length;
            } else {
                deleteNum = 0;
            }

            $("#delNum").text(deleteNum);
        }

        <!-- 选择标签的全选和反选 -->
        function selectOne(obj) {
            if (obj.checked) {
                deleteNum += 1;
            } else {
                deleteNum -= 1;
            }
            if (deleteNum == 0) {
                document.getElementById("checkAllId").checked = false;
            }
            var arr = document.getElementsByName("ids");
            if (deleteNum == arr.length) {
                document.getElementById("checkAllId").checked = true;
            }

            $("#delNum").text(deleteNum);
        }

        <!-- 批量删除的友好性提示 -->
        $(function() {
            $("#btn").click(function() {
                if (deleteNum > 0) {

                    Confirm.show('溫馨提示', '您確定要刪除这' + deleteNum + '条记录嗎？', {
                        'Delete' : {
                            'primary' : true,
                            'callback' : function() {
                                //不是ajax，模拟提交
                                $("#form2").submit();
                                //如果是一个正常表单的提交，按钮必须是type=submit,并且必须在form表单里面
                            }
                        }
                    });

                }else{
                    alert("您暂未选择任何数据，请选择您要删除的数据！");
                }

            });

        });

        // 下拉框出现内容
        function showName(obj,id,type) {
            var name = $(obj).text();

            if(type == 1) {
                $("#speaker_name").html(name + "<span class='caret'></span>");
                $("#speaker_id").val(id);
            }else {
                $("#course_name").html(name + "<span class='caret'></span>");
                $("#course_id").val(id);
            }
        }
    </script>

</head>
<body>


<nav class="navbar navbar-inverse" style="margin-bottom:0px">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-9"
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
                <li class="active"><a href="moviesList">视频管理 <span class="sr-only">(current)</span></a></li>
                <li><a href="personManager">主讲人管理</a></li>
                <li><a href="classManager">课程管理</a></li>
            </ul>
            <ul class="nav navbar-nav  navbar-right">

                <li><a href="#">admin</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;&nbsp;退&nbsp;出</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->

    </div><!-- /.container-fluid -->
</nav>


<div class="jumbotron" style="padding-top:20px;padding-bottom:26px">
    <div class="container">
        <h2>视频管理</h2>
    </div>
</div>

<div class="container">

    <div class="row">
        <div class="col-md-6">
            <button type="button" class="btn btn-info" onclick="location.href='addvideo'">添加</button>

            <button type="button" class="btn btn-primary" id="btn">批量删除
                <span class="badge" id="delNum">0</span>
            </button>
        </div>
        <div class="col-md-6">
            <form class="form-inline navbar-right" style="margin-right:10px" action="${pageContext.request.contextPath}/moviesList" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" name="title" id="exampleInputEmail3" placeholder="标题">
                </div>

                <!-- Single button -->
                <div class="btn-group">
                    <button type="button" id="speaker_name" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"
                            aria-haspopup="true"
                            aria-expanded="false">
                        --请选择老师-- <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <c:forEach items="${speakerList}" var="speaker">
                            <li value="${speaker.id}"><a href="#" onclick="showName(this, ${speaker.id}, 1)">${speaker.speaker_name}</a> </li>
                        </c:forEach>
                    </ul>
                    <input type="hidden" name="speaker_id" id="speaker_id" value="0" />
                </div>
                <div class="btn-group">
                    <button type="button" id="course_name" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"
                            aria-haspopup="true"
                            aria-expanded="false">
                        --请选择课程-- <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <c:forEach items="${courseList}" var="course">
                            <li value="${course.id}"><a href="#" onclick="showName(this, ${course.id}, 2)">${course.course_title}</a> </li>
                        </c:forEach>
                    </ul>
                    <input type="hidden" name="course_id" id="course_id" value="0" />
                </div>

                <button type="submit" class="btn btn-info">查&nbsp;询</button>
            </form>

        </div>
    </div>

</div>
<div class="container" style="margin-top:20px;">
    <form id="form2" action="deleteBatchVideos" method="post">
        <table class="table table-bordered table-hover table-striped" style="text-align:center; table-layout:fixed;">
            <thead>
            <tr>
                <th style="width: 5%;"><input type="checkbox" onclick="selectAll(this)" id="checkAllId"/></th>
                <th style="width: 5%;">序号</th>
                <th style="width: 17%;">名称</th>
                <th>介绍</th>
                <th style="width: 8%;">讲师</th>
                <th style="width: 8%;">时长</th>
                <th style="width: 8%;">播放次数</th>
                <th style="width: 5%;">编辑</th>
                <th style="width: 5%;">删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${page.rows}" var="list1" varStatus="var">
                <tr>
                    <td style="padding-top:15px"><input type="checkbox" name="ids" value="${list1.id}" onclick="selectOne(this)"/></td>
                    <td style="padding-top:15px">${var.count}</td>
                    <td style="padding-top:15px">${list1.title}</td>
                    <td style="padding-top:15px; overflow:hidden; white-space: nowrap;  text-overflow: ellipsis;">${list1.detail}</td>
                    <td style="padding-top:15px">${list1.speaker_name}</td>
                    <td style="padding-top:15px">${list1.showTime}</td>
                    <td style="padding-top:15px">${list1.play_num}</td>
                    <td style="padding-top:15px"><a href="${pageContext.request.contextPath}/edit?id=${list1.id}">
                        <span class="glyphicon glyphicon-edit"></span></a></td>
                    <td style="padding-top:15px">
                        <a href="${pageContext.request.contextPath}/deleteVideo?id=${list1.id}">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                </tr>
            </c:forEach>

            </tbody>
        </table>

    </form>
</div>
<div class="navbar-right" style="padding-right:130px; margin-top: -15px">
    <p:page url="${pageContext.request.contextPath}/moviesList"></p:page>
</div>

<script type="text/javascript">
    $(function () {
        $('[data-toggle="popover"]').popover();
    })
</script>
</body>
</html>
