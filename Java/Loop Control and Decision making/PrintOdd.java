// Program to print odd numbers between 1 to 10

class PrintOdd{
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			if(i%2==0)
				continue;
			System.out.print(i + " ");
		}
	}
}