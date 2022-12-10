/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author HP
 */
public class Teacher {
    private int teacher_id;
    private String username;
    private String email;
    private String fname;
    private String Sname;
    private String password;
    private String dob;
    private String gender;
    private String address;
    private String course_name;
    private String contact;


public Teacher(int teacher_id,String fname,String Sname,String dob,String email,String contact,String gender,String address,String course_name,String username,String password){ 
       
    this.teacher_id=teacher_id;
    this.username= username;
    this.email= email;        
    this.fname= fname;
    this.Sname= Sname;
    this.password= password;
    this.dob= dob;
    this.gender= gender;
    this.address= address;
    this.course_name= course_name;
    this.contact=contact;
 }
public Teacher(String fname,String Sname,String dob,String email,String contact,String gender,String address,String course_name,String username,String password){ 
       
    this.username= username;
    this.email= email;        
    this.fname= fname;
    this.Sname= Sname;
    this.password= password;
    this.dob= dob;
    this.gender= gender;
    this.address= address;
    this.course_name= course_name;
    this.contact=contact;
 }


	public int getTeacher_id() {
		return this.teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return this.Sname;
	}

	public void setSname(String Sname) {
		this.Sname = Sname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse_name() {
		return this.course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}