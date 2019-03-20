<%-- 
    Document   : venueweb
    Created on : Mar 15, 2019, 12:16:12 PM
    Author     : admin
--%>
<%@page import="javax.mail.MessagingException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"                                                                        
    pageEncoding="ISO-8859-1"%>                                                                                                             
<!DOCTYPE html>                                    
<%@page import="java.util.Properties"%>                                                                                                     
<%@page import="javax.mail.*"%>                                                                                                       
<%@page import="javax.mail.Authenticator"%>                                                                                                 
<%@page import="javax.mail.PasswordAuthentication"%>                                                                                        
<%@page import="javax.mail.Message"%>                                                                                                       
<%@page import="javax.mail.internet.MimeMessage"%>                                                                                          
<%@page import="javax.mail.internet.InternetAddress"%>                                                                                      
<%@page import="javax.mail.Transport"%> 
<%@page import="javax.mail.*" %>
<%@page import=" java.util.*" %>
<%@page import=" javax.mail.internet.*" %>
<html>                                                                                                                                      
<head>                                                                                                                                      
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">                                                                    
<title> Mail Sending </title>
<body>

<% 
if(request.getParameter("action")!= null)
{
//Creating a result for getting status that messsage is delivered or not!
String result;
// Get recipient's email-ID, message & subject-line from mail.html page
String subject = "NEW USER REGISTRATION";                                                                                                                       
String mssg = null;
final String mail = request.getParameter("v_email");
final String fname = request.getParameter("v_fname");
final String lname = request.getParameter("v_lname");
final String phn = request.getParameter("v_phn");
final String biography = request.getParameter("v_biography");


mssg ="\n FIRST NAME: \t"+fname +"\n LAST NAME : \t"+lname+"\n CONTACT     : \t"+phn+"\n EMAIL ID       :\t"+mail+"\n BIOGRAPHY : \t"+biography; 

// Sender's email ID and password needs to be mentioned
final String from = "rp4722708@gmail.com";
final String pass = "@rashmi22";
// Receiver's or Admin's email ID needs to be mentioned
final String to = "rashmipal2202@gmail.com";
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
props.put("mail.port", "587"); // there are some other ports also available
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

// Sest To: header field of the header.
message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

// Set Subject: header field
message.setSubject(subject);

// Now set the actual message
message.setText(mssg);

// Send message
Transport.send(message);
result = "Your mail sent successfully....";
response.sendRedirect("thankyou.jsp");
//out.println(result);
} catch (Exception mex) {
    out.println(mex);
mex.printStackTrace();
result = "Error: unable to send mail....";
out.println(mex);
out.println(result);}
}  
%> 
</body>
</html>       