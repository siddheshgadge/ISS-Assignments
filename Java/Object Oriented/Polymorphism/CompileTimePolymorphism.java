// Method Overloading

class CompileTimePolymorphism{
	public static int area(int length){
		return length * length;
	}

	public static int area(int length, int breadth){
		return length * breadth;
	}

	public static void main(String[] args) {
		System.out.println("Area of Square -> " + area(20));
		System.out.println("Area of Rectangle -> " + area(10,20));
	}
}