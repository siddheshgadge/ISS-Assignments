//wajp to demonstrate map

import java.util.*;
class MapTest {
	public static void main(String args[]) {
	//print in any order
	HashMap<String,Integer> list1 = new HashMap<>();
	list1.put("Virat",40);	list1.put("Rohit",50);	list1.put("Rahul",20);
	list1.put("Rohit",40);	list1.putIfAbsent("Rahul",45); list1.putIfAbsent("Ishan",60);
	System.out.println("Output for HashMap -> \n " + list1);
	
	//print in inserting order
	LinkedHashMap<String,Integer> list2 = new LinkedHashMap<>();
	list2.put("Virat",40);	list2.put("Rohit",50);	list2.put("Rahul",20);
	list2.put("Rohit",40);	list2.putIfAbsent("Rahul",45); list2.putIfAbsent("Ishan",60);
	System.out.println("Output for LinkedHashMap -> \n " + list2);

	//print in ascending or descending on key
	TreeMap<String,Integer> list3 = new TreeMap<>();
	list3.put("Virat",40);	list3.put("Rohit",50);	list3.put("Rahul",20);
	list3.put("Rohit",40);	list3.putIfAbsent("Rahul",45); list3.putIfAbsent("Ishan",60);
	System.out.println("Output for TreeMap -> \n " + list3);

}
}