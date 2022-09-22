package cop.day2;

import java.util.Scanner;

public class Q18GreatestOfThreeNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number.");
		int num1 = sc.nextInt();

		System.out.println("Enter the Second Number.");
		int num2 = sc.nextInt();

		System.out.println("Enter the Third Number.");
		int num3 = sc.nextInt();

		if (num1 > num2) {

			if (num1 > num3) {
				System.out.println(num1 + " is a greatest number.");
			} else {
				System.out.println(num3 + " is a greatest number.");
			}

		} else {

			if (num2 > num3) {
				System.out.println(num2 + " is a greatest number.");
			} else {
				System.out.println(num3 + " is a greatest number.");
			}

		}

	}

}
