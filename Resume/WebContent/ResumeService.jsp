<%@page import="com.cg.myServlet.pojo.Resume"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table{
        border-color: black;
        border: dotted;      
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1 align="center"> RESUME </h1><br>
<%
   Resume resume = (Resume)request.getAttribute("ResumeRequest"); 
 %>
 
 <div></div>
 
 <table align="center" cellspacing="20">
   <tr><td>First Name </td><td><%=resume.getFirstName()%></td> <td> <img alt="" width="100" height="100"   src="<%=resume.getPhoto()%>"></td></tr>
   
   <tr><td>Last Name</td> <td> <%=resume.getLastName()%></td></tr>
   
   <tr><td>Gender</td> <td> <%=resume.getGender()%></td></tr>	
   
   <tr><td>HighestQualification</td> <td><%=resume.getHighestQualification()%></td></tr>
   
   <tr><td>Date of Birth</td><td><%=resume.getDateOfBirth()%></td></tr>
   
   <tr><td>Hobbies</td> <td>
   	 <%for(String hobby:resume.getHobbies()){
					%><%=hobby%>&nbsp&nbsp&nbsp&nbsp<% 
         	 }%>
     
   </td></tr>
   
   <tr><td>Address</td><td><%=resume.getAddress()%> </td></tr>
     
   <tr><td>Skills </td><td>
     <%for(String skill:resume.getSkills()){
				%><%=skill%>&nbsp&nbsp&nbsp&nbsp<% 
          }%>  
           </td></tr>

  <tr><td>Email</td> <td> <%=resume.getEmail()%> </td></tr>
  
  <tr><td>Website</td> <td>  <%=resume.getWebsite()%></td></tr>
  
  <tr><td>Contact No</td> <td> <%=resume.getContactNo()%> </td></tr>
  
  <tr><td>Summary </td><td><%=resume.getSummary()%></td></tr>
   
  </table> 

</body>
</html>