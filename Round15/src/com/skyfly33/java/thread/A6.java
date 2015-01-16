package com.skyfly33.java.thread;

import java.util.Date;

public class A6 extends Thread {

	public void run() {
		while (true) {
			Date date = new Date();
			System.out.println("Date : " + date.toString());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
