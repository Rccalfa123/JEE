package com.cg.myServlet.pojo;

public class Resume {
private String firstName;
private String lastName;
private String gender;
private String highestQualification;
private String dateOfBirth;
private String[] Hobbies;   ;
private String Address;
private String photo;
private String[] skills;
private String email;
private String Website;
private String contactNo;
private String summary;


public Resume(String firstName, String lastName, String gender, String highestQualification, String dateOfBirth,
		String[] hobbies, String address, String photo, String[] skills, String email, String website, String contactNo,
		String summary) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.highestQualification = highestQualification;
	this.dateOfBirth = dateOfBirth;
	Hobbies = hobbies;
	Address = address;
	this.photo = photo;
	this.skills = skills;
	this.email = email;
	Website = website;
	this.contactNo = contactNo;
	this.summary = summary;
}


public String getFirstName() {
	return firstName;
}


public String getLastName() {
	return lastName;
}


public String getGender() {
	return gender;
}


public String getHighestQualification() {
	return highestQualification;
}


public String getDateOfBirth() {
	return dateOfBirth;
}


public String[] getHobbies() {
	return Hobbies;
}


public String getAddress() {
	return Address;
}


public String getPhoto() {
	return photo;
}


public String[] getSkills() {
	return skills;
}


public String getEmail() {
	return email;
}


public String getWebsite() {
	return Website;
}


public String getContactNo() {
	return contactNo;
}


public String getSummary() {
	return summary;
}

 


  
}
