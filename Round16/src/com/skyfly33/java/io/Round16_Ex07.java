package com.skyfly33.java.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Round16_Ex07 {

	public static void main(String[] args) throws IOException{
		File dir = new File("D:\\practice\\io");
		File file = new File(dir, "ldh.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(23);
		dos.writeDouble(32.123);
		dos.writeBytes("asdasdsadsa");
		
		dos.close();
	}
}
