package com.skyfly33.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Round16_Ex06 {

	public static void main(String[] args) throws IOException,
			FileNotFoundException {
		File file = new File("D:\\practice\\io\\abc.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] by = new byte[65536];
		int count = fis.read(by);
		for (int i = 0; i < count; i++) {
			System.out.println(i + " : " + (char) by[i]);
		}
	}
}
