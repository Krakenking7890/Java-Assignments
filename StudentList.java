package com.sonata.day4assignment;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	List<Student> students = new ArrayList<>();
	public List<Student> getStudent() {
		students.add(new Student(100, "Guru", 67));
		students.add(new Student(101, "Raj", 59));
		students.add(new Student(102, "Gururaj", 94));
		students.add(new Student(103, "Arvind", 86));
		students.add(new Student(104, "Aadesh", 71));
		return students;
	}
	public List<Student>getStudentsSort() {
		List<Student> students = new StudentList().getStudent();
		students.sort((o1, o2)-> o2.getMarks() - o1.getMarks());
		return students;
	}
	public static void main(String args[]) {
		System.out.println("\t\t - Before Sorting -\n" + new StudentList().getStudent() + "\n");
		System.out.println("\t\t - After Sorting -\n" + new StudentList().getStudentsSort());
	}

}
