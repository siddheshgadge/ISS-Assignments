// Program for list of students and print in ascending and descending using name

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int rno;
	String name;

	public Student(int rno,String name){
		this.rno = rno;
		this.name = name;
	}

	public String toString() {
		String msg = "roll no --> "+rno+" Name --> "+name;
		return msg;
	}

	public int compareTo(Student s) {			//Overriding interface method of comparable 
		return s.name.compareTo(name);			//for descending name.compareTo(s.name);
	}
}

class SortArrayList {
	public static void main(String args[]){
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(10, "amit"));
		studentList.add(new Student(12, "san"));
		studentList.add(new Student(11, "ram"));
		studentList.add(new Student(13, "sid"));

		Collections.sort(studentList);
		System.out.println(studentList);
}
}