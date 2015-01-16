package com.skyfly33.java.clazz;

public class Round09_Ex02 {

	static int a;
	static int b;
	static float c;
	
	public static void main(String[] args){
		Round09_Ex02 kor1 = null; //객체 생성.
		kor1 = new Round09_Ex02(); //인스턴스 생성.
		
		kor1.a = 100;
		kor1.b = 200;
		kor1.c = 300.0f;
		
		System.out.println("a : " + kor1.a);
		System.out.println("b : " + kor1.b);
		System.out.println("c : " + kor1.c);
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);  //Cannot make a static reference to the non-static field --> 인스턴스 변수와 스태틱 변수의 차이점.
		
	}
}
