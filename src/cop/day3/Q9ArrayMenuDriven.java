package cop.day3;

import java.util.Scanner;

/*
 9:Create Menu driven program for array operations.
   1:Read Array 
   2:Print Array 
   3:Search element in array 
   4:Reverse Array 
   5:Even number from array
   6:sum of array element
 */

public class Q9ArrayMenuDriven {

	public static void main(String[] args) {

		int size = 0;
		int arr[] = null;
		int c = 0;

		arr = new int[size];

		System.out.println("Select the number to perform required operation.");
		Scanner sc = new Scanner(System.in);

		System.out.println("   1:Read Array \r\n" + "   2:Print Array \r\n" + "   3:Search element in array \r\n"
				+ "   4:Reverse Array \r\n" + "   5:Even number from array\r\n" + "   6:sum of array element \r\n"
				+ "   7:Exit \r\n");

		do {

			System.out.println("Select the option to perform required operation.");
			int choise = sc.nextInt();
			switch (choise) {

			case 1:

				System.out.println("Enter the size of array.");
				Scanner sc1 = new Scanner(System.in);
				size = sc1.nextInt();
				arr = new int[size];
				readArray(arr, size);
				System.out.println("-----------------");
				break;

			case 2:
				boolean result1 = emptyCheck(arr);
				if (result1) {
					System.out.println("Element in the array are : ");
					printArray(arr);
					System.out.println("-----------------");
				}
				break;

			case 3:
				boolean result2 = emptyCheck(arr);
				if (result2) {
					System.out.println("Enter the number to search in array.");
					Scanner sc2 = new Scanner(System.in);
					int ele = sc2.nextInt();
					searchElement(arr, ele);
					System.out.println("-----------------");
				}
				break;

			case 4:
				boolean result3 = emptyCheck(arr);
				if (result3) {
					System.out.println("Reverse array.");
					reverseArray(arr, size);
					System.out.println("-----------------");
				}
				break;

			case 5:
				boolean result4 = emptyCheck(arr);
				if (result4) {
					evenNoFromArray(arr);
					System.out.println("-----------------");
				}
				break;

			case 6:
				boolean result5 = emptyCheck(arr);
				if (result5) {
					int sumation = sumOfArrayElement(arr);
					System.out.println("Sum of element in the array is :" + sumation);
					System.out.println("-----------------");
				}
				break;

			case 7:
				boolean result6 = emptyCheck(arr);
				if (result6) {
					System.out.println("Operation on the array is end.");
					c = 10;
					System.out.println("-----------------");
				}
				break;

			default:
				break;
			}
		} while (c < 8);

	}

	public static void readArray(int arr[], int size) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i + 1) + " element.");
			arr[i] = sc.nextInt();
		}
	}

	public static boolean emptyCheck(int arr[]) {

		if (arr.length == 0) {
			System.out.println("Array is empty, Please insert element by selecting the option 1.");
			return false;
		}
		return true;

	}

	public static void printArray(int arr[]) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void searchElement(int arr[], int element) {

		for (int i : arr) {
			if (i == element) {
				System.out.println("Given Element is present in the array");
			}
		}

	}

	public static void reverseArray(int arr[], int size) {

		for (int i = size - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");
		}
	}

	public static void evenNoFromArray(int arr[]) {

		System.out.println("Even element in the array are :");
		for (int i : arr) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static int sumOfArrayElement(int arr[]) {

		int sum = 0;

		for (int i : arr) {
			sum = sum + i;
		}

		return sum;
	}

}
