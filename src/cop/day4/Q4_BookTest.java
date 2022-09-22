package cop.day4;

public class Q4_BookTest {
	
	public static void main(String[] args) {
		
		
		System.out.println("***** Using Default Constructor ******");
		Q4_Book b = new Q4_Book();
		b.display();
		
		System.out.println();
		System.out.println("***** Using Parameterize Constuctor ******");
		Q4_Book b1 = new Q4_Book("THE GREAT INDIAN NOVEL",14, "SHASHI THAROOR",499);
		b1.display();
		
		System.out.println();
		System.out.println("***** Using Getter and Setter  ******");
		b1.setAuthor("Shashi Tharoor");
		b1.setPrice(399);
		b1.display();
		
		
		
		
	}

}
