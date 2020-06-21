package DataStorage;

public class Arrays2D {

	// Syntax of Multidimensional Dimensional array
	/*
	 * type var-name[][]; OR type[][] var-name;
	 */

	static int[][] arr1;
	static int arr2[][];
	static boolean arr3[][];
	static int[][] arr4;

	public static void main(String[] args) {

		arr1 = new int[2][5]; // - - - - - Empty array to hold 5 values
		arr4 = new int[3][]; // - - - - - Empty array to hold 5 values

		arr2 = new int[][] { { 11, 12, 13, 14, 15 }, { 6, 9, 7, 5, 4 } };

		// 0 1 2 3 4
		// 0 -- 11 12 13 14 15
		// 1 -- 6 9 7 5 4

	//	System.out.println(arr2[1][2]);
	//	System.out.println(arr2[0][3]);
		
		//System.out.println(arr1.length);
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(arr2[i][j] + " ");
			System.out.println();

		}

	}
}
