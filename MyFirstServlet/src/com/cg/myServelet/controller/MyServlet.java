package com.cg.myServelet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.myServlet.pojo.Resume;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String highestQualification = request.getParameter("qualification");
		String dateOfBirth = request.getParameter("dob");
		String hobbies[] = request.getParameterValues("hobbies");
		String address = request.getParameter("address");
		String photo = request.getParameter("photo");
		String skills[] = request.getParameterValues("skills");
		String email = request.getParameter("email");
		String website = request.getParameter("website");
		String contactNo = request.getParameter("contact_no");
		String summary = request.getParameter("summary");
	
//		Part part = request.getPart("photo");
//		String fileName = extractFileName(part);
//		String savePath = "P:\\aullah\\JEE\\MyFirstServlet\\WebContent\\Images"+File.separator+ fileName;
//		File fileSaveDir = new File(savePath);			
//		part.write(savePath + File.separator);
		
	    Resume resume = new Resume(firstName, lastName, gender, highestQualification, dateOfBirth, hobbies, address, photo, skills, email, website, contactNo, summary);
	
	    request.setAttribute("ResumeRequest", resume);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("ResumeService.jsp");
	    
	    dispatcher.forward(request, response);
	    
	}

//	private String extractFileName(Part part) {
//		String contentDisp = part.getHeader("content-disposition");
//		String[] item = contentDisp.split(";");
//		  for(String s : item)
//		  {
//			  if(s.trim().startsWith("filename"))
//			  {
//				  return s.substring(s.indexOf("=") + 2,s.length() - 1);
//			  }
//		  }
//		return "";
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
