// Understanding variable types with Employee data 
// Variable types = Local, Instance and static
// Access modifiers = private, public, protected and default

class Employee{
	// Instance variable and static/class variable
	private static String name;
	private double salary;
	// use of final keyword 
	public static final String DEPARTMENT = "Development";

// In setData EmpName and EmpSalary are local variables for setData method 
	public void setData(String EmpName, double EmpSalary){
		name = EmpName;
		salary = EmpSalary;
	}

	protected void showData(){
		System.out.println("Name - "+name);
		System.out.println("Salary - "+salary);
		System.out.println("Department - " + DEPARTMENT);
	}
}

class EmployeeTest{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setData("Ramesh",25000);
		e1.showData();
		// Accessing static variable in outside class
		System.out.println("Department from outside class - " + Employee.DEPARTMENT);
		// Also can write e1.DEPARTMENT		
	}
}