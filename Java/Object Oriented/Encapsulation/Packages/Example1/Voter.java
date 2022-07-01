package voting;

public class Voter{
	public static boolean checkEligibility(int age){
		if(age>=18)	return true;
		return false;
	}
}