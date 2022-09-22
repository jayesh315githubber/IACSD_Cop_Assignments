package cop.day2;

import java.util.Scanner;

public class Q21TwoIntegerOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number.");
		int num1 = sc.nextInt();

		System.out.println("Enter the Second Number.");
		int num2 = sc.nextInt();

		System.out.println("Enter the character to perform the corresponding operation.");
		System.out.println("1.Addtion(+) \n2.Substraction(-) \n3.Multiplication(*) \n4.Division(/)");

		char ch = sc.next().charAt(0);
		double result;

		switch (ch) {

		case '+':
			result = num1 + num2;
			System.out.println("Addition of two number is :" + result);
			break;

		case '-':
			result = num1 - num2;
			System.out.println("Substraction of two number is :" + result);
			break;

		case '*':
			result = num1 * num2;
			System.out.println("Multiplication of two number is :" + result);
			break;

		case '/':
			result = num1 / num2;
			System.out.println("Division of two number is :" + result);
			break;

		default:
			System.out.println("Invalid input...");
			break;
		}

	}

}
