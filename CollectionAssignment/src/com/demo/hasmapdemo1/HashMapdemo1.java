package com.demo.hasmapdemo1;

import java.util.HashMap;

public class HashMapdemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.put(12, "Mukesh");
		hm1.put(10, "Suresh");
		hm1.put(16, "Kamlesh");
		hm1.put(17, "Suraj");
		// 2. WAP to test a HashMap is empty or not
		System.out.println(hm1.isEmpty());
		// 4. WAP to search for an element from HashMap using key
		System.out.println(hm1.containsKey(12));
		// 5. WAP to test if a HashMap contains a mapping for the specified value
		System.out.println(hm1.containsValue("Suraj"));
		// 6. WAP to remove an element from HashMap using key
		hm1.remove(17);
		System.out.println(hm1);
		//3. WAP to test if a HashMap contains a mapping for the specified key
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
        hm2.put(12, "Mukesh");
		hm2.put(11, "Sukkhu");
		hm2.put(14, "Karan");
		hm2.put(17, "Suraj");
        System.out.println(hm2.containsKey(12));

	}

}
