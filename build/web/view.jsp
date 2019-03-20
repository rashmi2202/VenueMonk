<%-- 
    Document   : view
    Created on : Mar 17, 2019, 1:12:35 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    <head> 
        <style>
.header
{
margin-top:100px;
margin-left: 40%;
/*margin-right: 55%;*/
color : #DF0101;
font-weight:bold;
font-family: 'PT Sans', sans-serif;
font-size: 35px;
}
#header {
height: 16%;
display: block;
width: 100%;
box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.49);
background: #E6E6E6;
}
.img_head
{
margin-top:-50px;
margin-right: 95%
}
.buttonStyle
{
width: 70px;
font-size:12px;
font-family:Verdana;
font-weight:bold;
color:white;/*#44A4D3;*/
height:26px;
background-color:#808080;
background-repeat:repeat-x;
border:none;
text-transform:capitilize;
}
.buttonStyle:hover
{
width: 70px;
font-size:12px;
font-family:Verdana;
font-weight:bold;
color:Black;
height:26px;
background-color:#cccccc;
background-image:none;
border:none;
text-transform: capitilize;
}
.buttonStyle:active
{
width: 70px;
font-size:12px;
font-family:Verdana;
font-weight:bold;
color:Black;
height:26px;
background-color:#f2f2f2;
background-image:none;
border:none;
text-transform: capitilize;
}  
body{
  margin: 0px;
  height: 100%;
  padding: 0px;
  background: url("background.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  font-family: snas-serif;
  display: flex;    
  color:white;
}
input{
  color: black;
  margin: 0px;
}
.loginBox{
  color: whitesmoke;
  display: block;
  flex-wrap: wrap;
  position: absolute !important;
  top: 55% !important;
  left: 50% !important;
  transform: translate(-50%,-50%) !important;
  width: 300px !important;
  height: 85% !important;
  padding: 80px 40px !important;
  box-sizing: border-box !important;
  background: rgba(0, 0, 0, 0.5) !important;
}
.row{
  margin: 0px !important;
  padding: 0px !important;
  height: 80px !important;
}


</style>   
<script type="text/javascript">
function validate()
{
    function charcounts(startfrom, charend){
        var b = document.getElementById(startfrom).value.length;
        alert("Exceeding 150 characters");
        emailForm.v_biography.focus();
        document.getElementById(charend).innerHTML=b;
        response.sendRedirect("venueweb.jsp");
    }
    if((emailForm.v_phn.value).length != 10){
        alert("phone number must be 10 digits");
        emailForm.v_phn.focus();
        return false;
    }
    else{
        response.sendRedirect("venueweb.jsp");
    } 
}
</script>                                                                                                               
</head>
<!-- VenueForm -->        
<form name="emailForm" action="venueweb.jsp" method="post" onsubmit="return validate()">
    <div class ="header"  style="color:royalblue; font-size: 50px; margin-left:530px; margin-top: 20px;  font-style: normal; ">
            
                VenueForm
    </div> 
    <div class="loginBox">            
    <div class="row">
    <div class="input-field col s6" >
        <tr>
        <td>First Name <font color="red">*</font><br></td>
        <td><input type="text" id="v_fname" name="v_fname"  class="validate"  aria-required="true" required=""  /> 
             <span  data-error="enter first name" data-success="right"> </span>
        </td>
        </tr>
    </div> 
    </div>
    <div class="row">
    <div class="input-field col s6" >
        <tr>
        <td>Last Name <font color="red">*</font><br></td>
        <td><input type="text" id="v_lname" name="v_lname" class="validate"  aria-required="true" required="" /></td>
            <span  data-error="enter first name" data-success="right"> </span>
        </tr>
    </div> </div>
    <div class="row">
    <div class="input-field col s6" >
        <tr>
        <td>Email Id <font color="red">*</font><br></td>
        <td> <input  name="v_email"  id="v_email" type="email" class="validate" required="">
             <span data-error="enter valid email" data-success="right" id="invalid"></span>
        </td>
        </tr>   
    </div> </div>          
    <div class="row">
    <div class="input-field col s6" >
        <tr>
        <td>Phone No.<font color="red">*</font><br></td>
        <td><input  name="v_phn" aria-required="true"  id="v_phn" type="number"  size="20" pattern="[0-9]{10}" class="validate" required="">
             <span  data-error="enter phone no." data-success="right" ></span>
        </td>
        </tr>
    </div> </div>
    <div class="row">
    <div class="input-field col s6" >
        <tr>
        <td>Biography <font color="red">*<font color="black"> (max 150 characters)</font><br></td>
        <td> <input name="v_biography"   id="v_biography" maxLength="150" style="font-size:18px" style="height:15px"  class="validate" required="" 
                    onkeydown="charcounts('value','countchar');" >
            <span data-error="enter biography" data-success="right" id="countchar" style="color:red"></span>
        </td>
        </tr>
    </div> </div>
    <div class="row">
    <div class="input-field col s6" > <br> 
         <button class="buttonStyle" onClick="javascript:validate;" type="submit" name="action" >Submit</button>
    </div> </div>
    </div></div>
</form>
</html>