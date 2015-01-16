package com.skyfly33.java.clazz;

public class Round09_Ex03 {

	int a;
	double b;
	
	Round09_Ex03(){
		 a = 100;
		 b = 200.0;
	}
	
	Round09_Ex03(int x){
		a = x;
		b = 200.0;
	}
	
	Round09_Ex03(double x){
		a = 100;
		b = x;
	}
	
	Round09_Ex03(int x, double y){
		this(); //디폴트 생성자를 호출해줌. 중복 코딩 방지.
		a = x;
		b = y;
	}
	
	public static void main(String[] args){ // 자동차 공장에서 소나타를 생산 하는데, 소나타1, 소나타2가 같은 차가 아닌 것과 같은 개념.
		Round09_Ex03 kor = new Round09_Ex03();
		Round09_Ex03 kor1 = new Round09_Ex03(55);
		Round09_Ex03 kor2 = new Round09_Ex03(78.923);
		Round09_Ex03 kor3 = new Round09_Ex03(123, 45.678);
		
		System.out.println(kor.a + ", " + kor.b);
		System.out.println(kor1.a + ", " + kor1.b);
		System.out.println(kor2.a + ", " + kor2.b);
		System.out.println(kor3.a + ", " + kor3.b);
	}
}
