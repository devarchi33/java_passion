package com.skyfly33.java.thread;

public class Round15_Ex04 {

	public static void main(String[] args) {
		A4 ap = new A4();
		Thread bp = new Thread(new B4());
		
		ap.setPriority(10);
		bp.setPriority(8);
		
		ap.start();
		bp.start();
	}
}
