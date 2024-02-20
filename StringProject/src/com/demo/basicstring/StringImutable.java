package com.demo.basicstring;

public class StringImutable {
// immutable- cannot be modifies
	public static void main(String[] args) {

		String s1="java";
		//when an String object is returned then the object is created only in heap not in scp
		
		s1.concat("Programs");//here a new String is created javaPrograms
		System.out.println(s1);
      String s2="java";
      s2=s2.concat("Programs");//here object is created in heap which is then sorted in scp
      System.out.println(s2);
      System.out.println(s2.hashCode());
      
      String s3="javaPrograms";
      System.out.println(s3.hashCode());
      System.out.println("----------------------");
	
	}

}
