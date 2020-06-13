package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) throws Exception {
		// trycatch();

		/*
		 * throwException("Test"); throwException("Rest");
		 */

		trywithFinally();
	}

	public void io1() {
		File file = new File("");

	}

	public static void trycatch() {
		int a = 5;
		int b = 0;
		int[] ff = { 1, 2, 3 };
		try {
			int gg = ff[2];
			System.out.println("value is " + gg);// throws excption
			int dd = b / 0;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void trymultiplecatch() {
		int a = 5;
		int b = 0;
		int[] ff = { 1, 2, 3 };

		try {
			int gg = ff[2];
			System.out.println("value is " + gg);// throws excption
			int dd = b / 1;

		} catch (ArithmeticException e) {
			System.out.println("U r divinding by zero");
			System.out.println(e.getMessage());
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("wrong index provided");
		} catch (NullPointerException e) {
			System.out.println("U r divinding by zero");
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			throw new RuntimeException("Throwing test Exception");
		}

	}

	public static void nestedtryeatch() {
		int a = 5;
		int b = 0;
		int d = 0;

		try {
			int c = a / b;

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("In catch block 1");

			try {
				System.out.println("Inside second try");
				int f = a / 1;
				System.out.println(f);
			} catch (ArithmeticException ee) {
				System.out.println("In exception block 2");
				System.out.println(ee.getMessage());

			}
		}

	}

	// throw and throws

	public static void throwException(String name) {

		if (name.equalsIgnoreCase("test"))
			System.out.println("String pass");
		// else
		// Thread.sleep(1000);
		// throw new Exception("String is not equal to test");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("B:/myfile.txt");
			fis.read();
		} catch (IOException | ArithmeticException e) {
			e.printStackTrace();
		}

	}

	// Finally
	public static void trywithFinally() {
		int b = 0;
		int[] ff = { 1, 2, 3 };
		try {
			int gg = ff[2];
			System.out.println("value is " + gg);// throws excption
			// int dd = b / 0;

		} catch (Exception e) {
			System.out.println("In catch block " + e.getMessage());

		}

		finally {
			System.out.println("Finally is  always executed");
		}

	}
}
