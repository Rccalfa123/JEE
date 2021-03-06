package com.cg.myServelet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.myServlet.pojo.Resume;

//This is a controller which will receive all requests from HTML
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// getting all parameters from form
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

		//Create resume object with parameterized constructor
		Resume resume = new Resume(firstName, lastName, gender, highestQualification, dateOfBirth, hobbies, address,
				photo, skills, email, website, contactNo, summary);

		//setting attribute in request so that it could be passed to other servlet
		request.setAttribute("ResumeRequest", resume);
		
		//Creating request dispatcher to dispatch data 
		RequestDispatcher dispatcher = request.getRequestDispatcher("ResumeService.jsp");

		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
