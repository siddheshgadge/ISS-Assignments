// Java Program to find area and circumference of rectangle
// states/ Instance variables - length, breadth
// Methods - setData(), showData(), area(), circumference()

import java.io.*;

class Rectangle{
	private double length;
	private double width;

	public void setData(double length, double width){
		this.length = length;
		this.width = width;
	}

	public void showData(){
		System.out.println("Length of Rectangle - " + length);
		System.out.println("Width of Rectangle - " + width);
	}

	public double area(){
		return length * width;
	}

	public double circumference(){
		return 2*(length + width);
	}
} 

class RectangleTest{
	public static void main(String args[]){
		Console c = System.console();
		double length = Double.parseDouble(c.readLine("Enter length = "));
		double width = Double.parseDouble(c.readLine("Enter width = "));

		Rectangle one = new Rectangle();
		one.setData(length,width);
		one.showData();
		System.out.println("Area of Rectangle = " + one.area());
		System.out.println("Circumference of Rectangle = " + one.circumference());
	}
}