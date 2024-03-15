package com.demo.mapdemo.hashmapdemo;
//frequency type
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LogicalQues {
	static void createMap(ArrayList<String> names)
	{
		HashMap<String,Integer> hm= new HashMap<>();
		for(String n:names)
		{
		    if(hm.containsKey(n))
		    {
//		    	int count= hm.get(n);
//		    	count++;
//		    	hm.put(n, count);
		    	hm.put(n, hm.get(n)+1);
		    }
		    else
		    {
		    	hm.put(n,1);
		    }
		}
		
		for(Map.Entry<String, Integer> en: hm.entrySet())   
		{
			System.out.println(en.getKey()+":"+en.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<>();
		al.add("Pravin");
		al.add("Rushikesh");
		al.add("Rushikesh");
		al.add("Mandar");
		al.add("Pravin");
		al.add("Rushikesh");
		al.add("Amruta");
		al.add("Mandar");
		al.add("Harshit");
		al.add("Rushikesh");
		
		createMap(al);
		
	}


}
