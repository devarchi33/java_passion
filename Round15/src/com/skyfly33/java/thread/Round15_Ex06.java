package com.skyfly33.java.thread;

public class Round15_Ex06 {

	public static void main(String[] args) {
		System.out.println("Main Start!!");
		A6 mt = new A6();
		B6 ms = new B6();

		mt.setDaemon(false);
		ms.setDaemon(false);

		mt.start();
		ms.start();

		System.out.println("Main End!!");
	}
}
