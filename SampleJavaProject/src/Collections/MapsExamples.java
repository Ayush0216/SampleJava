package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExamples {
	static Map<Integer, String> map3;
	static Map<String, Integer> mapsi4;
	static Map<String, String> mapss5;
	static int x;

	public static void main(String[] args) {
		/*
		 * Three kinds of maps Hashmap ,LinkedHashmap, TreeMap
		 */

		/*
		 * Map Interface Sorted Map Inteface
		 */

		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();

		// commonFunct();
		// commonFunct1();
		// commonFunct2();

		commonFunct3();
	}

	public void cretateMap() {

		Map<Integer, String> map4; // When required to initialize map on runtime
		HashMap map356 = new HashMap<Integer, String>(); // When sure of the
															// kind of Map

		if (x == 0) {
			map3 = new HashMap<Integer, String>();
		}

		else if (x == 1) {
			map3 = new LinkedHashMap<Integer, String>();
		}
	}

	public static void commonFunct() {
		map3 = new HashMap<Integer, String>();
		mapsi4 = new HashMap<String, Integer>();
		mapss5 = new HashMap<String, String>();

		map3.put(1, "TestMap1");
		map3.put(2, "TestMap2");
		map3.put(3, "TestMap3");
		map3.put(4, "TestMap4");

		map3.put(2, "TestMap2override"); // overriding

		map3.putIfAbsent(100, "TestMap100create");
		map3.putIfAbsent(3, "TestMap3override");

		map3.putIfAbsent(1000102494, "TestMap100create");

		for (Map.Entry m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		mapsi4.put("Test1", 1000);

		mapss5.put("Test1Key", "Test1Value");

		mapsi4.put("Testproduct1", 3);
		mapsi4.put("Testproduct2", 4);
		// we go to bag page,, and modify quantity of product 2

		for (Map.Entry m : mapsi4.entrySet()) {
			if (m.getKey() == "Testproduct2")
				mapsi4.put("Testproduct2", Integer.parseInt(m.getValue().toString()) + 2);

			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	public static void commonFunct1() {
		map3 = new HashMap<Integer, String>();
		mapsi4 = new HashMap<String, Integer>();
		mapss5 = new HashMap<String, String>();

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();

		map3.put(1, "TestMap1");
		map3.put(2, "TestMap2");
		map3.put(3, "TestMap3");
		map3.put(4, "TestMap4");

		System.out.println(map3.get(4));
		/*
		 * System.out.println(map3.get(9)); System.out.println(mapsi4.get(9));
		 * System.out.println(mapss5.get(9));
		 */

		map3.remove(2); // checks only key match , not value
		map3.remove(3, "TestMap2"); // checks both key and value to match

		for (Map.Entry m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map4.putAll(map3);
		System.out.println("------------------------Map 4---------");

		for (Map.Entry m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	public static void commonFunct2() {
		map3 = new HashMap<Integer, String>();
		mapsi4 = new HashMap<String, Integer>();
		mapss5 = new HashMap<String, String>();

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();

		map3.put(1, "TestMap1");
		map3.put(3, "TestMap3");
		map3.put(4, "TestMap4");

		System.out.println("----Initial Map -------"); ///

		for (Map.Entry m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		/*
		 * System.out.println(map3.containsKey(2)); // true
		 * System.out.println(map3.containsKey(3)); // true
		 * System.out.println(map3.containsKey(700)); // False
		 * 
		 * System.out.println(map3.containsValue("TestMap1")); // true
		 * System.out.println(map3.containsValue("TestMap100")); // False
		 * System.out.println(map3.containsValue("TestMap2")); // true
		 */

		// get the entry with key = 2
		// if Key exist , gets its value and append it with 5000
		// if Key does not exist , create a value with 3000

		System.out.println("----First Run -------"); ///
		if (map3.containsKey(2)) // False
			map3.put(2, map3.get(2) + "5000"); // this will not execute
		else
			map3.put(2, "Test 3000"); // this will create an entry with key =2

		for (Map.Entry m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("----Second  Run -------"); //

		if (map3.containsKey(2)) // true
			map3.put(2, map3.get(2) + " 5000"); // "Test 3000" + "5000" = Test
												// 30005000

		else
			map3.put(2, "Test 3000");

		for (Map.Entry m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	public static void commonFunct3() {
		map3 = new HashMap<Integer, String>();
		mapsi4 = new HashMap<String, Integer>();
		mapss5 = new HashMap<String, String>();

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();

		map3.put(1, "TestMap1");
		map3.put(3, "TestMap3");
		map3.put(4, "TestMap4");
		map3.replace(4, "TestMap4replaced");
		map3.put(4, "TestMap4replaced2");

		map3.replace(5, "TestMap4000");

		for (Map.Entry m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(map3.size()); // number of keys

		System.out.println(map3.isEmpty());
		System.out.println(mapss5.isEmpty());

		System.out.println(map3);

	}
}
