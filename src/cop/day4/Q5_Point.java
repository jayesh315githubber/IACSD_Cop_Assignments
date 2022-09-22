package cop.day4;

public class Q5_Point {

	private int x;
	private int y;
	
	public Q5_Point() {
		this.x = 4;
		this.y = 8;
	}

	public Q5_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {		
		System.out.println("X : "+x);
		System.out.println("Y : "+y);		
	}

}
