// Some common Exceptions

class CommonExceptions{
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		try{
			System.out.println(20/0);
		} catch(ArithmeticException e){
			System.out.println("Cannot Divide by 0 Issue -> " + e);
		}

		try {
			String s = "abc";
			int n = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Cannot covert string into integer. Issue -> " + e);
		}

		try {
			String s[] = new String[5];
			s[11] = "abc";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}