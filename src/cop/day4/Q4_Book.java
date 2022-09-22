package cop.day4;

public class Q4_Book {

	private String bname;
	private int id;
	private String author;
	private double price;
	
	public Q4_Book() {
		this.bname = "Wings of Fire";
		this.id = 11;
		this.author = "Dr. A P J Abdul Kalam";
		this.price = 140;
	}

	public Q4_Book(String bname, int id, String author, double price) {
		this.bname = bname;
		this.id = id;
		this.author = author;
		this.price = price;
	}

	public String getBname() {
		return bname;
	}

	public int getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Book ID    : " + getId());
		System.out.println("Book Name  : " + getBname());
		System.out.println("Book Author: " + getAuthor());
		System.out.println("Book Price : " + getPrice());
	}

}
