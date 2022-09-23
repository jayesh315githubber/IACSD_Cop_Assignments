package cop.day7Class;

public class Payroll {

	private static int empId;
	private String empName;
	private double basicSalary;
	private double hRA;
	private static double Medical;
	private double pF;
	private static double pT;
	private double netSalary;
	private double grossSalary;

	public Payroll(String empName, double basicSalary) {
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	static {
		empId = 220901;
		Medical = 1000;
		pT = 200;
	}

	private void hraCalcu() {
		this.hRA = this.basicSalary * 0.5;

	}

	private void pfCalcu() {
		this.hRA = this.basicSalary * 0.12;

	}

	private double grossSalCal() {
		this.grossSalary = (this.basicSalary + this.hRA + Medical);
		return this.grossSalary;
	}

	private double netSalCal() {
		this.netSalary = this.grossSalary - (this.pF + pT);
		return this.netSalary;
		}
	
	public void displayDetails() {
		System.out.println("Employee Detail of ABC.INC");
		System.out.println("Employee Id           : "+this.empId);
		System.out.println("Employee Name         : "+this.empName);
		System.out.println("Employee Basic Salary : "+this.basicSalary);
		System.out.println("Employee Gross Salary : "+grossSalCal());
		System.out.println("Employee Net Salary   : "+netSalCal());
	
	}

}
