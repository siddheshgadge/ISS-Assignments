// Factorial of number using for loop

import java.io.*;

class Factorial{
	public static void main(String[] args) {
		
		Console c = System.console();

		int number = Integer.parseInt(c.readLine("Enter number - "));

		if(number < 0)
			System.out.println("Invalid Input");
		else if(number == 0 || number == 1)
			System.out.format("Factorial of %d is 1",number);
		else{
			double fact = 1;
			for(int i = 1; i<=number; i++)
				fact = fact * i;
			System.out.format("Factorial of %d is %f",number,fact);
		}

	}
}