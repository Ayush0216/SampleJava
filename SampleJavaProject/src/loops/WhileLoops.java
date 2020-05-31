package loops;

public class WhileLoops {

	public static void main(String args[]) {

		Integer[] intArray = { 2, 3, 4, 5 };

		/*
		 * syntax while(Boolean_expression) { // Statements }
		 */

		whileLoop();
		dowhileLoop();

	}

	public static void whileLoop() {
		
		/*
		 * syntax while(Boolean_expression) { // Statements }
		 */

		System.out.println("In While Loop");
		int i = 1;
		while (i < 1) {
			System.out.println(i);
			i++;
		}

	}

	public static void dowhileLoop() {
		
		/*
		 * do { // Statements }while(Boolean_expression);
		 */
		System.out.println("In Do While Loop");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 1);
	}

	// Design a function to wait for an element to be invisible to continue
	// execution
}
