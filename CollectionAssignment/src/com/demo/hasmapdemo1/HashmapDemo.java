package com.demo.hasmapdemo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//1.	WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it.
//Use Integer as Key and String as Value. In second HashMap add elements of String type as Key and Integer as Value.

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		h1.put(1, "Mukesh");
		h1.put(3, "Suresh");
		h1.put(2, "Komal");
		System.out.println(h1);
		System.out.println("-------------------");

		HashMap h2 = new HashMap();
		h2.put("Suresh", 1);
		h2.put("Suraj", 45);
		h2.put("Monu", 12);

		System.out.println(h2);

		System.out.println("------------------");

		// 2. WAP add elements to HashMap without using generics,
		// 0th location use String as key and Integer as value, on 1st location use
		// String as key String and Integer as value.
		HashMap h3 = new HashMap();
		h3.put("Suresh", 1);
		h3.put(3, "Kamlesh");
		System.out.println(h3);
		System.out.println("---------------------");
		// 3. WAP to add elements to a HashMap using generics with Integer as Key and
		// String as value. And 4 key-value Map.Entry
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		int count = 0;
		hm1.put(12, "Mukesh");
		hm1.put(10, "Suresh");
		hm1.put(16, "Kamlesh");
		hm1.put(17, "Suraj");
		
		
		// 5. WAP to get all the entries from a HashMap. Iterate the entries and print
		// the Key & Value values
//		4.	WAP to create a map using Wrapper class as key and value same as keys’ data type
//		WAP to count the number of key-value (size) mappings in a map.
		for (Map.Entry<Integer, String> s : hm1.entrySet()) {
			count++;
			System.out.println(s.getKey() + "->" + s.getValue());

		}
		System.out.println(" Count of Keys-value is:" + count);
		System.out.println("----------------------");
		// 6. WAP to get only the Keys from a HashMap
		Set<Integer> keys = hm1.keySet();
		for (Integer e : keys) {
			System.out.println(e);
		}
		System.out.println("----------------");
		// 7. WAP to get only the Values from a HashMap
		Collection<String> val = hm1.values();
		for (String s : val) {
			System.out.println(s);

		}

	}

}
