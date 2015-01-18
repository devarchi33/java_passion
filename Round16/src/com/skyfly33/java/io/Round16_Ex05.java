package com.skyfly33.java.io;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Round16_Ex05 {

	public static void main(String[] args) {
		File file = new File("D:\\practice\\io\\abce.txt");
		try {
			//콘솔 출력
			FileOutputStream fos = new FileOutputStream(FileDescriptor.out);
			//파일 출력
			FileOutputStream fos1 = new FileOutputStream(file);
			
			byte[] data = { 66, 68, 70, 72, (byte) '!' };
			
			fos.write(data);
			fos1.write(data);
			fos.close();
			fos1.close();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 못 찾음.");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("파일 입출력 에러");
			System.exit(1);
		}
		System.out.println("실행 끝...!!");
	}
}
