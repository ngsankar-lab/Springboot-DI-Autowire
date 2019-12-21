package com.ngs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("col")
public class College {
	
	private int id;
	private String name;
	
	public College() {
		super();
		System.out.println("Object Created for College");
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
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + "]";
	}
	
	public void assign() {
		System.out.println("Inside assign");
	}
	
}
