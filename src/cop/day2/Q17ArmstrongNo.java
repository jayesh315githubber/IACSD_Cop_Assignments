package cop.day2;

import java.util.Scanner;

public class Q17ArmstrongNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");

		int number = sc.nextInt();

		int t1 = number;
		int leng = 0;

		while (t1 != 0) {
			leng = leng + 1;
			t1 = t1 / 10;
		}

		int t2 = number;
		int arm = 0;
		int rem;
		
		while (t2 != 0) {

			rem = t2 % 10;
			int mul = 1;

			for (int i = 1; i <= leng; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}

		if (arm == number) {
			System.out.println("Given number is a armstrong number.");
		} else {
			System.out.println("Given number is not a armstrong number.");
		}

	}

}
