// Program to find sum of digit using while loop

import java.io.*;

class SumOfDigit{
	public static void main(String[] args) {
		Console c = System.console();

		int number = Integer.parseInt(c.readLine("Enter number - "));

		int temp = number;
		int sum = 0, digit = 0;
		while(temp%10 > 0){
			digit = temp % 10;
			sum += digit;
			temp = temp / 10;
		}
		System.out.format("Sum of digits of %d is %d",number,sum);
	}
}