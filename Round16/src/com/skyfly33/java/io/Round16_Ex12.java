package com.skyfly33.java.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Round16_Ex12 {

	public static void main(String[] args) throws IOException {
		Round16_Ex12_Sub ap = new Round16_Ex12_Sub();
		ap.x = 100;
		ap.y = 200;

		File dir = new File("D:\\practice\\io");
		File file = new File(dir, "object.txt");

		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(ap);
		oos.close();
	}
}
