/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-08 12:22:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webpage.weixin.idea.huodong.ggl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ggl_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>刮刮乐</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,user-scalable=no,initial-scale=1, maximum-scale=1\">\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("<link href=\"plug-in/weixin/ggl/ggl.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"plug-in/weixin/zp/activity-style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<script src=\"plug-in/weixin/ggl/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/weixin/ggl/wScratchPad.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\n");
      out.write("\t    var picPath = \"plug-in/weixin/images/ggl/nothing.png\";\n");
      out.write("\t    var prize = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\n");
      out.write("\t    if(prize=='1'){\n");
      out.write("\t    \t picPath = \"plug-in/weixin/images/ggl/one.png\";\n");
      out.write("\t    }else if(prize=='2'){\n");
      out.write("\t    \t picPath = \"plug-in/weixin/images/ggl/two.png\";\n");
      out.write("\t    }else if(prize=='3'){\n");
      out.write("\t    \t picPath = \"plug-in/weixin/images/ggl/three.png\";\n");
      out.write("\t    }else{\n");
      out.write("\t    \tpicPath = \"plug-in/weixin/images/ggl/nothing.png\";\n");
      out.write("\t    }\n");
      out.write("\t    var isfirst = 0;\n");
      out.write("\t    var iscontinue = 0 ;\n");
      out.write("\n");
      out.write("\t\t$(\"#wScratchPad2\").wScratchPad({\n");
      out.write("             color: 'grey',//覆盖的刮刮层的颜色\n");
      out.write("             image: picPath, //刮奖结果图片\n");
      out.write("             cursor: 'plug-in/weixin/images/coin.gif',  //刮的笔刷图片\n");
      out.write("             scratchMove: function(e, percent){\n");
      out.write("            \t var accountid=$(\"#accountid\").val();\n");
      out.write("                if(iscontinue==0){\n");
      out.write("                \t$.ajax({\n");
      out.write("\t\t           \t\turl:\"zpController.do?doGgl\",\n");
      out.write("\t\t           \t\tdata:{accountid:accountid},\n");
      out.write("\t\t           \t\tmethod:\"POST\",\n");
      out.write("\t\t           \t\tdataType:\"JSON\",\n");
      out.write("\t\t           \t\tasync:false,\n");
      out.write("\t\t           \t\tsuccess:function(data){\n");
      out.write("\t\t           \t\t   if(!data.success){\n");
      out.write("\t\t           \t\t   \t\talert(data.msg);\n");
      out.write("\t\t           \t\t   }else{\n");
      out.write("\t\t           \t\t   \t\tiscontinue =1;\n");
      out.write("\t\t           \t\t   }\n");
      out.write("\t\t           \t\t},\n");
      out.write("\t\t           \t\terror:function(){\n");
      out.write("\t\t           \t\t\treturn;\n");
      out.write("\t\t           \t\t}\n");
      out.write("\t\t           });\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("                if(percent > 60){\n");
      out.write("                \tthis.clear();\n");
      out.write("                \tif(isfirst==0){\n");
      out.write("                \t  if(prize=='1'){\n");
      out.write("\t\t            \tmessage = \"恭喜你获得一等奖！\";\n");
      out.write("\t\t            \t$(\"#result\").slideToggle(500);\n");
      out.write("\t                    $(\"#card\").slideUp(500);\n");
      out.write("\t\t              }else if(prize=='2'){\n");
      out.write("\t\t            \tmessage = \"恭喜你获得二等奖！\";\n");
      out.write("\t\t            \t$(\"#result\").slideToggle(500);\n");
      out.write("\t                    $(\"#card\").slideUp(500);\n");
      out.write("\t                  }else if(prize=='3'){\n");
      out.write("\t\t            \tmessage = \"恭喜你获得三等奖！\";\n");
      out.write("\t\t            \t$(\"#result\").slideToggle(500);\n");
      out.write("\t                    $(\"#card\").slideUp(500);\n");
      out.write("\t\t              }else{\n");
      out.write("\t\t            \tmessage = \"再接再厉！\";\n");
      out.write("\t\t            \talert(message);\n");
      out.write("\t\t              }\n");
      out.write("                \t  \n");
      out.write("                \t}\n");
      out.write("                \t\n");
      out.write("                \tisfirst=1;\n");
      out.write("                \t\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         $(\"#save-btn\").bind(\"click\",function(){\n");
      out.write("\t\t\tvar btn=$(this);\n");
      out.write("\t\t\tvar tel=$(\"#tel\").val();\n");
      out.write("\t\t\tvar accountid=$(\"#accountid\").val();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(tel==''){\n");
      out.write("\t\t\t\talert(\"请输入手机号码\");\n");
      out.write("\t\t\t\treturn\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tvar regu=/^[1][0-9]{10}$/;\n");
      out.write("\t\t\tvar re=new RegExp(regu);\n");
      out.write("\t\t\tif(!re.test(tel)){\n");
      out.write("\t\t\t\talert(\"请输入正确手机号码\");\n");
      out.write("\t\t\t\treturn\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("           \t\turl:\"zpController.do?saveRecord\",\n");
      out.write("           \t\tmethod:\"POST\",\n");
      out.write("           \t\tdataType:\"JSON\",\n");
      out.write("           \t\tdata:{mobile:tel,accountid:accountid},\n");
      out.write("           \t\tsuccess:function(data){\n");
      out.write("           \t\t   if(data.success){\n");
      out.write("           \t\t   \t\talert(\"提交成功，谢谢参与！\");\n");
      out.write("           \t\t \t\t$(\"#tel\").attr({\"disabled\":\"disabled\"});\n");
      out.write("           \t\t   \t\t$(\"#save-btn\").hide();\n");
      out.write("           \t\t   }else{\n");
      out.write("           \t\t   \t\talert(data.msg);\n");
      out.write("           \t\t   }\n");
      out.write("           \t\t}\n");
      out.write("           });\n");
      out.write("           \n");
      out.write("           });\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"c_main\">\n");
      out.write("\t<div id=\"card\" class=\"c100\">\n");
      out.write("\t\t<img src=\"plug-in/weixin/images/ggl/card.png\" width=\"100%\" height=\"100%\"/>\n");
      out.write("\t\t<div id=\"gj\">\n");
      out.write("\t\t\t<div id=\"wScratchPad2\" style=\"display:inline-block;\">\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--  \t<div id=\"wScratchPad2\" style=\"display:inline-block; position:relative; border:solid black 1px;\"></div> -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"content\">\n");
      out.write("<div class=\"boxcontent boxyellow\" id=\"result\" style=\"display:none\">\n");
      out.write("<div class=\"box\">\n");
      out.write("<div class=\"title-orange\"><span>恭喜你中奖了</span></div>\n");
      out.write("<div class=\"Detail\">\n");
      out.write("            <a class=\"ui-link\" href=\"#\" id=\"opendialog\" style=\"display: none;\" data-rel=\"dialog\"></a>\n");
      out.write("<p>你中了：<span class=\"red\" id=\"prizetype\">一等奖</span></p>\n");
      out.write("<p>凭借你登记的手机号即可兑奖！</span></p>\n");
      out.write("<p class=\"red\">本次兑奖码已经关联你的微信号，你可向公众号发送 兑奖 进行查询!</p>\n");
      out.write("               \n");
      out.write("<p>\n");
      out.write("<input name=\"\" class=\"px\" id=\"tel\" type=\"text\" placeholder=\"输入您的手机号码\">\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("<input class=\"pxbtn\" id=\"save-btn\" name=\"提 交\" type=\"button\" value=\"提 交\">\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"int\">\n");
      out.write("\t<div class=\"tit\"><img src=\"plug-in/weixin/images/ggl/1.png\" width=\"100%\"/></div>\n");
      out.write("\t<ul> \n");
      out.write("\t\t<li>一等奖：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${huodongEntity.priceone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("，数量：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${huodongEntity.onetotal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\n");
      out.write("\t\t<li>二等奖：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${huodongEntity.pricetwo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("，数量：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${huodongEntity.twototal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\n");
      out.write("\t\t<li>三等奖：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${huodongEntity.pricethree}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("，数量：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${huodongEntity.threetotal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\n");
      out.write("\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"int\">\n");
      out.write("\t<div class=\"tit\"><img src=\"plug-in/weixin/images/ggl/2.png\" width=\"100%\"/></div>\n");
      out.write("\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${huodongEntity.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<input type=\"hidden\" id=\"accountid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accountid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("</body>\n");
      out.write("</html>");
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