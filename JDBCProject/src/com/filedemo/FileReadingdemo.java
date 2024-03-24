package com.filedemo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class FileReadingdemo {
	void read(File f) throws IOException {
		FileInputStream fs = null;
		int x;

		fs = new FileInputStream(f);
		BufferedInputStream bs = new BufferedInputStream(fs);
//		while ((x = fs.read()) != -1) {
//			System.out.print((char) x);
//		}
			//System.out.println(fs.available());
			
		
		 //2nd method
		//byte ar[] = new byte[fs.available()];
		//bs.read(ar);
		//for (int i = 0; i < ar.length; i++) {
			//System.out.print((char) ar[i]);
         //}
		//3rd way
		byte arr[]=new byte[fs.available()];
		fs.read(arr, 0, 21);
		for(int i=0;i<=23;i++) {
			System.out.print((char)arr[i]);
		}
		
	}

	public static void main(String[] args) throws IOException {
		FileReadingdemo fr = new FileReadingdemo();
		File f = new File("f://DP10/Java_Program/Filehandling.txt");
		fr.read(f);
	}

}
