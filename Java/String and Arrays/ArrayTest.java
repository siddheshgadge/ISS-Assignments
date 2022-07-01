// Store marks in array and find out highest and lowest marks

import java.io.*;
import java.util.*;

class ArrayTest{
	public static void main(String[] args) {
		Console c = System.console();

		int studentCount = Integer.parseInt(c.readLine("Enter student count -> "));

		int marks[] = new int[studentCount];

		for(int i = 0; i < studentCount; i++){
			marks[i] = Integer.parseInt(c.readLine("Enter marks -> "));
		}

		Arrays.sort(marks);

		System.out.println("Lowest Marks -> " + marks[0]);
		System.out.println("Highest Marks -> " + marks[marks.length - 1]);
	}
}