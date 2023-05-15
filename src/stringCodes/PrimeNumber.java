package stringCodes;

import java.util.Scanner;

public class PrimeNumber {

public static boolean isPrime(int num) {
// Validate that the number is neither less than 1 nor equal to 1.
// It should return false as it cannot be a prime number
if (num <= 1)
return false;

// Logic to check if a number is prime or not. If its Prime, returns true else
// return false
for (int i = 2; i < num; i++) {
if (num % i == 0) {
return false;
}
}

return true;

}

public static void main(String[] args) {
	// Use scanner class to get the user input.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			sc.close();
// Pass the integer value to check whether it is prime or not.
System.out.println("given number "+num+" is a prime number: "+isPrime(num));

}
	}

