package org.javaguys.heap.entity;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	private String name;
	private String state;
	private String country;
	private List<Student> students;
	
	public School(String name,String state,String country) {
		this.name = name;
		this.state = state;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student) {
		if(null == students) {
			students = new ArrayList<>();
		}
		students.add(student);
	}
	
	

}
