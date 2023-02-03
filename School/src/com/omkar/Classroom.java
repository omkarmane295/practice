package com.omkar;

import java.util.ArrayList;

public class Classroom {
	private char div;
	private int standard;
	private int strength;
	private ArrayList<Student> students;
	
	public Classroom() {}
	
	public Classroom(char div, int standard, int strength, ArrayList<Student> students) {
		super();
		this.div = div;
		this.standard = standard;
		this.strength = strength;
		this.students = students;
	}
	public char getDiv() {
		return div;
	}
	public void setDiv(char div) {
		this.div = div;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Classroom [div=" + div + ", standard=" + standard + ", strength=" + strength + ", students=" + students
				+ "]";
	}
	
	
}
