// Implementation of ArrayList and LinkedList
// Program for storing marks of the students and find highest and lowest between them

import java.io.*;
import java.util.*;

class ListTest{
	public static void main(String[] args) {
		Console c = System.console();
		ArrayList<Integer> marks = new ArrayList<>();

		String reply = c.readLine("Would you like to enter marks y/n ?");

		while(reply.equals("y")){
			marks.add(Integer.parseInt(c.readLine("Enter marks -> ")));
			reply = c.readLine("Would you like to enter more marks y/n -> ");
		}

		System.out.println("Marks -> " + marks);

		Collections.sort(marks);

		System.out.println("Highest marks -> " + marks.get(marks.size()-1));
		System.out.println("Lowest marks -> " + marks.get(0));

		System.out.println("Highest marks -> " + Collections.max(marks));
		System.out.println("Highest marks -> " + Collections.min(marks));

		// sort arraylist in descending order
		Collections.sort(marks, Collections.reverseOrder());
		System.out.println(marks);

		
	}
}