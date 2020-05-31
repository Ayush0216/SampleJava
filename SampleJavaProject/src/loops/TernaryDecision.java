package loops;

public class TernaryDecision {

	public static void main(String[] args) {

		int i = 1;
		int j = 2;

		int evaluate;
		evaluate = 1;
		String result;

		/*
		 * if (evaluate == 1) result = "Pass"; else result = "Fail";
		 */

		//syntax
		//variable = (expression) ? expressionTrue : expressinFalse;
		
		result = evaluate == 1 ? "Pass" : "Fail";
		
		System.out.println(result);
	}

}
