package com.skyfly33.java.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Round16_Ex11 {

	public static void main(String[] args) throws IOException{
		File dir = new File("D:\\practice\\io");
		File file = new File(dir, "ldh2.log");
		FileOutputStream fos = new FileOutputStream(file, true);
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
		PrintStream ps = new PrintStream(bos);
		
		System.setErr(ps);
		
		System.out.println("출력한다. 화면으로...");
		System.err.println("출력한다. 파일로...");
		
		System.err.close();
	}
}
