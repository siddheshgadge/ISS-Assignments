/*
Program to read ratings between 1 to 5 and print the feedback msg.
5 --> Good   3 or 4 --> ok     1,2 --> poor
*/
// switch case and break

import java.io.*;

class FeedbackToMessage{
	public static void main(String[] args) {
		Console c = System.console();

		int starRating = Integer.parseInt(c.readLine("Enter rating - "));

		switch(starRating){
		case 5 : System.out.println("Good!");
				 break;
		case 4,3 : System.out.println("Ok!");
				   break;
		case 2,1 : System.out.println("Poor!");
				   break;
		default : System.out.println("Invalid Option!");
		}
	}
}