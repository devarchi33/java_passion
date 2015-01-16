package com.skyfly33.java.thread;

public class Round15_Ex05 {

	public static void main(String[] args) {
		int count = Thread.activeCount();
		System.out.println("Count : " + count);

		Thread curr = Thread.currentThread();
		System.out.println("Curr : " + curr);
		System.out.println("Curr Name : " + curr.getName());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println("실행 되지 않음.");
		}

		System.out.println("Curr priority : " + curr.getPriority());
		System.out.println("Curr alive : " + curr.isAlive());
		System.out.println("Curr daemon : " + curr.isDaemon());
	}
}