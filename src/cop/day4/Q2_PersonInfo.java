package cop.day4;

public class Q2_PersonInfo {
	
	public static void main(String[] args) {
		
		
		System.out.println("***** Using Default Constuctor *****");
		Q2_Person per = new Q2_Person();
		per.display();
		
		System.out.println();
		
		System.out.println("***** Using Parameterized Constuctor *****");
		Q2_Person per1 = new Q2_Person("Sager", 24, "Nagpur");
		per1.display();
		
		
		
		
	}

}
