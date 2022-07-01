//Program to find given strings are palindrome or not 

import java.io.*;

class Palindrome{
	public static void main(String[] args) {
		Console c = System.console();

		String s1 = c.readLine("Enter String = ");

		StringBuilder sb = new StringBuilder(s1);

		sb.reverse();

		if(s1.equals(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}