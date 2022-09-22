package cop.day4;

public class Q3_DataTest {
	
	
	public static void main(String[] args) {
		
		System.out.println("***** Using Default Constructor ******");
		Q3_Data d = new Q3_Data();
		d.display();
		
		System.out.println();
		
		System.out.println("***** Using Parameterize Constuctor ******");
		Q3_Data d1 = new Q3_Data(21, 05, 1988);
		d1.display();
		
		
		System.out.println("***** Using Getter and Setter  ******");
		d1.setYy(1996);
		d1.setMm(8);
		d1.display();
		
	}

}
