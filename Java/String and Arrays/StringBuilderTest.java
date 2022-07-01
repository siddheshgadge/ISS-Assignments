//stringbuilder and StringBuilder methods

class StringBuilderTest{
	public static void main(String[] args) {
		String name = "Siddhesh";
		StringBuilder sb = new StringBuilder(name);
		String surname = " Gadge";
		System.out.println("Name - " + sb);
		sb.append(surname);								//Mutability
		System.out.println("Fullname = " + sb);

		// methods
		sb.append(" is software developer.");
		System.out.println("After append method - " + sb);

		sb.insert(18, "a ");
		System.out.println("After insert method - " + sb);

		sb.delete(15,25);
		System.out.println("After delete method - " + sb);

	}
}