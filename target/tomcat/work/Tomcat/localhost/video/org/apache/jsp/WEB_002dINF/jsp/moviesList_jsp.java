/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-06-21 00:22:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class moviesList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tld/commons.tld", Long.valueOf(1556553922000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fp_005fpage_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fp_005fpage_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fp_005fpage_0026_005furl_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("    <title>视频管理</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->\r\n");
      out.write("    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js\"></script>\r\n");
      out.write("    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/confirm.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        th {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("        <!--小标签的值 -->\r\n");
      out.write("        var deleteNum = 0;\r\n");
      out.write("\r\n");
      out.write("        function selectAll(obj) {\r\n");
      out.write("            var value = obj.checked;\r\n");
      out.write("            var arr = document.getElementsByName(\"ids\");\r\n");
      out.write("            for (var i = 0; i < arr.length; i++) {\r\n");
      out.write("                arr[i].checked = value;\r\n");
      out.write("            }\r\n");
      out.write("            if (value) {\r\n");
      out.write("                deleteNum = arr.length;\r\n");
      out.write("            } else {\r\n");
      out.write("                deleteNum = 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $(\"#delNum\").text(deleteNum);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        <!-- 选择标签的全选和反选 -->\r\n");
      out.write("        function selectOne(obj) {\r\n");
      out.write("            if (obj.checked) {\r\n");
      out.write("                deleteNum += 1;\r\n");
      out.write("            } else {\r\n");
      out.write("                deleteNum -= 1;\r\n");
      out.write("            }\r\n");
      out.write("            if (deleteNum == 0) {\r\n");
      out.write("                document.getElementById(\"checkAllId\").checked = false;\r\n");
      out.write("            }\r\n");
      out.write("            var arr = document.getElementsByName(\"ids\");\r\n");
      out.write("            if (deleteNum == arr.length) {\r\n");
      out.write("                document.getElementById(\"checkAllId\").checked = true;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $(\"#delNum\").text(deleteNum);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        <!-- 批量删除的友好性提示 -->\r\n");
      out.write("        $(function() {\r\n");
      out.write("            $(\"#btn\").click(function() {\r\n");
      out.write("                if (deleteNum > 0) {\r\n");
      out.write("\r\n");
      out.write("                    Confirm.show('溫馨提示', '您確定要刪除这' + deleteNum + '条记录嗎？', {\r\n");
      out.write("                        'Delete' : {\r\n");
      out.write("                            'primary' : true,\r\n");
      out.write("                            'callback' : function() {\r\n");
      out.write("                                //不是ajax，模拟提交\r\n");
      out.write("                                $(\"#form2\").submit();\r\n");
      out.write("                                //如果是一个正常表单的提交，按钮必须是type=submit,并且必须在form表单里面\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                }else{\r\n");
      out.write("                    alert(\"您暂未选择任何数据，请选择您要删除的数据！\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 下拉框出现内容\r\n");
      out.write("        function showName(obj,id,type) {\r\n");
      out.write("            var name = $(obj).text();\r\n");
      out.write("\r\n");
      out.write("            if(type == 1) {\r\n");
      out.write("                $(\"#speaker_name\").html(name + \"<span class='caret'></span>\");\r\n");
      out.write("                $(\"#speaker_id\").val(id);\r\n");
      out.write("            }else {\r\n");
      out.write("                $(\"#course_name\").html(name + \"<span class='caret'></span>\");\r\n");
      out.write("                $(\"#course_id\").val(id);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\" style=\"margin-bottom:0px\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\"\r\n");
      out.write("                    data-target=\"#bs-example-navbar-collapse-9\"\r\n");
      out.write("                    aria-expanded=\"false\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">视频管理系统</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-9\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\"><a href=\"moviesList\">视频管理 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                <li><a href=\"personManager\">主讲人管理</a></li>\r\n");
      out.write("                <li><a href=\"classManager\">课程管理</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav  navbar-right\">\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"#\">admin</a></li>\r\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>&nbsp;&nbsp;&nbsp;退&nbsp;出</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div><!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("    </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"jumbotron\" style=\"padding-top:20px;padding-bottom:26px\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2>视频管理</h2>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-info\" onclick=\"location.href='addvideo'\">添加</button>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" id=\"btn\">批量删除\r\n");
      out.write("                <span class=\"badge\" id=\"delNum\">0</span>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("            <form class=\"form-inline navbar-right\" style=\"margin-right:10px\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/moviesList\" method=\"post\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"title\" id=\"exampleInputEmail3\" placeholder=\"标题\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single button -->\r\n");
      out.write("                <div class=\"btn-group\">\r\n");
      out.write("                    <button type=\"button\" id=\"speaker_name\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("                            aria-haspopup=\"true\"\r\n");
      out.write("                            aria-expanded=\"false\">\r\n");
      out.write("                        --请选择老师-- <span class=\"caret\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <input type=\"hidden\" name=\"speaker_id\" id=\"speaker_id\" value=\"0\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"btn-group\">\r\n");
      out.write("                    <button type=\"button\" id=\"course_name\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("                            aria-haspopup=\"true\"\r\n");
      out.write("                            aria-expanded=\"false\">\r\n");
      out.write("                        --请选择课程-- <span class=\"caret\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <input type=\"hidden\" name=\"course_id\" id=\"course_id\" value=\"0\" />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-info\">查&nbsp;询</button>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\" style=\"margin-top:20px;\">\r\n");
      out.write("    <form id=\"form2\" action=\"deleteBatchVideos\" method=\"post\">\r\n");
      out.write("        <table class=\"table table-bordered table-hover table-striped\" style=\"text-align:center; table-layout:fixed;\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th style=\"width: 5%;\"><input type=\"checkbox\" onclick=\"selectAll(this)\" id=\"checkAllId\"/></th>\r\n");
      out.write("                <th style=\"width: 5%;\">序号</th>\r\n");
      out.write("                <th style=\"width: 17%;\">名称</th>\r\n");
      out.write("                <th>介绍</th>\r\n");
      out.write("                <th style=\"width: 8%;\">讲师</th>\r\n");
      out.write("                <th style=\"width: 8%;\">时长</th>\r\n");
      out.write("                <th style=\"width: 8%;\">播放次数</th>\r\n");
      out.write("                <th style=\"width: 5%;\">编辑</th>\r\n");
      out.write("                <th style=\"width: 5%;\">删除</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"navbar-right\" style=\"padding-right:130px; margin-top: -15px\">\r\n");
      out.write("    ");
      if (_jspx_meth_p_005fpage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('[data-toggle=\"popover\"]').popover();\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/moviesList.jsp(185,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/moviesList.jsp(185,24) '${speakerList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${speakerList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/moviesList.jsp(185,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("speaker");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${speaker.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"><a href=\"#\" onclick=\"showName(this, ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${speaker.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(", 1)\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${speaker.speaker_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a> </li>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/moviesList.jsp(198,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/moviesList.jsp(198,24) '${courseList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${courseList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/moviesList.jsp(198,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("course");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"><a href=\"#\" onclick=\"showName(this, ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(", 2)\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course.course_title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a> </li>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/jsp/moviesList.jsp(229,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/moviesList.jsp(229,12) '${page.rows}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${page.rows}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/moviesList.jsp(229,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("list1");
    // /WEB-INF/jsp/moviesList.jsp(229,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVarStatus("var");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td style=\"padding-top:15px\"><input type=\"checkbox\" name=\"ids\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list1.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" onclick=\"selectOne(this)\"/></td>\r\n");
          out.write("                    <td style=\"padding-top:15px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${var.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                    <td style=\"padding-top:15px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list1.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                    <td style=\"padding-top:15px; overflow:hidden; white-space: nowrap;  text-overflow: ellipsis;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list1.detail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                    <td style=\"padding-top:15px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list1.speaker_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                    <td style=\"padding-top:15px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list1.showTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                    <td style=\"padding-top:15px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list1.play_num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                    <td style=\"padding-top:15px\"><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/edit?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list1.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                        <span class=\"glyphicon glyphicon-edit\"></span></a></td>\r\n");
          out.write("                    <td style=\"padding-top:15px\">\r\n");
          out.write("                        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/deleteVideo?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list1.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                            <span class=\"glyphicon glyphicon-trash\"></span>\r\n");
          out.write("                        </a>\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_p_005fpage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  p:page
    com.qfedu.utils.NavigationTag _jspx_th_p_005fpage_005f0 = (com.qfedu.utils.NavigationTag) _005fjspx_005ftagPool_005fp_005fpage_0026_005furl_005fnobody.get(com.qfedu.utils.NavigationTag.class);
    _jspx_th_p_005fpage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_p_005fpage_005f0.setParent(null);
    // /WEB-INF/jsp/moviesList.jsp(254,4) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fpage_005f0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/moviesList", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_p_005fpage_005f0 = _jspx_th_p_005fpage_005f0.doStartTag();
    if (_jspx_th_p_005fpage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fp_005fpage_0026_005furl_005fnobody.reuse(_jspx_th_p_005fpage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fp_005fpage_0026_005furl_005fnobody.reuse(_jspx_th_p_005fpage_005f0);
    return false;
  }
}
