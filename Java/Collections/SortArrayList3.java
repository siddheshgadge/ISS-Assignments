//Program for list of students and print in ascending and descending using name

import java.util.*;
class AscendingByRno  implements Comparator<Student> {
	public int compare(Student s1,Student s2){
		return s1.rno - s2.rno;
	}
}

class DescendingByRno  implements Comparator<Student> {
	public int compare(Student s1,Student s2){
		return s2.rno - s1.rno;
	}
}

class AscendingByName implements Comparator<Student> {
	public int compare(Student s1,Student s2){
		return s1.name.compareTo(s2.name);
	}
}

class DescendingByName implements Comparator<Student> {
	public int compare(Student s1,Student s2){
		return s2.name.compareTo(s1.name);
	}
}

class Student{
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
}

class SortArrayList3 {
	public static void main(String args[]){
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(10, "amit"));
		studentList.add(new Student(12, "zsan"));
		studentList.add(new Student(11, "ram"));
		studentList.add(new Student(13, "sid"));

		System.out.println(studentList);

		Collections.sort(studentList,new AscendingByRno());
		System.out.println("Ascending order by roll no.");
		System.out.println(studentList);

		Collections.sort(studentList,new DescendingByRno());
		System.out.println("Descending order by roll no.");
		System.out.println(studentList);

		Collections.sort(studentList,new AscendingByName());
		System.out.println("Ascending order by name");
		System.out.println(studentList);

		Collections.sort(studentList,new DescendingByName());
		System.out.println("Descending order by name");
		System.out.println(studentList);

	}
}