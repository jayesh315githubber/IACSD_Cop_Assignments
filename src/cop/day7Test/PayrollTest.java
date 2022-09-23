package cop.day7Test;

import java.util.Scanner;

import cop.day7Class.Payroll;

public class PayrollTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee name.");
		String empname = sc.next();
		
		System.out.println("Enter the Employee salary.");
		double empSal = sc.nextDouble();
				
		Payroll e1 = new Payroll(empname, empSal);
		e1.displayDetails();
		
				
		

	}

}
