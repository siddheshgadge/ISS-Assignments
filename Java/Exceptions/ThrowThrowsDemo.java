// Program for demonstration of throw and throws

class ThrowThrowsDemo {

	public static void compute(int a, int b) throws Exception{
		if(b == 0 ) throw new Exception("2nd number cannot be 0.");

		System.out.println("result is "+a/b);
	}

	// If we don't want to handle exception in main we can write main as throws exception

	public static void main(String[] args) /* throws Exception  */{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		try{
			compute(n1,n2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}