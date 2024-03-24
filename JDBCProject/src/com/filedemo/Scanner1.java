package com.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("f://Dp10/java_program/fileHandling.txt");
		//try-with-resource(ARM)
		try(Scanner sc=new Scanner(f)){
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
	
	}

}
