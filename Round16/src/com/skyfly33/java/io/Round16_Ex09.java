package com.skyfly33.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Round16_Ex09 {

	public static void main(String[] args) throws IOException{
		PrintWriter out = new PrintWriter(
				new BufferedWriter(
						//파일에 적는다.
				new FileWriter(
				new File(
				new File("D:\\practice\\io"),
				"ldh.txt"))));
		PrintWriter out1 = new PrintWriter(
				new BufferedWriter(
						//화면에 뿌린다.
				new OutputStreamWriter(
				System.out)));
		out.println("파일에 적는다");
		out1.println("화면에 뿌린다.");
		out.close();
		out1.close();
	}
}
