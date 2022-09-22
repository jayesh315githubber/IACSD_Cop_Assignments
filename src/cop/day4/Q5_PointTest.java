package cop.day4;

import java.util.Scanner;

public class Q5_PointTest {

	public static void main(String[] args) {

		System.out.println("--- using default constructor ---");
		Q5_Point pt = new Q5_Point();
		pt.display();
			
		System.out.println("Enter the  value of X");
		Scanner sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
		
		System.out.println("Enter the  of Y ");
		Scanner sc2 = new Scanner(System.in);
		int y = sc2.nextInt();
		
		System.out.println("--- using parameterised constructor ---");
		Q5_Point pt1 = new Q5_Point(x, y);
		pt1.display();
		
		System.out.println("Enter the number to change the value of X by using setter.");
		int x1 = sc1.nextInt();
		pt1.setX(x1);
		
		System.out.println("Enter the number to change the value of Y by using setter.");
		int y1 = sc1.nextInt();
		pt1.setX(y1);
		
		pt1.display();
		

	}

}
