package cop.day4;

import java.util.Scanner;

public class Q1_StudentInfo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Student Information.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student name");
		String sname = sc.next();
		
		System.out.println("Enter the student roll no");
		int rollno = sc.nextInt();
		
		System.out.println("Enter the marks1");
		int marks1 = sc.nextInt();
		
		System.out.println("Enter the marks2");
		int marks2 = sc.nextInt();
		
		System.out.println("Enter the marks3");
		int marks3 = sc.nextInt();
		
		Q1_Student stud = new Q1_Student(sname, rollno,marks1, marks2, marks3);
		System.out.println("-------------------------------");
		stud.display();
		System.out.println("-------------------------------");
		
		
	}

}
