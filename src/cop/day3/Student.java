/*
 * 2:Write a program which will accept student information like rollno,name,5 subject marks.
 * calculate total and percentage.calculate grade.. 
           per >75 grade :A
           per<74 and >60 :B
           per<59  :C
 */
package cop.day3;

public class Student {

	int rollNo;
	String name;
	int english, science, math, chem, hist;
	
	float percentage;
	int extra ;

	Student(int rollNo, String name, int english, int science, int math, int chem, int hist ) {

		this.rollNo = rollNo;
		this.name = name;
		this.english = english;
		this.science = science;
		this.math = math;
		this.chem = chem;
		this.hist = hist;


	}
	
	public float calculatePercentage() {
		
		this.percentage = (english + science + math+ chem +hist ) / 5 ;
		
		return percentage ; 

	}
	
	public void calculateGrade() {
	
		if(percentage > 75) {
			System.out.println("Grade A");
		}
		else if(percentage <74 && percentage > 60) {
			System.out.println("Grade B");
		}
		else if(percentage > 59) {
			System.out.println("Grade C");
		}
		
	}
	

}
























