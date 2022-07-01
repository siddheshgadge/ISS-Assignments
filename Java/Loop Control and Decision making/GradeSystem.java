// Program for reading marks and giving grade according to marks
// 80 and above = A, between 60 and 80 = B, between 40 and 60 = C, less than 40 = D
// else if ladder

import java.io.*;

class GradeSystem{
	public static void main(String[] args) {
		Console c = System.console();
		int marks = Integer.parseInt(c.readLine("Enter Marks = "));

		if(marks >= 80){
			System.out.println("A Grade");
		} else if(marks < 80 && marks >= 60){
			System.out.println("B Grade");
		} else if(marks < 60 && marks >= 40){
			System.out.println("C Grade");
		} else {
			System.out.println("D Grade");
		}
	}
} 