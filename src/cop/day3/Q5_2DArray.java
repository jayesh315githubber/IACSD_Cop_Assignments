package cop.day3;

import java.util.Scanner;

/*
 * 5:Write a Java program to accept 2D aaray elements.Display all elements.
 */

public class Q5_2DArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of row.");
		int row = sc.nextInt();

		System.out.println("Enter the size of colulmn.");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.println("Enter the " + (i + 1) + " row " +"of "+  (j + 1) + " column");
				int ele = sc.nextInt();
				arr[i][j] = ele;
			}
		}
		
		System.out.println("2D array.");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+"  " );
			}
			System.out.println();
		}

	}

}
