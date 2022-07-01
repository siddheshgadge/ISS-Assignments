// Count occurences of each word in sentence

import java.util.*;
import java.io.*;

class CountOccurences {
	public static void main(String args[]) {
		Console c = System.console();
		String sentence = c.readLine("Enter sentence --> ");
		String[] words = sentence.split(" ");
		TreeMap<String,Integer> wc = new TreeMap<>();

		for(String w:words) {
			Integer co = wc.get(w);
			if(co == null)
				wc.put(w,1);
			else
				wc.put(w,co+1);
		}
		System.out.println(wc);
	}
}