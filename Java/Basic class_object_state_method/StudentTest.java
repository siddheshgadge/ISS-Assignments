// Program for basic concept of class object state and methods
import java.io.*;

class Student{
	private int rollNo;									// states : Instance variables
	private String name;
	private int marks;

	public void getData(){								// Method of the class student		
		Console c = System.console();
		this.rollNo = Integer.parseInt(c.readLine("Enter roll No. "));
		this.name = c.readLine("Enter Name = ");
		this.marks = Integer.parseInt(c.readLine("Enter marks = "));
	}

	public void showData(){								// Method of the class student
		System.out.println("Roll No. " + rollNo);
		System.out.println("Name " + name);
		System.out.println("marks " + marks);
	}
}

class StudentTest{
	public static void main(String args[]){

		Student s1 = new Student();						// Object of the class student
		s1.getData();
		s1.showData();
	}
}