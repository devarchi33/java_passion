package com.skyfly33.java.thread;

public class Round15_Ex03 {

	public static void main(String[] args) {
		int max = Thread.MAX_PRIORITY;
		int nom = Thread.NORM_PRIORITY;
		int min = Thread.MIN_PRIORITY;
		System.out.println("최고 우선 순위 : " + max);
		System.out.println("중간 순위 : " + nom);
		System.out.println("최저 순위 : " + min);
	}
}
