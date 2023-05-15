package stringCodes;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumOfCharsInString {

	static void characterCount(String inputString) {

// Creating a hashmap object.
		HashMap<Character, Integer> hash_map = new HashMap<>();
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (hash_map.containsKey(c)) {
				hash_map.put(c, hash_map.get(c) + 1);
			}

			else {
				hash_map.put(c, 1);
			}

		}
// Print the hashmap object which gives the number of each character in String.
		System.out.println(hash_map);

	}

	public static void main(String[] args) {
		// Use scanner class to get the user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		sc.close();
// Input value which needs to be passed in the below method.
		characterCount(str);

	}
}
