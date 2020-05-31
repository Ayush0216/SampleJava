package loops;

public class ContinueAndBreak {

	public static void main(String[] args) {
		Integer[] intArray = { 2, 3, 4 };

		Integer[] intArray2 = { 67, 78, 57 };

		// breakCheck(intArray);
		// continueCheck(intArray);
		labeledBbreakCheck(intArray, intArray2);
	}

	public static void breakCheck(Integer[] intArray) {

		// It terminates the loop condition satisfied

		System.out.println("-----------------------------------");

		for (int i : intArray) {
			for (int j : intArray) {
				if (i == j)
					System.out.println(i + " " + j);
			}
			if (i == 3)
				break;
		}

		// Three dropdowns == Alpha, Beta , Gama
		// list<WebElement> dropElements =
		// driver.findElement(by."dropelements").....;
		// for (WebElement ele1 : dropElements ){
		// if(ele1.getText().equals("Alpha"))
		// ele1.click();
		// break;
		// }

	}

	public static void continueCheck(Integer[] intArray) {
		// It skips the loop for particular iteration if condition satisfied
		for (int i : intArray) {
			if ((i == 3))
				continue;
			System.out.println(i);
		}

	}

	public static void labeledBbreakCheck(Integer[] intArray, Integer[] intArray2) {

		System.out.println("-----------------------------------");
		outer: for (int i : intArray) {
			inner: for (int j : intArray2) {
				if (i == 3)
					break inner;
				System.out.println(i + " " + j);
			}

		}
	}
}
