// Program for demonstration of RuntimeEception
// If we write RUntimeException no need to write method throws exception

class RuntimeExceptionDemo {

	public static void compute(int a, int b){
		if(b == 0 ) throw new RuntimeException("2nd number cannot be 0.");

		System.out.println("result is "+a/b);
	}

	public static void main(String[] args){
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		compute(n1,n2);
	}
}