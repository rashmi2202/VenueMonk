package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    <head> \n");
      out.write("        <style>\n");
      out.write(".header\n");
      out.write("{\n");
      out.write("margin-top:100px;\n");
      out.write("margin-left: 40%;\n");
      out.write("/*margin-right: 55%;*/\n");
      out.write("color : #DF0101;\n");
      out.write("font-weight:bold;\n");
      out.write("font-family: 'PT Sans', sans-serif;\n");
      out.write("font-size: 35px;\n");
      out.write("}\n");
      out.write("#header {\n");
      out.write("height: 16%;\n");
      out.write("display: block;\n");
      out.write("width: 100%;\n");
      out.write("box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.49);\n");
      out.write("background: #E6E6E6;\n");
      out.write("}\n");
      out.write(".img_head\n");
      out.write("{\n");
      out.write("margin-top:-50px;\n");
      out.write("margin-right: 95%\n");
      out.write("}\n");
      out.write(".buttonStyle\n");
      out.write("{\n");
      out.write("width: 70px;\n");
      out.write("font-size:12px;\n");
      out.write("font-family:Verdana;\n");
      out.write("font-weight:bold;\n");
      out.write("color:white;/*#44A4D3;*/\n");
      out.write("height:26px;\n");
      out.write("background-color:#808080;\n");
      out.write("background-repeat:repeat-x;\n");
      out.write("border:none;\n");
      out.write("text-transform:capitilize;\n");
      out.write("}\n");
      out.write(".buttonStyle:hover\n");
      out.write("{\n");
      out.write("width: 70px;\n");
      out.write("font-size:12px;\n");
      out.write("font-family:Verdana;\n");
      out.write("font-weight:bold;\n");
      out.write("color:Black;\n");
      out.write("height:26px;\n");
      out.write("background-color:#cccccc;\n");
      out.write("background-image:none;\n");
      out.write("border:none;\n");
      out.write("text-transform: capitilize;\n");
      out.write("}\n");
      out.write(".buttonStyle:active\n");
      out.write("{\n");
      out.write("width: 70px;\n");
      out.write("font-size:12px;\n");
      out.write("font-family:Verdana;\n");
      out.write("font-weight:bold;\n");
      out.write("color:Black;\n");
      out.write("height:26px;\n");
      out.write("background-color:#f2f2f2;\n");
      out.write("background-image:none;\n");
      out.write("border:none;\n");
      out.write("text-transform: capitilize;\n");
      out.write("}  \n");
      out.write("body{\n");
      out.write("  margin: 0px;\n");
      out.write("  height: 100%;\n");
      out.write("  padding: 0px;\n");
      out.write("  background: url(\"background.jpg\");\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("  font-family: snas-serif;\n");
      out.write("  display: flex;    \n");
      out.write("  color:white;\n");
      out.write("}\n");
      out.write("input{\n");
      out.write("  color: black;\n");
      out.write("  margin: 0px;\n");
      out.write("}\n");
      out.write(".loginBox{\n");
      out.write("  color: whitesmoke;\n");
      out.write("  display: block;\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  position: absolute !important;\n");
      out.write("  top: 55% !important;\n");
      out.write("  left: 50% !important;\n");
      out.write("  transform: translate(-50%,-50%) !important;\n");
      out.write("  width: 300px !important;\n");
      out.write("  height: 85% !important;\n");
      out.write("  padding: 80px 40px !important;\n");
      out.write("  box-sizing: border-box !important;\n");
      out.write("  background: rgba(0, 0, 0, 0.5) !important;\n");
      out.write("}\n");
      out.write(".row{\n");
      out.write("  margin: 0px !important;\n");
      out.write("  padding: 0px !important;\n");
      out.write("  height: 80px !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>   \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function validate()\n");
      out.write("{\n");
      out.write("    function charcounts(startfrom, charend){\n");
      out.write("        var b = document.getElementById(startfrom).value.length;\n");
      out.write("        alert(\"Exceeding 150 characters\");\n");
      out.write("        emailForm.v_biography.focus();\n");
      out.write("        document.getElementById(charend).innerHTML=b;\n");
      out.write("        response.sendRedirect(\"venueweb.jsp\");\n");
      out.write("    }\n");
      out.write("    if((emailForm.v_phn.value).length != 10){\n");
      out.write("        alert(\"phone number must be 10 digits\");\n");
      out.write("        emailForm.v_phn.focus();\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("    else{\n");
      out.write("        response.sendRedirect(\"venueweb.jsp\");\n");
      out.write("    } \n");
      out.write("}\n");
      out.write("</script>                                                                                                               \n");
      out.write("</head>\n");
      out.write("<!-- VenueForm -->        \n");
      out.write("<form name=\"emailForm\" action=\"venueweb.jsp\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("    <div class =\"header\"  style=\"color:royalblue; font-size: 50px; margin-left:530px; margin-top: 20px;  font-style: normal; \">\n");
      out.write("            \n");
      out.write("                VenueForm\n");
      out.write("    </div> \n");
      out.write("    <div class=\"loginBox\">            \n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"input-field col s6\" >\n");
      out.write("        <tr>\n");
      out.write("        <td>First Name <font color=\"red\">*</font><br></td>\n");
      out.write("        <td><input type=\"text\" id=\"v_fname\" name=\"v_fname\"  class=\"validate\"  aria-required=\"true\" required=\"\"  /> \n");
      out.write("             <span  data-error=\"enter first name\" data-success=\"right\"> </span>\n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("    </div> \n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"input-field col s6\" >\n");
      out.write("        <tr>\n");
      out.write("        <td>Last Name <font color=\"red\">*</font><br></td>\n");
      out.write("        <td><input type=\"text\" id=\"v_lname\" name=\"v_lname\" class=\"validate\"  aria-required=\"true\" required=\"\" /></td>\n");
      out.write("            <span  data-error=\"enter first name\" data-success=\"right\"> </span>\n");
      out.write("        </tr>\n");
      out.write("    </div> </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"input-field col s6\" >\n");
      out.write("        <tr>\n");
      out.write("        <td>Email Id <font color=\"red\">*</font><br></td>\n");
      out.write("        <td> <input  name=\"v_email\"  id=\"v_email\" type=\"email\" class=\"validate\" required=\"\">\n");
      out.write("             <span data-error=\"enter valid email\" data-success=\"right\" id=\"invalid\"></span>\n");
      out.write("        </td>\n");
      out.write("        </tr>   \n");
      out.write("    </div> </div>          \n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"input-field col s6\" >\n");
      out.write("        <tr>\n");
      out.write("        <td>Phone No.<font color=\"red\">*</font><br></td>\n");
      out.write("        <td><input  name=\"v_phn\" aria-required=\"true\"  id=\"v_phn\" type=\"number\"  size=\"20\" pattern=\"[0-9]{10}\" class=\"validate\" required=\"\">\n");
      out.write("             <span  data-error=\"enter phone no.\" data-success=\"right\" ></span>\n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("    </div> </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"input-field col s6\" >\n");
      out.write("        <tr>\n");
      out.write("        <td>Biography <font color=\"red\">*<font color=\"black\"> (max 150 characters)</font><br></td>\n");
      out.write("        <td> <input name=\"v_biography\"   id=\"v_biography\" maxLength=\"150\" style=\"font-size:18px\" style=\"height:15px\"  class=\"validate\" required=\"\" \n");
      out.write("                    onkeydown=\"charcounts('value','countchar');\" >\n");
      out.write("            <span data-error=\"enter biography\" data-success=\"right\" id=\"countchar\" style=\"color:red\"></span>\n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("    </div> </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"input-field col s6\" > <br> \n");
      out.write("         <button class=\"buttonStyle\" onClick=\"javascript:validate;\" type=\"submit\" name=\"action\" >Submit</button>\n");
      out.write("    </div> </div>\n");
      out.write("    </div></div>\n");
      out.write("</form>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
