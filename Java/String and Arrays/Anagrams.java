//listen silent / fired fried are anagrams

import java.io.*;
import java.util.*;

class Anagrams{

	public static String mySort(String s){
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		s = new String(ch);
		return s;
	}

	public static void main(String[] args) {
		Console c = System.console();

		String s1 = c.readLine("Enter string 1 = ");
		String s2 = c.readLine("Enter string 2 = ");

		s1 = mySort(s1);
		s2 = mySort(s2);

		if(s1.equals(s2))
			System.out.println("Given Strings are Anagrams.");
		else
			System.out.println("Given Strings are not Anagrams.");

	}
}