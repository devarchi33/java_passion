package com.skyfly33.java.io;

import java.io.File;

public class Round16_Ex01 {

	public static void main(String[] args) {
		File file = new File("D:\\practice");
		if (file.exists())
			file.delete();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ω√¡°");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (!file.exists())
			file.mkdir();
	}
}
