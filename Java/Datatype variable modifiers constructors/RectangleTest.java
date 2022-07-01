// Understanding use of constructors
// constructor overloading

class Rectangle{
	private double length;
	private double width;

// Default constructor
	Rectangle(){
		length = 0;
		width = 0;
	}

// Parameterized constructors
	Rectangle(double length){
		this.length = length;
		this.width = length;
	}

	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	public double area(){
		return length*width;
	}
}

class RectangleTest{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5);
		Rectangle r3 = new Rectangle(5,4);

		System.out.println("Area of Rectangle r1 = " + r1.area());
		System.out.println("Area of Rectangle r2 = " + r2.area());
		System.out.println("Area of Rectangle r3 = " + r3.area());
	}
}