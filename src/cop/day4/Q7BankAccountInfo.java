package cop.day4;

import java.util.Scanner;

public class Q7BankAccountInfo {
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Q7Account actArr[] = new Q7Account[5000];
		int c = 0;
		int index = 0;
		

		do {

			System.out.println("1. Add a Account \r\n" + "2. Money Deposit\r\n" + "3. Withdraw amount\r\n"
					+ "4. Search Account detail by account no \r\n" + "5. Search Account detail by account name\r\n"
					+ "6. show All customer Detail\r\n" + "7. Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:

//				System.out.println("Enter the account no");
//				int actNo = sc.nextInt();
				System.out.println("Enter the account holder name");
				String name = sc.next();
				System.out.println("Enter the account holder email");
				String email = sc.next();
				System.out.println("Enter the account holder mobile no.");
				String mobNo = sc.next();
				System.out.println("Enter the account amount");
				double balance = sc.nextDouble();

				System.out.println("Enter the " + (index + 1) + "customer details.");
				actArr[index] = new Q7Account( name, email, mobNo, balance);
				index++;

				break;

			case 2:
				System.out.println("value of index : " + index);
				System.out.println("Enter the total deposit amount.");
				double amt = sc.nextDouble();

				for (int i = 0; i < index; i++) {
					actArr[i].moneyDeposit(actArr, amt, index);
				}

				break;

			case 3:
				System.out.println("Enter the withdraw amount.");
				double wamt = sc.nextDouble();

				for (int i = 0; i < index; i++) {
					actArr[i].withdrawAmt(actArr, wamt, index);
				}

				break;

			case 4:
				System.out.println("Enter the account no to see the details");
				Scanner sc1 = new Scanner(System.in);
				int accountNo = sc.nextInt();

				for (int i = 0; i <index; i++) {
					actArr[i].accountDetailByAccNo(actArr, accountNo, index);
				}
				break;

			case 5:
				System.out.println("Enter the account holder name to see the details");
				Scanner sc2 = new Scanner(System.in);
				String accountName = sc.next();

				for (int i = 0; i <index; i++) {
					actArr[i].accountDetailByAccName(actArr, accountName, index);
				}
				break;

			case 6:

				for (int i = 0; i < index; i++) {
					actArr[i].showAllCustomerDetail(actArr, index);
				}
				break;

			case 7:
				System.out.println("------end------");
				c = 10;
				break;
			default:
				break;

			}

		} while (c < 7);

	}

}
