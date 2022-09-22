package cop.day4;

public class Q3_Data {

	private int dd;
	private int mm;
	private int yy;

	public Q3_Data() {
		this.dd = 11;
		this.mm = 12;
		this.yy = 1999;
	}

	public Q3_Data(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public void display() {
		System.out.println(dd+"-"+mm+"-"+yy);
	}

}
