package cop.day4;

public class Q1_Student {

	private String studentName;
	private int rollno;
	private int marks1;
	private int marks2;
	private int marks3;

	private double total;
	private double percentage;
	private String grade;

	public Q1_Student(String studentName, int rollno, int marks1, int marks2, int marks3) {

		this.studentName = studentName;
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public double calculateTotal() {
		total = (double)(marks1 + marks2 + marks3);
		return total;
	}
	
	public double calculatePercentage() {
		percentage = (total / 3) ;
		return percentage;
	}

	public String calculateGrade() {
		
		if(percentage > 75) {
			//System.out.println("Grade A");
			return grade = "Grade A ";
		}
		else if(percentage <74 && percentage > 60) {
			//System.out.println("Grade B");
			return grade = "Grade B ";
		}
		else if(percentage > 59) {
			//System.out.println("Grade C");
			return grade = "Grade C ";
		}
		return grade;
	}

	public void display() {

		System.out.println("Student name     : "+ studentName);
		System.out.println("Roll Number      : "+ rollno);
		System.out.println("Total Marks      : "+ calculateTotal());
		System.out.printf("Total percentage  : %.2f", calculatePercentage());
		System.out.println();
		System.out.println("Grade            : "+ calculateGrade());
	}

}
