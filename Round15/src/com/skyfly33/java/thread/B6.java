package com.skyfly33.java.thread;

public class B6 extends Thread{

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
