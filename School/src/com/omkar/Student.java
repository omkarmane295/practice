package com.omkar;

import java.util.List;

public class Student {
	private String name;
	private int rollNumber;
	private boolean result;
	private List<Integer> marks;
	
	public Student() {}
	
	public Student(String name, int rollNumber, boolean result, List<Integer> marks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.result = result;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", result=" + result + ", marks=" + marks + "]";
	}
	
	
	
}
