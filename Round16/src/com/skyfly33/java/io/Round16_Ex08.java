package com.skyfly33.java.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Round16_Ex08 {

	public static void main(String[] args) {
		DataInputStream dis1 = null;
		try {
			dis1 = new DataInputStream(new BufferedInputStream(
					new FileInputStream(new File(new File("D:\\practice\\io"),
							"ldh.txt"))));
		} catch (FileNotFoundException e) {
		}
		int a = 0;
		double d = 0.0;
		byte[] c = null;
		try {
			a = dis1.readInt();
			d = dis1.readDouble();
			c = new byte[10];
			dis1.read(c);
			dis1.close();
		} catch (IOException ee) {
		}

		System.out.println("a : " + a);
		System.out.println("d : " + d);
		System.out.println("c : " + c);

	}
}
