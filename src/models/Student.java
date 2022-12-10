/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Lenovo
 */
public class Student {
     private int std_id;
    private String username;
    private String email;
    private String fname;
    private String Sname;
    private String password;
    private String dob;
    private String gender;
    private String address;
    private String std_batch;
    private String contact;


public Student(int std_id,String fname,String Sname,String dob,String email,String contact,String gender,String address,String std_batch,String username,String password){ 
    
    this.std_id=std_id;
    this.username= username;
    this.email= email;        
    this.fname= fname;
    this.Sname= Sname;
    this.password= password;
    this.dob= dob;
    this.gender= gender;
    this.address= address;
    this.std_batch= std_batch;
    this.contact=contact;
 }
public Student(String fname,String Sname,String dob,String email,String contact,String gender,String address,String std_batch,String username,String password){ 
    
    this.username= username;
    this.email= email;        
    this.fname= fname;
    this.Sname= Sname;
    this.password= password;
    this.dob= dob;
    this.gender= gender;
    this.address= address;
    this.std_batch= std_batch;
    this.contact=contact;
 }

public Student(String username,String password){
this.username=username;
this.password=password;
    
}


	public int getstd_id() {
		return this.std_id;
	}

	public void setstd_id(int std_id) {
		this.std_id = std_id;
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

	public String getstd_batch() {
		return this.std_batch;
	}

	public void setstd_batch(String std_batch) {
		this.std_batch = std_batch;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
    
}
