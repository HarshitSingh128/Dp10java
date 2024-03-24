package com.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {
	void writeFile(File f) throws IOException {
		FileOutputStream fr = new FileOutputStream(f);

		fr.write(67);
		String s = " " + "India is beautiful country";
		byte arr[] = s.getBytes();
		fr.write(arr);
		fr.write(32);
		fr.write(arr, 10, 9);

	}

	public static void main(String[] args) throws IOException {
		FileWriting fr = new FileWriting();
		File f = new File("f://DP10/Java_Program/code.txt");

		try {
			fr.writeFile(f);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
