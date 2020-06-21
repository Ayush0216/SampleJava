package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listexample {
	static List<String> alist;
	static ArrayList<String> alist2;

	public static void main(String[] args) {

		// list<T> name = new Arraylist<T>();
		// WebDriver driver = new Chromedriver();
		// Chromedriver driver = new Chromedriver();

		// List<String> alist = new List<String>(); // wrong- List is Interface

		alist = new ArrayList<String>();
		alist2 = new ArrayList<String>();

		// addtolist();
		// addtolistwithOtherList();

		System.out.println(alist);
		System.out.println(alist2);

		System.out.println(alist.size());
		System.out.println(alist2.size());

		// clearList();
		// readingArrayList();

		System.out.println("------------------------------------------");

		generalFunctions();
	}

	public static void addtolist() {
		alist.add("Test1");
		alist.add("Test2");
		alist.add("Test3");
		alist.add("Test4");
		alist.add(2, "TestOverride3");

		alist2.add("Arr1");
		alist2.add("Arr2");
		alist2.add("Arr3");

	}

	public static void addtolistwithOtherList() {
		alist.add("Test1");
		alist.add("Test2");
		alist.add("Test3");
		alist.add("Test4");
		alist.add(2, "TestOverride3");

		alist2.add("Arr1");
		alist2.add("Arr2");
		alist2.add("Arr3");

		alist.addAll(alist2);

	}

	public static void clearList() {
		alist.clear();
		System.out.println("After clear: " + alist.size());
		System.out.println(alist);

	}

	public static void readingArrayList() {
		alist.add("Test1");
		alist.add("Test2");
		alist.add("Test3");
		alist.add("Test4");
		alist.add(2, "TestOverride3");

		// for loop
		System.out.println("-----------Using For Loop");
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}

		// Advanced for loop
		System.out.println("-----------Using Advanced For Loop");
		for (String a : alist)
			System.out.println(a);

		// Using Iterator
		System.out.println("-----------Using Iterator"); // It can move only
															// forward
		Iterator<String> ait = alist.iterator();
		while (ait.hasNext())
			System.out.println(ait.next());

		// Using ListIterator
		System.out.println("-----------Using  List Iterator"); // It can move in
																// either
																// direction
		ListIterator<String> lit = alist.listIterator();
		while (lit.hasNext())
			System.out.println(lit.next());

		System.out.println("-----------Reversing");
		while (lit.hasPrevious())
			System.out.println(lit.previous());

	}

	public static void generalFunctions() {
		alist.add("Test1");
		alist.add("Test2");
		alist.add("Test3");
		alist.add("Test4");
		alist.add("Test5");

		alist2.add("Arr1");
		alist2.add("Arr2");
		alist2.add("Arr3");
		alist2.add("Test5");
		alist2.add("Test4");

		alist.remove(2); // this will remove test3
		alist.remove("Test32"); // this will not do anything as test32 dows not
								// exist
		// alist.remove(7); // this will give error

		System.out.println(alist);
		int i = 3;

		System.out.println(alist.contains("Test1"));
		System.out.println(alist.contains("Test100"));

		System.out.println("After Reatin All");
		alist.retainAll(alist2);
		System.out.println(alist);

		alist.add("Test209");
		alist.add("Test101");
		alist.add("Test102");
		alist.add("ATest105");

		System.out.println(alist);

		Collections.sort(alist);		

		System.out.println("------------After Sorting");
		System.out.println(alist);

	}

}
