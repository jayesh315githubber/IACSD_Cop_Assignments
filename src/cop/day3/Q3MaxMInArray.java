package cop.day3;

import java.util.Scanner;

/*
3:Write a Java program to find the maximum and minimum value of an array.
 */

public class Q3MaxMInArray {
	
	public static void main(String[] args) {
		
		int [] arr ;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		 
		arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the "+(i+1)+" Element.");
			int ele = sc.nextInt() ; 
			arr[i] = ele ;
		}
		
		System.out.println("Element of array");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int max = arr[0];
		int min=arr[0];
		for (int i : arr) {
			
			if(max < i) {
				max = i;
			}
			if(min > i) {
				min = i ;
			}
		}
		System.out.print("Maximum value of array : ");
		System.out.println(max);
		System.out.print("Minimum value of array : ");
		System.out.println(min);
		
	
		
		
		
	}

}
