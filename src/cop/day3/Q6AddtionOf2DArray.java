package cop.day3;

import java.util.Scanner;

/*
 * 6:Write a java program to make the addition of two 2D array And store result in Third array.
 */

public class Q6AddtionOf2DArray {

	public static void main(String[] args) {

		int arr1[][];
		int arr2[][];
		int result[][];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of row.");
		int row = sc.nextInt();

		System.out.println("Enter the size of colulmn.");
		int col = sc.nextInt();

		arr1 = new int[row][col];
		arr2 = new int[row][col];
		result = new int[row][col];

		System.out.println("Enter the element in First Array");
		create2Darray(row, col, arr1);

		System.out.println("Enter the element in Second Array");
		create2Darray(row, col, arr2);

		System.out.println("----------------------");
		System.out.println("First array");
		DisplayArray(row, col, arr1);

		System.out.println("----------------------");
		System.out.println("Second array");
		DisplayArray(row, col, arr2);

		System.out.println("-------------");
		System.out.println("Addition of two array is:");
		AdditionOfArray(row, col, arr1, arr2, result);
		DisplayArray(row, col, result);

	}

	public static void create2Darray(int row, int col, int arr1[][]) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.println("Enter the " + (i + 1) + " row " + "of " + (j + 1) + " column");
				int ele = sc.nextInt();
				arr1[i][j] = ele;
			}
		}

	}

	public static void DisplayArray(int row, int col, int arr[][]) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void AdditionOfArray(int row, int col, int arr1[][], int arr2[][], int result[][]) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				result[i][j] = arr1[i][j] + arr2[i][j];
			}

		}
	}

}
