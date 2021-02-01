package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> fruit = new ArrayList<String>();
		//2. Add five Strings to your list
		fruit.add("Orange");
		fruit.add("Strawberry");
		fruit.add("Grape");
		fruit.add("Pineapple");
		fruit.add("Apple");
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < fruit.size(); i++) {
			String p = fruit.get(i);
			System.out.println(p);
		}
		System.out.println("\n");
		
		//4. Print all the Strings using a for-each loop
		 for (String p : fruit) {
			System.out.println(p);
		}
		 System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i <fruit.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				System.out.println(fruit.get(i));
			}
		}
		System.out.println("/n");
		//6. Print all the Strings in reverse order.
		//int i = array.length-1; i >= 0 ; i--
		for (int i = fruit.size() -1; i >= 0; i--) {
			System.out.println(fruit.get(i));
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < fruit.size(); i++) {
			if (fruit.get(i).contains("e") ) {
				System.out.println(fruit.get(i));
			}
		}
	}
}
