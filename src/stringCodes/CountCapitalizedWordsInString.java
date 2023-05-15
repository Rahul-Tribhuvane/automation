package stringCodes;
import java.util.Scanner;

public class CountCapitalizedWordsInString {

public static int getCapsWordsInString(String inputString) {

int counter = 0;
for(int i = 0; i < inputString.length(); i++) {
if(inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
counter++;
}
}
return counter;
}

public static void main(String[] args) {
	// Use scanner class to get the user input.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String str = sc.nextLine();
			sc.close();
System.out.println(getCapsWordsInString(str));
}

}
