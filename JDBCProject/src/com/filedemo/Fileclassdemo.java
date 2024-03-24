package com.filedemo;

import java.io.File;
import java.io.IOException;

public class Fileclassdemo {

	public static void main(String[] args) throws IOException {
		File f=new File("f://DP10/First.txt");
//		boolean b=f.createNewFile();
//		if(b) {
//			System.out.println("new file created");
//		}
		System.out.println(f.canRead());
		System.out.println(f.canExecute());
		f.setWritable(false);
		System.out.println(f.canWrite());
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		
		File f1=new File("f://DP10/Java_Program");
		
		//list gives file type if any file exists
		String arr[]=f1.list();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
