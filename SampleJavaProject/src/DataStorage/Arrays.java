package DataStorage;

public class Arrays {

	// Syntax of 1 Dimensional array
	/*
	 * type var-name[]; OR type[] var-name;
	 */

	// Declaration

	static int[] arr1;
	static int arr2[];
	static boolean arr3[];

	public static void main(String[] args) {

		// Instantiation 1
		arr1 = new int[5]; // - - - - - Empty array to hold 5 values
		arr3 = new boolean[3];

		// Array index starts from 0
		arr1[0] = 65;
		arr1[1] = 34;

		// arr1[2] = "String"; //wrong - storing wrong data type

		// Instantiation 2
		arr2 = new int[] { 1, 2, 3, 99, 5 }; // Array declared & instantiated
												// with 5 values

		// arr1[5]= 56; //wrong - ArrayIndexOutOfBoundsException
		// arr1[6]= 56; //wrong - ArrayIndexOutOfBoundsException

		initiateArr1();

	}

	public static void initiateArr() {
		for (int a : arr1)
			System.out.println("value of arr1:" + a);

		for (int a : arr2)
			System.out.println("value or arr2:" + a);

		for (boolean a : arr3)
			System.out.println("Bool value:" + a);

	}

	public static void initiateArr1() {

		for (int i = 0; i < arr2.length; i++) { // array.length gives actual
												// size, here = 5
			arr2[i] = i * 2 + 10;
		}

		for (int a : arr2)
			System.out.println("value or arr2:" + a);
	}

}
