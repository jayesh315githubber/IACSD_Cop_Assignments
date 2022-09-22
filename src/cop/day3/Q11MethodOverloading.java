package cop.day3;

/*
 * 11:Create application for method overloading
 */

public class Q11MethodOverloading {

	public static void main(String[] args) {

		addition(2, 3);

		addition(4, 5, 6);

		addition(7, 8, 6, 5);
		
		addition(1,2,3,4,5,6,7,8,9);

	}

	public static void addition(int i, int j, int k, int l) {
		int addtionResult = i + j + k + l;
		System.out.println("Addition of four number is : " + addtionResult);
	}

	public static void addition(int i, int j, int k) {
		int addtionResult = i + j + k;
		System.out.println("Addition of three number is : " + addtionResult);
	}

	public static void addition(int i, int j) {
		int addtionResult = i + j;
		System.out.println("Addition of two number is : " + addtionResult);
	}

	public static void addition(int... a) {

		int addtionResult = 0;

		int n = 0;
		for (int i : a) {
			n++;
			addtionResult = addtionResult + i;

		}

		System.out.println("Addition of " + n + " number is : " + addtionResult);
	}

}
