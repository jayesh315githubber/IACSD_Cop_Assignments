package cop.day3;

import java.util.Scanner;

/*
 * 7:Write a java program to convert char array into String.
 */

public class Q7CharArrayToStringArray {
	
	
	
	public static void main(String[] args) {
	
		
		System.out.println("Enter the size of character array.");
		Scanner sc = new Scanner(System.in)	;
		int size = sc.nextInt();
		
		char arr [] = new char[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the character at "+(i+1)+" position.");
			arr[i] = sc.next().charAt(0);
		}
		
		for (char c : arr) {
			System.out.print(c +" ");
		}
		
		System.out.println();
		System.out.println("-------------");
		System.out.println("Array to string :");
		
		
		String str = ArrayToStringConversion(arr);
		System.out.println(str);
				
	}
	
	public static String ArrayToStringConversion(char [] arr ) {
		
		return  String.valueOf(arr);

	}

}
