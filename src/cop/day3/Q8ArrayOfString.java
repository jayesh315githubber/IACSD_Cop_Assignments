package cop.day3;

import java.util.Scanner;

/*
 * 8:Write a program to accept array of string.Display all elements in uppercase.
 */
public class Q8ArrayOfString {

	public static void main(String[] args) {

		String str[];
		String uprStr[];

		System.out.println("Enter the size of array of string.");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		str = new String[size];
		uprStr = new String[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter the string at index " + (i + 1) + " in lower case.");
			str[i] = sc.next();
		}

		System.out.print("Array of string is : ");

		displyString(str);
		upperCaseConversion(str, size, uprStr);
		System.out.println();
		System.out.print("Array of string in upper case : ");
		displyString(uprStr);

	}

	public static void upperCaseConversion(String str[], int size, String uprStr[]) {

		for (int i = 0; i < size; i++) {

			uprStr[i] = str[i].toUpperCase();
		}
	}

	public static void displyString(String Str[]) {

		for (String string : Str) {
			System.out.print(string + " ");
		}
	}

}
