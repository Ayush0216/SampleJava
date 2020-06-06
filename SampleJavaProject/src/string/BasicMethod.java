package string;

public class BasicMethod {

	public static void main(String[] args) {

		// replace & replaceAll
		String o2 = "This,is,my,code,in,java";

		System.out.println(o2.replace(",", "*"));

		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.dir").replace("\\", "/"));

		// to small case and to upper case
		String small = "testJava";
		String upper = "TESTINGtesting";

		System.out.println(small.toUpperCase());
		System.out.println(upper.toLowerCase());

		//div[@id="New Arrivals"]
		//div[@id="New arrivals" , TRANSLATE("ABCDEFGH","abcdefgh")]
		
		
		
	}
}
