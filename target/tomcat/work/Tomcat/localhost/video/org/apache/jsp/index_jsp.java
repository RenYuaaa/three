/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-06-28 00:56:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Web前端视频教程,大数据视频教程,HTML5视频教程,UI视频教程,PHP视频教程,java视频教程,python基础教程\">\r\n");
      out.write("    <meta name=\"description\" content=\"Y先生教育在线课程视频,为您提供java,python,HTML5,UI,PHP,大数据等学科经典视频教程在线浏览学习,精细化知识点解析,深入浅出,想学不会都难,Y先生教育,学习成就梦想！\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/css.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"favicon.png\" type=\"image/png\" />\r\n");
      out.write("    <title>在线公开课-Y先生教育|java|大数据|HTML5|python|UI|PHP视频教程</title>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/gVerify.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("       $(function(){\r\n");
      out.write("          \r\n");
      out.write("          //div 两个哪个显示呢？\r\n");
      out.write("          if(null!=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userAccount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" && \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userAccount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" !=\"\"){\r\n");
      out.write("               $(\"#regBlock\").css(\"display\",\"none\");\r\n");
      out.write("\t           $(\"#userBlock\").css(\"display\",\"block\");\r\n");
      out.write("          }else{\r\n");
      out.write("               $(\"#regBlock\").css(\"display\",\"block\");\r\n");
      out.write("\t           $(\"#userBlock\").css(\"display\",\"none\");\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("       });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"w100\">\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <span>欢迎来到Y先生教育！</span>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\t            <div id=\"regBlock\" style=\"display:none;float:right\">\r\n");
      out.write("\t               <a href=\"javascript:;\" id=\"reg_open\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/we.png\">注册</a>\r\n");
      out.write("\t               <a href=\"javascript:;\" id=\"login_open\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/we.png\">登录</a>\r\n");
      out.write("\t            </div>\r\n");
      out.write("            \r\n");
      out.write("\t            <div id=\"userBlock\" style=\"display:none;float:right\">\r\n");
      out.write("\t               \r\n");
      out.write("\t               <a href=\"javascript:;\" id=\"loginout\">退出</a>\r\n");
      out.write("\t               <a href=\"user/showMyProfile\" id=\"account\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userAccount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("\t            </div>\r\n");
      out.write("           \r\n");
      out.write("            <a onclick=\"JavaScript:addFavorite2()\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/sc.png\" draggable=\"false\">加入收藏</a>\r\n");
      out.write("            <a onclick=\"pyRegisterCvt()\" target=\"_blank\" href=\"http://wpa.qq.com/msgrd?v=3&uin=2580094677&site=qq&menu=yes\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/we.png\" draggable=\"false\">联系我们</a>\r\n");
      out.write("            <a class=\"color_e4\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/phone.png\" draggable=\"false\"> 0375-208-9092&#x3000;&#x3000;0375-208-9051</a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <nav class=\"w100\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.png\" alt=\"Y先生教育的logo\" onclick=\"location.href='index.html'\" draggable=\"false\">\r\n");
      out.write("            <ul class=\"text_13 f_right\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\" target=\"_blank\">首页</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav_down\">\r\n");
      out.write("                    高端课程<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/nav_down.png\" alt=\"\" draggable=\"false\">\r\n");
      out.write("                    <ul id=\"nav_down\" class=\"t_center\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">Java国际</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">VR</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">HTML5</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">大数据</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">信息安全</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">APP UI</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">PHP</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">Python</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!--<li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">Android</a>\r\n");
      out.write("                        </li>-->\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">iOS</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!--<li>\r\n");
      out.write("                            <a target=\"_blank\" href=\"#\">网络运营</a>\r\n");
      out.write("                        </li>-->\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li id=\"gkk\" class=\"nav_choose\">\r\n");
      out.write("                    <a href=\"#\">在线公开课</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">专家师资</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                <li><a href=\"#\" >Y先生新闻</a></li>\r\n");
      out.write("                <li class=\"nav_last\">\r\n");
      out.write("                    <a href=\"#\" >关于Y先生</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!--banner图-->\r\n");
      out.write("    <div class=\"banner index-banner\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!--模块化课程-->\r\n");
      out.write("    <div class=\"course\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p class=\"title\">模块化课程，从入门到精通，大神并不遥远</p>\r\n");
      out.write("            <div class=\"course-info\">\r\n");
      out.write("                <table cellspacing=\"10\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"2\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/course.action?subject_id=1\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/html5.jpg\" alt=\"\" class=\"image scale\" draggable=\"false\">\r\n");
      out.write("                                <div class=\"headline\">\r\n");
      out.write("                                    <span>Web前端教程</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/arrow.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <!--上线时修改id-->\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/course.action?subject_id=6\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/ui.jpg\" alt=\"\" class=\"image scale\" draggable=\"false\">\r\n");
      out.write("                                <div class=\"headline\">\r\n");
      out.write("                                    <span>UI设计教程</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/arrow.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td rowspan=\"2\" class=\"one_three\">\r\n");
      out.write("                            <a href=\"#\" class=\"opacity5\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/java.jpg\" alt=\"\" class=\"image\" draggable=\"false\">\r\n");
      out.write("                                <div class=\"headline\">\r\n");
      out.write("                                    <span>Java教程</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/arrow.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <a href=\"#\" class=\"opacity5\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/bigdata.jpg\" alt=\"\" class=\"image\" draggable=\"false\">\r\n");
      out.write("                                <div class=\"headline\">\r\n");
      out.write("                                    <span>大数据教程</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/arrow.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td colspan=\"2\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/course.action?subject_id=10\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/python.jpg\" alt=\"\" class=\"image scale\" draggable=\"false\">\r\n");
      out.write("                                <div class=\"headline\">\r\n");
      out.write("                                    <span>Python教程</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/arrow.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"2\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/course.action?subject_id=11\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/php.jpg\" alt=\"\" class=\"image scale\" draggable=\"false\">\r\n");
      out.write("                                <div class=\"headline\">\r\n");
      out.write("                                    <span>PHP教程</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/arrow.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td colspan=\"2\" class=\"three_two\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/qidai.jpg\" alt=\"\" class=\"image\" draggable=\"false\">\r\n");
      out.write("                            <div class=\"headline\">\r\n");
      out.write("                                更多课程，敬请期待...\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <!--马上试听-->\r\n");
      out.write("                <a onclick=\"pyRegisterCvt()\" target=\"_blank\" href=\"http://wpa.qq.com/msgrd?v=3&uin=2580094677&site=qq&menu=yes\">\r\n");
      out.write("                    <div class=\"audition\">高级课程</div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--报名表单-->\r\n");
      out.write("    <div class=\"form_area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p class=\"title\"><b>这个世界上可以选择的很多，可以改变命运的选择很少<br />你现在准备好向梦想出发了吗？</b></p>\r\n");
      out.write("            <form id=\"iform\" action=\"#\" method=\"post\">\r\n");
      out.write("                <div class=\"form_line1\"></div>\r\n");
      out.write("                <div class=\"form_line2\"></div>\r\n");
      out.write("                <div class=\"wrap\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"post\" />\r\n");
      out.write("                    <input type=\"hidden\" name=\"diyid\" value=\"3\" />\r\n");
      out.write("                    <input type=\"hidden\" name=\"do\" value=\"2\" />\r\n");
      out.write("                    <input type=\"hidden\" name=\"ip\" value=\"\" />\r\n");
      out.write("                    <input type=\"hidden\" name=\"time\" value=\"\" />\r\n");
      out.write("                    <div><label for=\"name\">姓名：</label><input name=\"name\" id=\"name\" type=\"text\" class=\"form-control\" /></div>\r\n");
      out.write("                    <div><label for=\"tel\">手机号：</label><input name=\"tel\" id=\"tel\" type=\"text\" class=\"form-control\" /></div>\r\n");
      out.write("                    <div><label for=\"qq\">QQ：</label><input name=\"qq\" id=\"qq\" type=\"text\" class=\"form-control\" /></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <input class=\"button\" type=\"submit\" value=\"立即报名\" />\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--页脚-->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/footer_logo.png\" alt=\"\" draggable=\"false\">\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"mt25\">\r\n");
      out.write("                <h3>校区地址</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>地址<br>河南省平顶山市龙翔大道河南Y先生学院</li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"mt25\">\r\n");
      out.write("                <h3>联系我们</h3>\r\n");
      out.write("                <ul id=\"foo_icon\">\r\n");
      out.write("                    <li>河南省平顶山市龙翔大道河南Y先生学院</li>\r\n");
      out.write("                    <li>e-mail:zy@chengjian100.com</li>\r\n");
      out.write("                    <li>电话:0395-208-9051 0375-208-9092</li>\r\n");
      out.write("                    <li class=\"erwei\">\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <img class=\"weixin\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/微信公众号.png\" alt=\"\" draggable=\"false\">\r\n");
      out.write("                            <img class=\"weibo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/微博公众号.png\" alt=\"\" draggable=\"false\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"record\">Y先生教育 &copy; 豫ICP备13013243号;河南Y先生学院</div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <!--登录注册弹出框-->\r\n");
      out.write("    <div class=\"mask hidden\" id=\"login\">\r\n");
      out.write("        <div class=\"mask_content\">\r\n");
      out.write("            <div class=\"mask_content_header\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.png\" alt=\"\" class=\"ma\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mask_content_body\">\r\n");
      out.write("                <form id=\"loginForm\" action=\"#\">\r\n");
      out.write("                    <h3>快速登录</h3>\r\n");
      out.write("                    <input type=\"email\" id=\"loginEmail\" placeholder=\"请输入邮箱\" name=\"email\">\r\n");
      out.write("                    <input type=\"password\" id=\"loginPassword\" placeholder=\"请输入密码\" name=\"password\">\r\n");
      out.write("                    <div id=\"forget\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/forgetPassword.action\">忘记密码？</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"submit\" onclick=\"return commitLogin()\" value=\"登&#x3000;录\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mask_content_footer\">\r\n");
      out.write("                <span id=\"login_close\">关&#x3000;闭</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"mask hidden\" id=\"reg\">\r\n");
      out.write("        <div class=\"mask_content\">\r\n");
      out.write("            <div class=\"mask_content_header\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.png\" alt=\"\" class=\"ma\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mask_content_body\">\r\n");
      out.write("                <form id=\"regForm\" action=\"user/insertUser.action\">\r\n");
      out.write("                    <h3>新用户注册</h3>\r\n");
      out.write("                    <input type=\"email\" id=\"regEmail\" placeholder=\"请输入邮箱\" name=\"email\"><span id=\"emailMsg\"></span>\r\n");
      out.write("                    <input type=\"password\" id=\"regPsw\" placeholder=\"请输入密码\" name=\"password\">\r\n");
      out.write("                    <input type=\"password\" id=\"regPswAgain\" placeholder=\"请再次输入密码\" name=\"psw_again\"><span id=\"passMsg\"></span>\r\n");
      out.write("                    <div id=\"yzm\" class=\"form-inline\">\r\n");
      out.write("                        <input type=\"text\" name=\"yzm\" style=\"width: 45%; display: inline-block;\">\r\n");
      out.write("                        <div id=\"v_container\" style=\"width: 45%;height: 40px;float:right;\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"submit\" onclick=\"return commitRegForm();\" value=\"注&#x3000;册\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mask_content_footer\">\r\n");
      out.write("                <span id=\"reg_close\">关&#x3000;闭</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/index.js\"></script>\r\n");
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
}
