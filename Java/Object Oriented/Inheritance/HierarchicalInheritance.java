// Hierarchical Inheritance

class Animal{
	public void printData(){
		System.out.println("This is Animal class.");
	}
}

class Dog extends Animal{
	public void printData(){
		super.printData();
		System.out.println("Dog class.");
	}
}


class Cat extends Animal{
	public void printData(){
		super.printData();
		System.out.println("Cat class.");
	}
}


class HierarchicalInheritance{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.printData();

		Cat c1 = new Cat();
		c1.printData();
	}
}
