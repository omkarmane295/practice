package com.omkar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> marks = new HashMap<>();
		marks.put("English", 75);
		marks.put("Hindi", 86);
		marks.put("Maths", 95);
		marks.put("Science", 85);
		System.out.println(marks.get("Maths"));
		
		
//		marks.put("Maths", 86);
//		System.out.println(marks.get("Maths"));
//		Comparator<Student> engMarkComp = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o2.getMarks().get(0)-o1.getMarks().get(0);
//			}
//		};
//		
//		Student s1 = new Student("sandeep",1,false,Arrays.asList(80,70,60,90,60,75));
//		Student s2 = new Student("omkar",2,true,Arrays.asList(86,70,60,90,60,75));
//		Student s3 = new Student("hrishi",3,true,Arrays.asList(75,70,60,90,60,75));
//		Student s4 = new Student("avi",4,true,Arrays.asList(40,70,60,90,60,75));
//		ArrayList<Student> slist1 = new ArrayList<>();
//		slist1.add(s1);slist1.add(s2);slist1.add(s3);slist1.add(s4);
//		Collections.sort(slist1,engMarkComp);
//		Classroom c1 = new Classroom('a',5,4,slist1);
//		
//		Student s5 = new Student("sagar",1,true,Arrays.asList(86,70,60,90,60,75));
//		Student s6 = new Student("abhi",2,false,Arrays.asList(30,70,60,90,60,75));
//		Student s7 = new Student("taku",3,true,Arrays.asList(20,70,60,90,60,75));
//		ArrayList<Student> slist2 = new ArrayList<>();
//		slist2.add(s5);slist2.add(s6);slist2.add(s7);
//		Collections.sort(slist2,engMarkComp);
//		Classroom c2 = new Classroom('b',5,3,slist2);
//		
//		Student s8 = new Student("jija",1,false,Arrays.asList(89,70,60,90,60,75));
//		Student s9 = new Student("sanu",2,true,Arrays.asList(50,70,60,90,60,75));
//		Student s10 = new Student("swara",3,true,Arrays.asList(30,70,60,90,60,75));
//		Student s11 = new Student("ram",4,false,Arrays.asList(90,70,60,90,60,75));
//		Student s12 = new Student("laila",5,true,Arrays.asList(74,70,60,90,60,75));
//		ArrayList<Student> slist3 = new ArrayList<>();
//		slist3.add(s8);slist3.add(s9);slist3.add(s10);slist3.add(s11);slist3.add(s12);
//		Collections.sort(slist3,engMarkComp);
//		Classroom c3 = new Classroom('c',5,5,slist3);
//		
//		ArrayList<Classroom> school = new ArrayList<>();
//		school.add(c1);school.add(c2);school.add(c3);
//		
////		System.out.println(school);
//		
//		Collections.sort(school,(class1,class2)->(class2.getStudents().get(0).getMarks().get(0)-class1.getStudents().get(0).getMarks().get(0)));
//
//		System.out.println(school.stream().findFirst().get().getStudents().get(0).getName());
		//		school.forEach(classs->{
//			System.out.println(classs);
//		});
		
		
		
//		
//		int engtop1 = slist1.stream().findFirst().get().getMarks().get(0);
//		
//		int engtop2 = slist2.stream().findFirst().get().getMarks().get(0);
//		
//		int engtop3 = slist3.stream().findFirst().get().getMarks().get(0);
//		
//		System.out.println(engtop1+" "+engtop2+" "+engtop3);
//		
//		int topperMarks = Integer.MIN_VALUE;
//		if(topperMarks<engtop1) {
//			topperMarks = engtop1;
//		} 
//		if (topperMarks<engtop2) {
//			topperMarks = engtop2;
//		} 
//		if (topperMarks<engtop3) {
//			topperMarks = engtop3;
//		}
//		System.out.println(topperMarks);
		
//		slist1.forEach(stu -> {
//			System.out.println(stu.getMarks().get(0));
//		});
		
		
	}

}
