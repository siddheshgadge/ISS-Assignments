// Method Overriding also called Dynamic binding or dynamic method dispatch

class Shape{
	int sides = 0;

	public void draw(){
		System.out.println("Drawing Shape...");
	}
}

class Rectangle extends Shape{
	int sides = 4;

	public void draw(){
		System.out.println("Drawing Rectangle");
	}
}

class Hexagone extends Shape{
	int sides = 6;

	public void draw(){
		System.out.println("Drawing Hexagone");
	}
}

class RuntimePolymorphism{
	public static void main(String[] args) {
		Shape s = new Shape();
		System.out.println("Output for object of Shape class -> ");
		System.out.println("Sides -> " + s.sides); 
		s.draw();

		s = new Rectangle();
		System.out.println("Output for object of Rectangle class -> ");
		// Now if we see output we cannot override data member/ instance variables
		// Output for the sides will be from parent class only
		System.out.println("Sides -> " + s.sides);
		s.draw();

		s = new Hexagone();
		System.out.println("Output for object of Hexagone class -> ");
		System.out.println("Sides -> " + s.sides); 
		s.draw();

	}
}