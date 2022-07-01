// multilevel Inheritance

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

class Hod extends Teacher{
	private String department;

	public Hod(int id, String name, double salary, String department){
		super(id,name,salary);
		this.department = department;
	}

	public void showData(){
		super.showData();
		System.out.println("Department -> " + department);
	}
}

class MultilevelInheritance{
	public static void main(String[] args) {
		
		Hod h1 = new Hod(103,"Rajesh Rane",100000,"CMPN");
		h1.showData();

	}
}