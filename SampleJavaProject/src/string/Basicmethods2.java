package string;

public class Basicmethods2 {

	public static void main(String[] args) {

		String s1 = "this is the is 1st";
		// 0
		// System.out.println(s1.indexOf("is")); // 2
		/*
		 * System.out.println(s1.indexOf("he")); // 9
		 * System.out.println(s1.indexOf("the")); // 8
		 */
		//
		// System.out.println(s1.lastIndexOf("is")); // 12

		// System.out.println(s1.indexOf("is" ,6));

		String s2 = s1.substring(8);
		String s3 = s1.substring(8, 14); // the is

		/*
		 * System.out.println(s2); System.out.println(s3);
		 */

		// System.out.println(s1.substring(s1.indexOf("the"),
		// s1.indexOf("the")+5));

		String s5 = "this is the is 1st";

		System.out.println(s5.substring(0, 3));

		String s6 = "20200606090857"; // yyyymmddHHMMSS
		
	System.out.println("The hour is:"+s6.substring(8,10)+"  , "+ " And minute is:"+s6.substring(10,12) );

	}

}
