interface Shape{
	void draw();								//Abstract method			
	default void msg(){							//Default Method		
		System.out.println("Default Method");
	}
	static int cube(int n){						//Static Method						
		return n*n*n;
	}
}

class Rectangle implements Shape{
	public void draw(){
		System.out.println("Drawing Rectangle");
	}
	public void msg(){							//Not mandatory to override default method
		System.out.println("Default Method called using Rectangle object");
	}
}

class Square implements Shape{
	public void draw(){
		System.out.println("Drawing Square");
	}
}

class InterfaceDemo{
	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.draw();
		s.msg();
		System.out.println("Cube of 3 = " + Shape.cube(3));
		s = new Square();
		s.draw();
		s.msg();
	}
}