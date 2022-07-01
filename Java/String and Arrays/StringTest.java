// String and string methods

class StringTest{
	public static void main(String[] args) {
		String name = "Siddhesh";

		System.out.println(name);
		System.out.println("Length = " + name.length());

		String surname = " Gadge";
		String fullname = name.concat(surname);
		System.out.println("Fullname = " + fullname);

		//Substrings
		System.out.println("Whole string = " + fullname.substring(0));
		System.out.println("First 5 letters = " + fullname.substring(5));
		System.out.println("Letters between index 5 and 10 = " + fullname.substring(5,10));

		// index methods
		System.out.println("First occurence of d = " + name.indexOf("d"));
		System.out.println("Last occurence of d = " + name.lastIndexOf("d"));

		// equals and equalsIgnoreCase

		String s1 = "SiddhesH";
		String s2 = "siddhesh";

		System.out.println("equals method result = " + s1.equals(s2));
		System.out.println("equalsIgnoreCase method result = " + s1.equalsIgnoreCase(s2));
		
		// other methods
		System.out.println("Uppercase = " + name.toUpperCase());
		System.out.println("Lowercase = " + name.toLowerCase());
		

	}
}