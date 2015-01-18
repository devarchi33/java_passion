package com.skyfly33.java.io;

import java.io.File;
import java.util.Date;

public class Round16_Ex03 {

	public static void main(String[] args) {
		File file = new File("D:\\practice\\io\\abc.txt");
		if (file.exists()) {
			file.deleteOnExit();
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일 경로 : " + file.getPath());
			System.out.println("파일 경로 : " + file.getParent());
			System.out.println("파일 크기 : " + file.length() + "kb");
			Date date = new Date(file.lastModified());
			System.out.println("최종 수정일 : " + date);

		} else {
			System.out.println(file.getName() + " 라는 파일이 없습니다.");
		}
	}
}
