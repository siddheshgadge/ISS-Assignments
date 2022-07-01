// Multicatch 

class MultiCatch {
	public static void main(String args[]) {
		System.out.println("Processing started!");
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println("num = " + num);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("You need to pass atleast one integer!");
			System.out.println(e);
		}

		System.out.println("Processing ends!");
	}
}