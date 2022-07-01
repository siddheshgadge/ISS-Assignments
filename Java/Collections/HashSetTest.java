import java.util.*;
import java.io.*;
class Employee {
	int eid;
	String ename;
	double esalary;

	Employee (int eid,String ename,double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public String toString() {
		return eid + " " + ename + " " + esalary;
	}

	public boolean equals(Object o) {
		Employee e = (Employee) o;
		return eid == e.eid;
	}

	public int hashCode() {
		return 4;
	}	
}
class HashSetTest {
	public static void main(String args[]) {
		Console c = System.console();
		HashSet<Employee> emp = new HashSet<>();

		while(true) {
			int op = Integer.parseInt(c.readLine("1.add 2.view 3.remove 4.exit --> "));
			if(op==1) {
				int eid = Integer.parseInt(c.readLine("Enter eid --> "));
				String ename = c.readLine("Enter name --> ");
				double esalary = Double.parseDouble(c.readLine("Enter salary --> "));
				Employee e = new Employee(eid,ename,esalary);
				if(emp.add(e))
					System.out.println(eid + " added!");
				else
					System.out.println(eid + " already exists!");
			} else if (op == 2){
				System.out.println(emp);
			} else if (op == 3){
				int eid = Integer.parseInt(c.readLine("Enter eid to remove --> "));
				Employee e = new Employee(eid," ",0.0);
				if(emp.remove(e))
					System.out.println(eid + " removed!");
				else
					System.out.println(eid + " not found!");

			} else if (op == 4){
				break;
			} else {
				System.out.println("Invalid option!");
			}	 
		}
	}
}