import voting.Voter;
import java.io.*;

class VoterTest1{
	public static void main(String args[]){
		Console c = System.console();

		Voter v = new Voter();

		int age = Integer.parseInt(c.readLine("Enter your age to check eligibility -> "));
		if(v.checkEligibility(age))
			System.out.print("Your Eligible to vote");
		else
			System.out.print("Your not Eligible to vote");
	}
}