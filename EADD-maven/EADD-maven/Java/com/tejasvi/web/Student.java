package com.tejasvi.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String student_Name;
	private int Grade;
	private int Roll_no;
	private String Gender;
	private String Address;
	public int getId() {
	
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", student_Name=" + student_Name + ", Grade=" + Grade + ", Roll_no=" + Roll_no
				+ ", Gender=" + Gender + ", Address=" + Address + "]";
	}
	
}
