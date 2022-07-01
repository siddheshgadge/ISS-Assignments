// Program to store rferences into array

import java.io.*;
import java.util.*;

class Student{
	private int rollNo;
	private String name;
	private double percentage;

	public Student(int rollNo, String name, double percentage){
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	public void showData(){
		System.out.println("Roll No. = " + rollNo);
		System.out.println("Name = " + name);
		System.out.println("Percentange = " + percentage);
	}
}

class StudentData{
	public static void main(String[] args) {
		Console c = System.console();

		int studentCount = Integer.parseInt(c.readLine("Enter student count = "));
		
		Student studentData[] = new Student[studentCount];

		System.out.println("Enter Student data -->");
		for(int i = 0; i < studentCount; i++){
			int rollNo = Integer.parseInt(c.readLine("Enter Roll No. "));
			String name = c.readLine("Enter Name = ");
			double marks = Double.parseDouble(c.readLine("Enter percentage = "));
			studentData[i] = new Student(rollNo,name,marks);
		}

		for(Student student : studentData)
			student.showData();
	}
}