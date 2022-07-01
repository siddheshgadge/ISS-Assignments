// Single Inheritance

class Person{
	private int id;
	private String name;

	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}

	public void showData(){
		System.out.println("Id -> " + id);
		System.out.println("Name -> " + name);
	}
}

class Teacher extends Person{
	private double salary;

	public Teacher(int id, String name, double salary){
		super(id,name);
		this.salary = salary;
	}

	public void showData(){
		super.showData();
		System.out.println("Salary -> " + salary);
	}	
}

class SingleInheritance{
	public static void main(String[] args) {

		Teacher t1 = new Teacher(102,"Ramesh Zope",50000);
		t1.showData();

	}
}