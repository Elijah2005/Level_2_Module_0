package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> food = new ArrayList<String>();
		//2. Add five Strings to your list
		food.add("Pizza");
		food.add("Sushi");
		food.add("Ice Cream");
		food.add("Spaghetti");
		food.add("Pie");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < food.size(); i++) {
			System.out.println(i);
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
