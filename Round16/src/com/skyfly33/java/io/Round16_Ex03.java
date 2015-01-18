package com.skyfly33.java.io;

import java.io.File;
import java.util.Date;

public class Round16_Ex03 {

	public static void main(String[] args) {
		File file = new File("D:\\practice\\io\\abc.txt");
		if (file.exists()) {
			file.deleteOnExit();
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("���� ��� : " + file.getPath());
			System.out.println("���� ��� : " + file.getParent());
			System.out.println("���� ũ�� : " + file.length() + "kb");
			Date date = new Date(file.lastModified());
			System.out.println("���� ������ : " + date);

		} else {
			System.out.println(file.getName() + " ��� ������ �����ϴ�.");
		}
	}
}
