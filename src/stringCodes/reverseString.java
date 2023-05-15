package stringCodes;

public class reverseString {

	public static void main(String[] args) {
		String inputString = "I am Rahul Tribhuvane";
		String outputString = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
		outputString = outputString + inputString.charAt(i);
		}

		System.out.println(outputString);


	}

}
