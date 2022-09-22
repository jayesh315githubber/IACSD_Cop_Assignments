package cop.day3;

import java.util.Scanner;

public class Q10StoreInThirdArray {

	public static void main(String[] args) {

		int arr1[] = null;
		int arr2[] = null;
		int result[] = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of first array.");
		int size1 = sc.nextInt();
		arr1 = new int[size1];
		createArray(arr1, size1);
		System.out.println("----------------------");

		System.out.println("Enter the size of second array");
		int size2 = sc.nextInt();
		arr2 = new int[size2];
		createArray(arr2, size2);
		System.out.println("----------------------");

		int tsize = (size1 + size2);
		result = new int[tsize];
		
		createThirdArray(arr1, arr2, result, tsize );
		System.out.println("Resultant array is :");
		display(result);

	}

	public static void createArray(int arr[], int size) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i + 1) + " element ");
			arr[i] = sc.nextInt();
		}
	}

	public static void createThirdArray(int arr1[], int arr2[], int result[], int tsize) {

		//result = new int[tsize];

		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}

		for (int i = arr1.length ; i < tsize; i++) {
			result[i] = arr2[i - arr1.length];
		}
	}

	public static void display(int arr[]) {

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
