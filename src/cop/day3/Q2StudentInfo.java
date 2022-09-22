package cop.day3;

import java.util.Scanner;

public class Q2StudentInfo {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Details of Student.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no.");
		
		int rollNo = sc.nextInt();
		System.out.println("Enter the name ");
		String name = sc.next();
		
		System.out.println("Enter the marks of english.");
		int english = sc.nextInt();
		
		System.out.println("Enter the marks of Science.");
		int science = sc.nextInt();
		
		System.out.println("Enter the math no.");
		int math = sc.nextInt();
		
		System.out.println("Enter the marks of chemistry");
		int chem = sc.nextInt();
		
		System.out.println("Enter the of history");
		int hist = sc.nextInt();
		
		
		Student s1 = new Student(rollNo, name, english , science, math, chem, hist );
		
		float per = s1.calculatePercentage();

		
		System.out.println("Percentage of"+name+ " is :"+per);
		System.out.print("Grade of "+name+"is " );
		s1.calculateGrade();
		
		 
		
		
	}

}
