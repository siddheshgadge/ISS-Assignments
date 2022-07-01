// Program for finding number is even or odd
// if-else demonstration

import java.io.*;
class EvenOdd{
	public static void main(String args[]){
		Console c = System.console();

		int number = Integer.parseInt(c.readLine("Enter number - "));
		
		if(number % 2 == 0){
			System.out.println(number + " is even number.");
		} else{
			System.out.println(number + " is odd number.");
		}
	}
}