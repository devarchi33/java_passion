package com.skyfly33.java.io;

import java.io.File;

public class Round16_Ex04 {

	public static void main(String[] args) {
		File file = new File(
				"D:\\개발 작업공간\\workspace-sts-3.6.2.RELEASE\\java_passion\\Round16\\src\\com\\skyfly33\\java\\io");
		File[] files = file.listFiles();
		for (int i = 0, j = 0; i < files.length; i++) {
			if (files[i].getName().endsWith(".java")) {
				System.out.println(j++ + 1 + " : " + files[i].getName());
			}
		}
	}
}
