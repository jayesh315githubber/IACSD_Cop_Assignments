package cop.day4;

public class Q6ComplexNumber {

	private int real;
	private int imaginary;
	private int resultReal;
	private int resultImaginary;

	public Q6ComplexNumber() {

		this.real = 2;
		this.imaginary = 3;
	}

	public Q6ComplexNumber(int real, int imaginary) {

		this.real = real;
		this.imaginary = imaginary;
	}

	public int getReal() {
		return real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public int getResultReal() {
		return resultReal;
	}

	public int getResultImaginary() {
		return resultImaginary;
	}

	public void setResultReal(int resultReal) {
		this.resultReal = resultReal;
	}

	public void setResultImaginary(int resultImaginary) {
		this.resultImaginary = resultImaginary;
	}

	public void additionOfComplexNo(Q6ComplexNumber cn1, Q6ComplexNumber cn2) {

		resultReal = cn1.getReal() + cn2.getReal();

		resultImaginary = cn1.getImaginary() + cn2.getImaginary();

		System.out.println(getResultReal() + " + " + getResultImaginary() + "i");
	}

	public void display() {
		System.out.println(getReal() + " + " + getImaginary() + "i");
	}

}
