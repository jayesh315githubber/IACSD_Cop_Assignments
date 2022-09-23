//2:Create Employee class with members id(int),name(string),dob(Date).Use above created Date class.
//Write default and parameterised constructor in Employee Class.
//Write accept() function to accept information and display() to display emp information.
package cop.day7Class;

import java.util.Scanner;

public class Employee extends Date{
	
	//Date date = new Date();
	
	private int empID;
	private String empName;
	private Date dob;
	private int day;
	private int month;
	private int year;
	
	/*
	 * default super() constructor will automatically called 
	 * If we want to call the parameterize constructor of base class then we can use parameterized super constructor 
	 */
	
	public Employee() {
		//super();  
		this.empID = 101;
		this.empName = "Suraj";
		//this.dob = date;
	}
	
	public Employee(int empID, String empName,int d,int m,int y) 
	{
//		super(d,m,y);
		this.empID = empID;
		this.empName = empName;
		
	}
	
	public Employee(int empID, String empName, Date date) 
	{
//		super(d,m,y);
		this.empID = empID;
		this.empName = empName;
		
	}

	public int getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public Date getDob() {
		return dob;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
//	public void acceptInfo() {
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println("Enter the EMP ID");
//		this.empID = sc.nextInt();
//		
//		System.out.println("Enter the EMP Name");
//		this.empName = sc.next();
//		
//		System.out.println("Enter the EMP Day , month, year");
//		int d = sc.nextInt();
//		date.setDay(d);
//		 
//		 int m = sc.nextInt();
//		 dob.setMonth(m);
//		 
//		 int y = sc.nextInt();
//		 dob.setYear(y);
//				
//	}
	
	
	public void dislayInfo() {
		System.out.println("Emp ID : "+getEmpID());
		System.out.println("Emp name : "+getEmpName());
		System.out.println("Emp dob : "+displayDate());
		
	}
	
	
	

}
