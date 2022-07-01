// Abstract class and abstract method

abstract class MumbaiUniversity{
	public void firstYear(){
		System.out.println("Final Papers for First Year will be corrected by Mumbai University.");
	}
	public abstract void secondYear();
	public abstract void thirdYear();
	public void finalYear(){
		System.out.println("Final Papers for Final Year will be corrected by Mumbai University.");
	}
}

class Vesit extends MumbaiUniversity{
	public void secondYear(){
		System.out.println("Final Papers for Second Year will be corrected by College.");
	}

	public void thirdYear(){
		System.out.println("Final Papers for Second Year will be corrected by College.");
	}
}

class AbstractDemo{
	public static void main(String[] args) {
		MumbaiUniversity m = new Vesit();			// abstract class reference not object
		m.firstYear();
		m.secondYear();
		m.thirdYear();
		m.finalYear();

		Vesit v = new Vesit();
		v.firstYear();
		v.secondYear();
		v.thirdYear();
		v.finalYear();
	}
}