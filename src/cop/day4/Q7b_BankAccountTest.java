package cop.day4;

import java.util.Scanner;

public class Q7b_BankAccountTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Q7b_BankAccount bacArr[] = new Q7b_BankAccount[5000];
		int c = 0;
		int index = 0;

		do {

			System.out.println("1:Create Account \r\n" + "2:deposite \r\n" + "3:withdraw\r\n" + "4:Show All  \r\n"
					+ "5:search account \r\n" + "6:edit/update/modify name \r\n" + "7:get Balance for account \r\n"
					+ "8:money tranfser\r\n" + "9:exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the New Customer Account Details.");
				System.out.println("Enter the account holder name");
				String name = sc.next();
				System.out.println("Enter the account holder email");
				String email = sc.next();
				System.out.println("Enter the account holder mobile no.");
				String mobNo = sc.next();
				System.out.println("Enter the account Type(saving / current).");
				String accountType = sc.next();
				System.out.println("Enter the balance amount");
				double balance = sc.nextDouble();

				// System.out.println("Enter the " + (index + 1) + "customer details.");
				bacArr[index] = new Q7b_BankAccount(name, email, mobNo, balance,accountType);
				bacArr[index].showAllCustomersDetails();
				index++;

				break;

			case 2:

				System.out.println("Enter the Account Number Or Account Holder name by selecting following option.");
				System.out.println("\r\n" + "1. Account Number \r\n" + "2. Account Holder Name");

				int so2 = sc.nextInt();

				int ano2 = 0;
				String ana2 = null;
				if (so2 == 1) {
					System.out.println("Enter the Account Number.");
					ano2 = sc.nextInt();
				}
				if (so2 == 2) {
					System.out.println("Enter the Account Holder name.");
					ana2 = sc.next();
				}
				
				for (int i = 0; i < index; i++) {
					System.out.println("******"+bacArr[i].getACTNO());
					if (((bacArr[i].getAccountNo()) == ano2) || ((bacArr[i].getAccountHolderName()).equalsIgnoreCase(ana2))) {
						System.out.println("Enter the amount to be deposited.");
						int depositeAmt = sc.nextInt();
						bacArr[i].deposite(depositeAmt);
					}
				}
				break;

			case 3:

				System.out.println("Enter the Account Number Or Account Holder name by selecting following option.");
				System.out.println("\r\n" + "1. Account Number \r\n" + "2. Account Holder Name");

				int so3 = sc.nextInt();

				int ano3 = 0;
				String ana3 = null;
				if (so3 == 1) {
					System.out.println("Enter the Account Number.");
					ano3 = sc.nextInt();
				}
				if (so3 == 2) {
					System.out.println("Enter the Account Holder name.");
					ana3 = sc.next();
				}
				for (int i = 0; i < index; i++) {
					if (((bacArr[i].getAccountNo()) == ano3) || ((bacArr[i].getAccountHolderName()).equalsIgnoreCase(ana3))) {
						System.out.println("Enter the amount to be withdraw.");
						int withdrawAmt = sc.nextInt();
						bacArr[i].withdraw(withdrawAmt);
					}
				}
				break;

			case 4:

				System.out.println("All Bank Customers Details :");

				for (int i = 0; i < index; i++) {
					bacArr[i].showAllCustomersDetails();
				}

				break;

			case 5:

				System.out.println(
						"Enter the Account Number Or Account Holder name by selecting following option for seraching account details.");
				System.out.println("\r\n" + "1. Account Number \r\n" + "2. Account Holder Name");

				int so5 = sc.nextInt();

				int ano5 = 0;
				String ana5 = null;
				if (so5 == 1) {
					System.out.println("Enter the Account Number.");
					ano5 = sc.nextInt();
				}
				if (so5 == 2) {
					System.out.println("Enter the Account Holder name.");
					ana5 = sc.next();
				}
				for (int i = 0; i < index; i++) {
					if (((bacArr[i].getAccountNo()) == ano5) || ((bacArr[i].getAccountHolderName()).equalsIgnoreCase(ana5))) {

						bacArr[i].showAllCustomersDetails();
					}
				}
				break;

			case 6:

				System.out.println(
						"Enter the Account Number Or Account Holder name by selecting following option for Modify/update account details.");
				System.out.println("\r\n" + "1. Account Number \r\n" + "2. Account Holder Name");

				int so6 = sc.nextInt();

				int ano6 = 0;
				String ana6 = null;
				if (so6 == 1) {
					System.out.println("Enter the Account Number.");
					ano6 = sc.nextInt();
				}
				if (so6 == 2) {
					System.out.println("Enter the Account Holder name.");
					ana6 = sc.next();
				}

				for (int i = 0; i < index; i++) {
					if (((bacArr[i].getAccountNo()) == ano6) || ((bacArr[i].getAccountHolderName()).equalsIgnoreCase(ana6))) {

						System.out.println("Select the option to modify/update the customer detail.");
						System.out.println("1.Account Holder Name;\r\n" + "2.Email ID;\r\n" + "3.Mobile No;\r\n"
								+ "4.AccountType;");

						int mo6 = sc.nextInt();

						String mna6;
						String ae;
						String amn;
						String at;

						if (mo6 == 1) {
							System.out.println("Enter the Account Holder Name to update.");
							mna6 = sc.next();
							bacArr[i].setAccountHolderName(mna6);
							System.out.println(mna6 + " name is get updated.");

						}
						if (mo6 == 2) {
							System.out.println("Enter the Email Id to update .");
							ae = sc.next();
							bacArr[i].setEmail(ae);
							System.out.println(ae + " email id is get updated.");
						}
						if (mo6 == 3) {
							System.out.println("Enter the Mobile No to update .");
							amn = sc.next();
							bacArr[i].setMobileNo(amn);
							System.out.println(amn + " mobile no is get updated.");
						}
						if (mo6 == 4) {
							System.out.println("Enter the Account Type to change .");
							at = sc.next();
							bacArr[i].setAccountType(at);
							System.out.println(" Account Type is updated to " + at);
						}

						System.out.println("New Account Details :");
						bacArr[i].showAllCustomersDetails();
					}
				}
				break;

			case 7:

				System.out.println(
						"Enter the Account Number Or Account Holder name by selecting following option to know account balance.");
				System.out.println("\r\n" + "1. Account Number \r\n" + "2. Account Holder Name");

				int so7 = sc.nextInt();

				int ano7 = 0;
				String ana7 = null;
				if (so7 == 1) {
					System.out.println("Enter the Account Number.");
					ano7 = sc.nextInt();
				}
				if (so7 == 2) {
					System.out.println("Enter the Account Holder name.");
					ana7 = sc.next();
				}
				for (int i = 0; i < index; i++) {
					if (((bacArr[i].getAccountNo()) == ano7) || ((bacArr[i].getAccountHolderName()).equalsIgnoreCase(ana7))) {

						bacArr[i].knowYrBalance();
					}
				}

				break;

			case 8:

				System.out.println(
						"Enter the Account Number Or Account Holder name by selecting following option to know account balance.");
				System.out.println("\r\n" + "1. Account Number \r\n" + "2. Account Holder Name");

				int so8 = sc.nextInt();

				int ano8 = 0;
				String ana8 = null;

				if (so8 == 1) {
					System.out.println("Enter the Account Number of sender.");
					ano8 = sc.nextInt();
				}
				if (so8 == 2) {
					System.out.println("Enter the Account Holder name of sender.");
					ana8 = sc.next();
				}

				for (int i = 0; i < index; i++) {
					if (((bacArr[i].getAccountNo()) == ano8) || ((bacArr[i].getAccountHolderName()).equalsIgnoreCase(ana8))) {
						System.out.println("Enter the amount to transfer");
						int amountTransfer = sc.nextInt();


						System.out.println(
								"Enter the Account Number Or Account Holder name by selecting following option to know account balance.");
						System.out.println("\r\n" + "1. Account Number \r\n" + "2. Account Holder Name");

						int so8r = sc.nextInt();

						int ano8r = 0;
						String ana8r = null;

						if (so8r == 1) {
							System.out.println("Enter the Account Number of Reciever.");
							ano8r = sc.nextInt();
						}
						if (so8r == 2) {
							System.out.println("Enter the Account Holder name of Reciever.");
							ana8r = sc.next();
						}

						for (int j = 0; j < index; j++) {
							if (((bacArr[j].getAccountNo()) == ano8r) || ((bacArr[j].getAccountHolderName()).equalsIgnoreCase(ana8r))) {
								bacArr[i].moneyTransfer(amountTransfer, bacArr[j]);
							}
						}
					}

				}

				break;

			case 9:
				System.out.println("Thanking You For Banking With Us.");
				c = 11;
				break;

			default:
				System.out.println("Invalid Option, Please select correct Option");
				break;
			}

		} while (c < 10);

	}

}
