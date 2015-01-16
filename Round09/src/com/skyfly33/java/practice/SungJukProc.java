package com.skyfly33.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJukProc {

	int[] sub = new int[4];
	float avg;

	public SungJukProc() throws IOException {
		String[] str = { "국어 ", "영어 " , "수학 " };
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int a = 0; a < str.length; a++) {
			System.out.print(str[a] + " : ");
			sub[a] = Integer.parseInt(in.readLine());
			sub[str.length] += sub[a];
		}
		System.out.println();

		avg = sub[str.length] / (float) str.length;

		for (int a = 0; a < str.length; a++) {
			System.out.println(str[a] + " : " + sub[a] + "��.");
		}

		System.out.println("총점 : " + sub[3]);
		System.out.println("평균 : " + avg);

	}

	public static void main(String[] args) throws IOException {
		SungJukProc sjp = new SungJukProc();
	}

}
