package com.skyfly33.java.practice;

public class SungJuk {

	int[] sub = new int[4]; // 0:kor, 1:eng, 2:math, 3:tot
	float avg;

	public SungJuk() {
	}

	public SungJuk(int kor, int eng, int math) {
		sub[0] = kor;
		sub[1] = eng;
		sub[2] = math;
		sub[3] = kor + eng + math;
	}

	public float getAverage() {
		avg = (float) sub[3] / (sub.length - 1);
		return avg;
	}

	public static void main(String[] args) {
		SungJuk sj = new SungJuk(82, 93, 96);
		float avg = sj.getAverage();

		System.out.println("tot : " + sj.sub[3]);
		System.out.println("avg : " + avg);
	}
}
