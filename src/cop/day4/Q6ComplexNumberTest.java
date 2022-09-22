package cop.day4;

import java.util.Scanner;

public class Q6ComplexNumberTest {
	
	public static void main(String[] args) {
		
		System.out.println("*** Using Default Constructor ***");
		Q6ComplexNumber cn = new Q6ComplexNumber();
		cn.display();
		
		System.out.println("-----------------------------------");
		
		System.out.println("*** Using Parameterised Constructor ***");
		Q6ComplexNumber cn1 = new Q6ComplexNumber(4,8);
		cn1.display();
		
		System.out.println("-----------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real no for the first complex no.");
		int real1 = sc.nextInt();
		
		System.out.println("Enter the imaginary no for the first complex no.");
		int imaginary1 = sc.nextInt();
		
		Q6ComplexNumber cn2 = new Q6ComplexNumber(real1,imaginary1);
		cn2.display();
		
		System.out.println("Enter the real no for the Second complex no.");
		int real2 = sc.nextInt();
		
		System.out.println("Enter the imaginary no for the Second complex no.");
		int imaginary2 = sc.nextInt();
		
		Q6ComplexNumber cn3 = new Q6ComplexNumber(real2,imaginary2);
		cn3.display();
		
		System.out.println("*** Addition Of Two Complex Number ***");
		Q6ComplexNumber ar = new Q6ComplexNumber();
		
		ar.additionOfComplexNo(cn2, cn3);
	}
	

}
