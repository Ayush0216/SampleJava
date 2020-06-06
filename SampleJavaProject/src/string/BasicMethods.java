package string;

public class BasicMethods {

	public static void main(String[] args) {

		String s1 = "Testing";
		String s6 = "Testing";
		String s2 = "testing";
		String s3 = "test";
		String s4 = new String("Testing");
		String s5 = new String("testing");

		// Comparison
		/*
		 * // == System.out.println(s1 == s2); System.out.println(s1 == s3);
		 * System.out.println(s1 == s4);// All False System.out.println(s3 ==
		 * s4); System.out.println(s5 == s4); System.out.println(s1 == s6);
		 */

		/*
		 * System.out.println(s1.equals(s4)); // true
		 * System.out.println(s1.equals(s2)); //false
		 * System.out.println(s1.equalsIgnoreCase(s2)); // true
		 */

		// compareto
		String s8 = "estingTirujrnn";
		String s7 = "estingRwewewewe";

		// PQRST
		/*System.out.println(s8.compareTo(s7)); // 1
		System.out.println(s7.compareTo(s8)); // -1
		System.out.println(s8.compareTo(s1)); // -1
*/
		String o1 = "This is my code";
		String o2 = "This,is,my,code,in,java";

		String[] splitValues = o1.split(" ");
		String[] splitValues2 = o2.split(",");

		//System.out.println(splitValues2[5]);

		String url = "htpps:/www.test.com/myclass/mycategory.html";

		String[] urlValues = url.split("/");

		/*for (String str : urlValues)
			System.out.println(str);

		/// verify the last parameter in the url contains mycategory

		System.out.println(urlValues.length);
		if (urlValues[urlValues.length-1].contains("mycategory"))
			System.out.println("yes");
		*/
		
		String url2 = "htpps:/www.test.com/myclass/mycategory.html/d/f/f/fs/fs/s/ed/w/w";
		String[] urlValues2 = url2.split("/",5);
		
		for (String str : urlValues2)
			System.out.println(str);
		
		
	}
}
