package stringCodes;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		// Use scanner class to get the user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		sc.close();

		System.out.println("before swaping num1 = " + num1);
		System.out.println("before swaping num2 = " + num2);

// Logic to swap 2 numbers.
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After number swapping");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

	}

}
