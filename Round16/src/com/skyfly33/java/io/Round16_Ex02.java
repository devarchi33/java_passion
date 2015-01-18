package com.skyfly33.java.io;

import java.io.File;
import java.io.IOException;

public class Round16_Ex02 {

	public static void main(String[] args) {
		File file = new File("d:\\practice\\io");
		if (!file.exists())
			file.mkdir();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		File file2 = new File(file, "abc.txt");
		if(file2.exists()) file2.delete();
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {

			}
			if (file2.canWrite())
				file2.setReadOnly();
		}

	}
}
