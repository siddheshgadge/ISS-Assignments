// Lambda Expression for Interfaces
// Also called Functional Interfaces

interface Compute{
	double squareRoot(double num);
}

interface Adder{
	int add(int a, int b);
}

class LambdaExpressions{
	public static void main(String[] args) {
		Compute c1 = (double num) -> {return Math.sqrt(num);};
		System.out.println("Square Root of 4 is " + c1.squareRoot(4));

		Adder a1 = (int a, int b) -> {return a + b;};
		System.out.println("Addition of 3 and 4 is " + a1.add(3,4));

	}
}