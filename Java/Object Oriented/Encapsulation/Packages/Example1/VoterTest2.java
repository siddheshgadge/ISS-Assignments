//static import
import static voting.Voter.*;
import java.io.*;

class VoterTest2{
	public static void main(String args[]){
		Console c = System.console();

		int age = Integer.parseInt(c.readLine("Enter your age to check eligibility -> "));
		if(checkEligibility(age))
			System.out.print("Your Eligible to vote");
		else
			System.out.print("Your not Eligible to vote");
	}
}