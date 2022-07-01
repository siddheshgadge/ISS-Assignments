// Encapsulation

import java.io.*;

class Student{
	private int rollNo;
	private String name;
	private int marks;

	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}

	public int getRollNo(){
		return rollNo;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMarks(int marks){
		this.marks = marks;
	}

	public int getMarks(){
		return marks;
	}
}

class StudentTest{
	public static void main(String[] args) {
		Console c = System.console();
		int studentCount = Integer.parseInt(c.readLine("Enter Student count -> "));

		Student studentData[] = new Student[studentCount];

		for(int i = 0; i< studentCount; i++){
			Student s = new Student();
			s.setRollNo(Integer.parseInt(c.readLine("Enter roll no. -> ")));
			s.setName(c.readLine("Enter name -> "));
			s.setMarks(Integer.parseInt(c.readLine("Enter Marks -> ")));
			studentData[i] = s;
		}

		System.out.println("Printing Stored data -->");

		for(Student student: studentData){
			System.out.println("Roll No. = " + student.getRollNo());
			System.out.println("Name = " + student.getName());
			System.out.println("Marks = " + student.getMarks());
		}
	}
}