package com.skyfly33.java.clazz;

public class Round09_Ex04 {

	// int a, b, c, d, e, f, g;
	int[] temp = new int[7];

	/*
	 * public Round09_Ex04() { a = 1;b = 2; c = 3; d = 4; e = 5; f = 6; g = 7; }
	 */

	public Round09_Ex04() {
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
	}

	Round09_Ex04(int x) {
		this();
		temp[3] = x;
	}

	Round09_Ex04(int x, int y) {
		this(x);
		temp[4] = y;
	}

	public int getA() {
		return temp[0];
	}

	public void setA(int a) {
		this.temp[0] = a;
	}

	public int getB() {
		return temp[1];
	}

	public void setB(int b) {
		this.temp[1] = b;
	}

	public int getC() {
		return temp[2];
	}

	public void setC(int c) {
		this.temp[2] = c;
	}

	public int getD() {
		return temp[3];
	}

	public void setD(int d) {
		this.temp[3] = d;
	}

	public int getE() {
		return temp[4];
	}

	public void setE(int e) {
		this.temp[4] = e;
	}

	public int getF() {
		return temp[5];
	}

	public void setF(int f) {
		this.temp[5] = f;
	}

	public int getG() {
		return temp[6];
	}

	public void setG(int g) {
		this.temp[6] = g;
	}

	public static void main(String[] args) {
		Round09_Ex04 ii = new Round09_Ex04();
		Round09_Ex04 ii1 = new Round09_Ex04(14);
		Round09_Ex04 ii2 = new Round09_Ex04(114, 115);

		/*
		 * for(char var = 'a'; var < 'h'; var++ ){ System.out.println("ii."+var
		 * + " : " + ii.var); }
		 */

		for(int a = 0; a < ii.temp.length; a++){
			System.out.print("ii."+ a + " : " +ii.temp[a] + "\t");
			System.out.print("ii1."+ a + " : " +ii1.temp[a] + "\t");
			System.out.println("ii2."+ a + " : " +ii2.temp[a] + "\t");
		}
		/*
		System.out.print("ii.a : " + ii.a + "\t");
		System.out.print("ii.b : " + ii.b + "\t");
		System.out.print("ii.c : " + ii.c + "\t");
		System.out.print("ii.d : " + ii.d + "\t");
		System.out.print("ii.e : " + ii.e + "\t");
		System.out.print("ii.f : " + ii.f + "\t");
		System.out.println("ii.g : " + ii.g);

		System.out.print("ii1.a : " + ii1.a + "\t");
		System.out.print("ii1.b : " + ii1.b + "\t");
		System.out.print("ii1.c : " + ii1.c + "\t");
		System.out.print("ii1.d : " + ii1.d + "\t");
		System.out.print("ii1.e : " + ii1.e + "\t");
		System.out.print("ii1.f : " + ii1.f + "\t");
		System.out.println("ii1.g : " + ii1.g);

		System.out.print("ii2.a : " + ii2.a + "\t");
		System.out.print("ii2.b : " + ii2.b + "\t");
		System.out.print("ii2.c : " + ii2.c + "\t");
		System.out.print("ii2.d : " + ii2.d + "\t");
		System.out.print("ii2.e : " + ii2.e + "\t");
		System.out.print("ii2.f : " + ii2.f + "\t");
		System.out.print("ii2.g : " + ii2.g);
		 */
	}
}
