<%@page import="cse.NICinterpreter"%>
<%@page import="cse.NICinfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NICinterpreter</title>
<h2>Result of NIC Interpretation is</h2>
<%
	String input = request.getParameter("NIC_num");
	NICinterpreter n = new NICinterpreter(input);
        NICinfo n2 = n.interpretID();
        int[] birthday = n2.getDOB();
              
               out.println("Birthday  [ "); 
               out.println("Year : "+birthday[0]+" ");
               out.println("Month : "+birthday[1]+" ");
               out.println("Day : "+birthday[2]+" ]");
           %> 
<br><br>
<%   
               out.println("    Sex : "+n2.getSex());
%>
<br><br>
<%
               out.println("    is_A_Voter : "+n2.getIsVoter());	
%>
<br><br>

</head>
<body>

</body>
</html>