package cop.day4;

import java.util.Scanner;

public class Q7Account {
	
	

	private int accountNo;
	private String accountHolderName;
	private String email;
	private String mobileNo;
	private double balance;
	private static int ACTNO = 1001;

	public Q7Account() {

		this.accountNo = ACTNO ;
		this.accountHolderName = "Suraj";
		this.balance = 5000;
		this.email = "abc@gmail.com";
		this.mobileNo = "0123456789";
	}

	public Q7Account( String accountHolderName, String email, String mobNo, double balance) {

		this.accountNo = ACTNO;
		this.accountHolderName = accountHolderName;
		this.email = email;
		this.mobileNo = mobNo;
		this.balance = balance;
		ACTNO++ ;
	}

	public void accountDetailByAccNo(Q7Account arr[], int accountNo, int index) {

//		for (Account account : arr) {

//			if (account.accountNo == accountNo) {
//				System.out.println(account.accountNo);
//				System.out.println(account.accountHolderName);
//				System.out.println(account.email);
//				System.out.println(account.mobileNo);
//				System.out.println(account.balance);
//			}
//		}
		
		for (int i = 0; i < index; i++) {
			if(arr[i].accountNo == accountNo) {
				System.out.println(arr[i].accountNo);
				System.out.println(arr[i].accountHolderName);
				System.out.println(arr[i].email);
				System.out.println(arr[i].mobileNo);
				System.out.println(arr[i].balance);
			}
		}
	}

	public void accountDetailByAccName(Q7Account arr[], String accountHolderName, int index) {

//		for (Account account : arr) {
//
//			if (account.accountHolderName.equalsIgnoreCase(accountHolderName)) {
//				System.out.println(account.accountNo);
//				System.out.println(account.accountHolderName);
//				System.out.println(account.email);
//				System.out.println(account.mobileNo);
//				System.out.println(account.balance);
//			}
//		}
		
		for (int i = 0; i < index; i++) {
			if(arr[i].accountHolderName.equalsIgnoreCase(accountHolderName)) {
				System.out.println(arr[i].accountNo);
				System.out.println(arr[i].accountHolderName);
				System.out.println(arr[i].email);
				System.out.println(arr[i].mobileNo);
				System.out.println(arr[i].balance);
			}
		}

	}

	public void moneyDeposit(Q7Account arr[], double deposotAmount, int index) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number.");
		int actNo = sc.nextInt();

//		for (Account account : arr) {
//
//			if (account.accountNo == actNo) {
//				account.balance = account.balance + deposotAmount;
//			}
//		}

		for (int i = 0; i < index; i++) {
             
			if(arr[i].accountNo == actNo) {
				arr[i].balance = arr[i].balance + deposotAmount ;
			}
		}

	}

	public void withdrawAmt(Q7Account arr[], double amount, int index) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number.");
		int actNo = sc.nextInt();

//		for (Account account : arr) {
//
//			if (account.accountNo == actNo) {
//				account.balance = account.balance - amount;
//			}
//		}
		
		for (int i = 0; i < index; i++) {
            
			if(arr[i].accountNo == actNo) {
				arr[i].balance = arr[i].balance - amount ;
			}
		}

	}

	public void showAllCustomerDetail(Q7Account arr[], int index) {

//		for (Account account : arr) {
//			System.out.println("--------------------------------");
//			System.out.println(account.accountNo);
//			System.out.println(account.accountHolderName);
//			System.out.println(account.email);
//			System.out.println(account.mobileNo);
//			System.out.println(account.balance);
//			System.out.println("--------------------------------");
//
//		}
		
		for (int i = 0; i < index; i++) {
			
			System.out.println("--------------------------------");
			System.out.println(arr[i].accountNo);
			System.out.println(arr[i].accountHolderName);
			System.out.println(arr[i].email);
			System.out.println(arr[i].mobileNo);
			System.out.println(arr[i].balance);
			System.out.println("--------------------------------");
		}


	}
}
