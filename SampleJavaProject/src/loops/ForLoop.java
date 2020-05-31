package loops;

public class ForLoop {

	// forloop
	// whileLoop
	// dowhileLoop
	// break
	// continye
	// nested loops
	// if else ladder
	// nested switch
	// ternary operator

	public static void main(String args[]) {

		Integer[] intArray = { 2, 3, 4, 5 };

		//// Traditional Approach //

		/*
		 * for(initialization; Boolean_expression; update) { // Statements }
		 */

		/*
		 * for (int i = 2; i <= intArray.length; i++) { System.err.println(i); }
		 */

		// for (int i= 0 ; i<=dropElements.size();i++ )

		// for(Type variable : list/Array)
		// for (WebElement ele1 : dropElements )

		// forEachLoops();
		nestedForLoop(intArray);
		nestedForEachLoop(intArray);

	}

	public static void nestedForLoop(Integer[] intArray) {

		for (int i = 0; i <= intArray.length; i++) {
			for (int j = 0; j <= intArray.length; j++) {
				if (i == j)
					System.out.println(i + " " + j);
			}

		}
	}

	public static void forEachLoops() {
		// list<WebElement> dropElements = driver.findElement(by."").....;
		// for(Type variable : list/Array)
		// for (WebElement ele1 : dropElements )

		// for (int i : intArray) {
		// System.err.println(i);
		//
		// }

		String s1 = "Testing";
		char[] cha1r = s1.toCharArray();

		for (char abc : cha1r) {
			if (abc == 'e' || abc == 'i')
				System.out.println(abc);
		}

		// Output e,i

	}

	public static void nestedForEachLoop(Integer[] intArray) {
		
		System.out.println("-----------------------------------");

		for (int i : intArray)
			for (int j : intArray) {
				if (i == j)
					System.out.println(i + " " + j);

			}

	}
}
