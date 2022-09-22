package cop.day2;

import java.util.Scanner;

public class Q19PizzaShopMenu {

	public static void main(String[] args) {

		int total = 0;
		int Qnt;
		int T1, T2, T3, T4,T5, T6;
		int c = 0;

		do {
			System.out.println("Select the option for order.");
			System.out.println(
					"1.Personal pan pizza(Rs.299) \n2.Medium pan pizza(Rs.199) \n3.pasta chees pizza(Rs.249) \n4.Hamburger(Rs.99) \n5.Pepsi(Rs.25) \n6.cheesy italliano(Rs.349) \n7.Total amount And Exit");
			
			Scanner sc = new Scanner(System.in);
			int choise = sc.nextInt();
			
			switch (choise) {

			case 1:
				System.out.println("Enter the Quantity of Item.");
				Qnt = sc.nextInt();
				T1 = 299 * Qnt;
				total = total + T1;
				System.out.println("299 X " + Qnt + "= " + T1);
				System.out.println("------------");
				break;

			case 2:
				System.out.println("Enter the Quantity of Item.");
				Qnt = sc.nextInt();
				T2 = 199 * Qnt;
				total = total + T2;
				System.out.println("199 X " + Qnt + "= " + T2);
				System.out.println("------------");
				break;

			case 3:
				System.out.println("Enter the Quantity of Item.");
				Qnt = sc.nextInt();
				T3 = 249 * Qnt;
				total = total + T3;
				System.out.println("249 X " + Qnt + "= " + T3);
				System.out.println("------------");
				break;

			case 4:
				System.out.println("Enter the Quantity of Item.");
				Qnt = sc.nextInt();
				T4 = 99 * Qnt;
				total = total + T4;
				System.out.println("99 X " + Qnt + "= " + T4);
				System.out.println("------------");
				break;

			case 5:
				System.out.println("Enter the Quantity of Item.");
				Qnt = sc.nextInt();
				T5 = 25 * Qnt;
				total = total + T5;
				System.out.println("25 X " + Qnt + "= " + T5);
				System.out.println("------------");
				break;

			case 6:
				System.out.println("Enter the Quantity of Item.");
				Qnt = sc.nextInt();
				T6 = 349 * Qnt;
				total = total + T6;
				System.out.println("349 X " + Qnt + "= " + T6);
				System.out.println("------------");
				break;

			case 7:
				System.out.println("===============");
				System.out.println("Total Billing amount.");
				System.out.println("Rs." + total);
				System.out.println("Thanking You...");
				System.out.println("===============");
				c = 10;

			}
		} while (c<9);

	}

}
