// Program to find reverse of digit using do while loop

import java.io.*;

class ReverseOfDigit{
	public static void main(String[] args) {
		Console c = System.console();

		int number = Integer.parseInt(c.readLine("Enter number - "));
		int reverse = 0, digit = 0;
		int temp = number;
		do{
			digit = temp % 10;
			reverse = reverse*10 + digit;
			temp = temp/10;
		} while(temp>0);
		System.out.format("Reverse of number %d is %d",number,reverse);
	}
}