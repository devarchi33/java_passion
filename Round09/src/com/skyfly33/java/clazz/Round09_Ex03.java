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
		this(); //����Ʈ �����ڸ� ȣ������. �ߺ� �ڵ� ����.
		a = x;
		b = y;
	}
	
	public static void main(String[] args){ // �ڵ��� ���忡�� �ҳ�Ÿ�� ���� �ϴµ�, �ҳ�Ÿ1, �ҳ�Ÿ2�� ���� ���� �ƴ� �Ͱ� ���� ����.
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
