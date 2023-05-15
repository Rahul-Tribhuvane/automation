package stringCodes;

import java.util.Scanner;

public class checkArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");

		int num = sc.nextInt(); // 371
		sc.close();
		int actualnum = num;
		double result = 0;

		while (actualnum != 0) {
			int n = actualnum % 10;
			result = result + Math.pow(n, 3);
			actualnum = actualnum / 10;
		}

		if (result == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}

	}

}
