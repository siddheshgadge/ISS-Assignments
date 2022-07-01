import java.util.*;

class ArrayListLinkedListTest{
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10); numbers.add(20); numbers.add(30);

		System.out.println(numbers);

		numbers.add(1,40);
		System.out.println("After add --> " + numbers);

		numbers.set(2,60);
		System.out.println("After set --> " + numbers);

		numbers.remove(0); // index
		System.out.println("After remove --> " + numbers);

		System.out.println("20 present --> " + numbers.contains(20));

		System.out.println("value at index 2 --> " + numbers.get(2));

		LinkedList<String> languages = new LinkedList<>();

		languages.add("C"); languages.add("C++"); languages.add("Java");

		System.out.println(languages);

		languages.addFirst("Python");
		System.out.println("After addFirst --> " + languages);

		languages.addLast("R");
		System.out.println("After addLast --> " + languages);

		languages.remove(0); // index
		System.out.println("After remove --> " + languages);

		languages.removeFirst(); 
		System.out.println("After removeFirst --> " + languages);

		languages.removeLast(); 
		System.out.println("After removeLast --> " + languages);


	}
}