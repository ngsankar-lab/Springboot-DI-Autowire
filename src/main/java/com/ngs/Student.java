package com.ngs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("col")
	private College college;
	public Student() {
		super();
	System.out.println("Object created for Student");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void getStudent() {
		System.out.println("Inside Student");
		college.assign();
		
	}

}
