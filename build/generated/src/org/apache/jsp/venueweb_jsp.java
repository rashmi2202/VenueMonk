package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.mail.MessagingException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Transport;
import javax.mail.*;
import java.util.*;
import javax.mail.internet.*;

public final class venueweb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("                                                                                                             \n");
      out.write("<!DOCTYPE html>                                    \n");
      out.write("                                                                                                     \n");
      out.write("                                                                                                       \n");
      out.write("                                                                                                 \n");
      out.write("                                                                                        \n");
      out.write("                                                                                                       \n");
      out.write("                                                                                          \n");
      out.write("                                                                                      \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>                                                                                                                                      \n");
      out.write("<head>                                                                                                                                      \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">                                                                    \n");
      out.write("<title>User Registration</title>\n");
      out.write("<meta content='text/html; charset=UTF-8' http-equiv='Content-Type'/>\n");
      out.write("<meta content='all-language' http-equiv='Content-Language'/>\n");
      out.write("<meta content='Global' name='Distribution'/>\n");
      out.write("<meta content='India' name='geo.country'/>\n");
      out.write("<meta content='Solapur' name='geo.placename'/>\n");
      out.write("<meta content='Shubham Shah' name='author'/>\n");
      out.write("<meta content='document' name='resource-type'/>\n");
      out.write("<meta content='en' name='language'/>\n");
      out.write("<meta content='IN' name='country'/>\n");
      out.write("<meta content='all' name='audience'/>\n");
      out.write("<meta content='index,follow,snipet' name='googlebot'/>\n");
      out.write("<!--\n");
      out.write("<style>\n");
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
      out.write("} \n");
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
      out.write("  height: 80% !important;\n");
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
      out.write("</style>   \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function validate()\n");
      out.write("{\n");
      out.write("     var x = document.forms[\"emailForm\"][\"v_fname\"].value;\n");
      out.write("     var y = document.forms[\"emailForm\"][\"v_lname\"].value;\n");
      out.write("     var z = document.forms[\"emailForm\"][\"v_email\"].value;\n");
      out.write("     var a = document.forms[\"emailForm\"][\"v_phn\"].value;\n");
      out.write("     var b = document.forms[\"emailForm\"][\"v_biography\"].value;\n");
      out.write("        \n");
      out.write("        if(z === \" \" || b === \" \"|| a === \" \"|| x === \" \"|| y === \" \"){\n");
      out.write("        alert(\"Fill all fields\");\n");
      out.write("      }\n");
      out.write("       if(z.classList.contains('invalid')){\n");
      out.write("        alert(\"Enter valid email\");\n");
      out.write("        z.focus();\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("          if(a.length !== 10 ){\n");
      out.write("                alert(\"Enter 10 digit phone no.\");\n");
      out.write("                a.focus();\n");
      out.write("      }\n");
      out.write("       \n");
      out.write("          if((b.length)> 150){\n");
      out.write("             alert(\"Biography should be less than 150 character\");\n");
      out.write("             b.focus();\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      else {\n");
      out.write("        alert(\"Thank You! Check Your Mail\"); }\n");
      out.write("      \n");
      out.write("      }\n");
      out.write("</script>                                                                                                               \n");
      out.write("</head>  -->                                                                                                                                     \n");
      out.write("<body>\n");
      out.write("\n");
 
if (request.getParameter("action")!= null)
{
    response.sendRedirect("thankyou.jsp");
//Creating a result for getting status that messsage is delivered or not!
String result;

// Get recipient's email-ID, message & subject-line from mail.html page
String subject = "THANK YOU For Registration";                                                                                                                       
String mssg = null;
final String to = request.getParameter("v_mail");
final String fname = request.getParameter("v_fname");
final String lname = request.getParameter("v_lname");
final String phn = request.getParameter("v_phn");
final String biography = request.getParameter("v_biography");

 mssg = "\n First Name      :"+fname +"\n Last Name    :"+lname+"\n Phone Number   : "+phn+"\n Biography      :"+biography ; 

// Sender's email ID and password needs to be mentioned
final String from = "rashmirocks2297@gmail.com";
final String pass = "8052589565";
// Defining the gmail host
String host = "smtp.gmail.com";
// Creating Properties object
Properties props = new Properties();
// Defining properties
props.put("mail.smtp.ssl.enable","true");
props.put("mail.smtp.host", host);
props.put("mail.transport.protocol", "smtp");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.user", from);
props.put("mail.password", pass);
props.put("mail.port", "85"); // there are some other ports also available
// Authorized the Session object.
Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
@Override
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(from, pass);
}
});
try {
// Create a default MimeMessage object.
MimeMessage message = new MimeMessage(mailSession);

// Set From: header field of the header.
message.setFrom(new InternetAddress(from));

// Set To: header field of the header.
message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

// Set Subject: header field
message.setSubject(subject);

// Now set the actual message
message.setText(mssg);

// Send message
Transport.send(message);
result = "Your mail sent successfully....";
out.println(result);
} catch (MessagingException mex) {
mex.printStackTrace();
result = "Error: unable to send mail....";
out.println(mex);
out.println(result);}
}


      out.write("\n");
      out.write("</body>\n");
      out.write("<!--\n");
      out.write("<form name=\"emailForm\" action=\"sendEmails.jsp\" method=\"post\" >\n");
      out.write("       \n");
      out.write("                \n");
      out.write("        \n");
      out.write("            <div class =\"header\"  style=\"color:royalblue; font-size: 50px; margin-left:530px; margin-top: 20px;  font-style: normal; \">\n");
      out.write("            \n");
      out.write("                VenueForm\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        <div class=\"loginBox\">\n");
      out.write("                \n");
      out.write("    <div class=\"row\">\n");
      out.write("           <div class=\"input-field col s6\" >\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("        <td>First Name <font color=\"red\">*</font><br></td>\n");
      out.write("        <td><input type=\"text\" id=\"v_fname\" name=\"v_fname\"  class=\"validate\"  aria-required=\"true\" required=\"\" /> \n");
      out.write("             <span class=\"helper-text\" data-error=\"enter first name\" data-success=\"right\"> </span>\n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("           </div> </div>\n");
      out.write("            \n");
      out.write("                <div class=\"row\">\n");
      out.write("           <div class=\"input-field col s6\" >\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("        <td>Last Name <font color=\"red\">*</font><br></td>\n");
      out.write("        <td><input type=\"text\" id=\"v_lname\" name=\"v_lname\" class=\"validate\"  aria-required=\"true\" required=\"\"/></td>\n");
      out.write("        \n");
      out.write("        </tr>\n");
      out.write("           </div> </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("             <div class=\"row\">\n");
      out.write("           <div class=\"input-field col s6\" >\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>Email Id <font color=\"red\">*</font><br></td>\n");
      out.write("        <td> <input required=\"\" name=\"v_email\" aria-required=\"true\" id=\"v_email\" type=\"email\" class=\"validate\">\n");
      out.write("             <span class=\"helper-text\" data-error=\"enter valid email\" data-success=\"right\"></span>\n");
      out.write("        </td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </tr>   \n");
      out.write("           </div> </div> \n");
      out.write("            \n");
      out.write("                <div class=\"row\">\n");
      out.write("           <div class=\"input-field col s6\" >\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td>Phone No.<font color=\"red\">*</font><br></td>\n");
      out.write("        <td><input required=\"\" name=\"v_phn\" aria-required=\"true\" id=\"v_phn\" type=\"number\" class=\"validate\">\n");
      out.write("             <span class=\"helper-text\" data-error=\"enter phone no.\" data-success=\"right\"></span>\n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("           </div> </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("                <div class=\"row\">\n");
      out.write("           <div class=\"input-field col s6\" >\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>Biography <font color=\"red\">*<font color=\"black\"> (max 150 characters)</font><br></td>\n");
      out.write("        <td>\n");
      out.write("                   <textarea name=\"v_biography\" rows=\"4\" cols=\"20\" id=\"v_biography\" class=\"validate\" required=\"\">\n");
      out.write("            </textarea>\n");
      out.write("             <span class=\"helper-text\" data-error=\"enter biography\" data-success=\"right\"></span>\n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("           </div> </div>\n");
      out.write("       \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"input-field col s6\" > <br> \n");
      out.write("\n");
      out.write("        <button class=\"buttonStyle\" onClick=\"javascript:validate();\" type=\"submit\" name=\"action\" >Submit</button>\n");
      out.write("           </div> </div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>       -->");
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
