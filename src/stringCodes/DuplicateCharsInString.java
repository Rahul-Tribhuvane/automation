package stringCodes;

import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class DuplicateCharsInString {

	static void duplicateChars(String inputString) {

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
// Store the key values in a set and then get the number of each duplicate character.
		Set<Character> keys = hash_map.keySet();
		for (char c : keys) {
			if (hash_map.get(c) > 1) {
				System.out.println(c + "-->" + hash_map.get(c));
			}
		}

	}
	public static void main(String[] args) {
		// Use scanner class to get the user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		sc.close();
// Input value which needs to be passed in the below method.
		duplicateChars(str);

	}

}
