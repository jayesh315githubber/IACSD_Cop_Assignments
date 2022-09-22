package cop.day4;

public class Q7b_BankAccount {

	private int accountNo;
	private String accountHolderName;
	private String email;
	private String mobileNo;
	private double balance;
	private String accountType;
	private static int ACTNO;
	private static int ACTNOCounter;

	static {
		ACTNO = 1001;
	}

	public Q7b_BankAccount() {

		this.accountNo = ACTNO;
		this.accountHolderName = "Suraj";
		this.balance = 5000;
		this.email = "abc@gmail.com";
		this.mobileNo = "0123456789";
		ACTNO ++ ;
		ACTNOCounter++;
	}

	public Q7b_BankAccount(String accountHolderName, String email, String mobNo, double balance, String accountType) {

		this.accountNo = ACTNO;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.email = email;
		this.mobileNo = mobNo ;
		this.accountType = accountType;
		ACTNO ++ ;
		ACTNOCounter++;
	}

	public static int getACTNO() {
		return ACTNO;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getEmail() {
		return email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void deposite(int depositeAmt) {
		this.balance = this.balance + depositeAmt;
		System.out.println(depositeAmt+ " amount is deposited.");
		System.out.println("Totol Balance : "+this.balance);
	} 
	
	public void withdraw(int withdrawAmt) {
		this.balance = this.balance - withdrawAmt ;
		System.out.println(withdrawAmt+ " amount is withdraw from account.");
		System.out.println("Totol Balance : "+this.balance);
	}
	
	public void showAllCustomersDetails() {
				
			System.out.println("Account Number          : "+accountNo);
			System.out.println("Account Holder Name     : "+ accountHolderName);
			System.out.println("Account Holder Email id : "+ email);
			System.out.println("Account Holder Mobile No: "+ mobileNo);
			System.out.println("Account Type            : "+ accountType);
			System.out.println("Total Account Balance   : "+ balance);
		
	}
	
	public void knowYrBalance() {
		System.out.println("Total Account Balance   : "+ balance);
	}
	
	public void moneyTransfer(int amountTransfer, Q7b_BankAccount reciverAct) {
		
     this.balance = this.balance - amountTransfer;
		
     reciverAct.balance = reciverAct.balance + amountTransfer;
     System.out.println(amountTransfer + " is transfer from account no"+this.accountNo+"to account no "+reciverAct.getACTNO());
		
	}
	
	
	
	

}
