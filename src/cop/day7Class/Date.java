//1:Create Date class with members day,month ,year.
//Write no argument and parameterised constructor .
//Create two objects and initialize them using no argument and parameterised constructor
//respectively.Print date using display function.
package cop.day7Class;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date() {
		this.day = 01;
		this.month = 01;
		this.year = 2001;
	}

	public Date(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String displayDate() {
		
//		System.out.println("Date is: "+getDay());
//		System.out.println("Month is: "+getMonth());
//		System.out.println("Year is: "+getYear());
		
		return this.day+"/"+this.month+"/"+this.year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
