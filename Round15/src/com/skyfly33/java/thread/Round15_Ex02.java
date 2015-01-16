package com.skyfly33.java.thread;

public class Round15_Ex02 {

	public static void main(String[] args) {
		System.out.println("Main Thread!!");

		A2 mt = new A2();
		mt.start();

		for (int i = 1; i < 1000; i++) {
			System.out.print(i);
			if (i % 10 == 0)
				System.out.println();
			else
				System.out.print("\t");
		}

		System.out.println("\nMain Thread Destroy!!");
	}
}
