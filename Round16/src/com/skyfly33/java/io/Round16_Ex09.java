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
						//���Ͽ� ���´�.
				new FileWriter(
				new File(
				new File("D:\\practice\\io"),
				"ldh.txt"))));
		PrintWriter out1 = new PrintWriter(
				new BufferedWriter(
						//ȭ�鿡 �Ѹ���.
				new OutputStreamWriter(
				System.out)));
		out.println("���Ͽ� ���´�");
		out1.println("ȭ�鿡 �Ѹ���.");
		out.close();
		out1.close();
	}
}
