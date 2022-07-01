// Array class and its methods

import java.util.*;

class ArrayMethod{
	public static void main(String[] args) {
		String books[] = {"Harry Potter", "Alchemist", "Shreeman Yogi", "Silverstar", "Fault in our stars"};

		// sort method
		System.out.println("Sorted books array -> ");
		Arrays.sort(books);
		for(String book : books)
			System.out.println(book);
		System.out.println();

		// binary search method
		System.out.println("Book search for Shreeman Yogi -> "+Arrays.binarySearch(books,"Shreeman Yogi"));
		System.out.println("Book search for yayati -> " + Arrays.binarySearch(books,"Yayati"));

		// arraycopy method
		String booksCopy[] = {"C","C++","Java","Computer Science","Chanakyaniti"};
		System.arraycopy(books,2,booksCopy,0,3);		
		System.out.println("Books Copy Array -> ");
		for(String book : booksCopy)
			System.out.println(book);
	}
}