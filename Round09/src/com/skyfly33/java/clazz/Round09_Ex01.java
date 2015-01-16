package com.skyfly33.java.clazz;

import java.io.Serializable;

public class Round09_Ex01 extends Object implements Serializable {

	private int[] sub;
	private float avg;

	public Round09_Ex01() {
		sub = new int[4];
		avg = 0.0f;
	}

	public void calc() {
		int tot = 0;
		for (int a = 0; a < sub.length; a++) {
			tot += sub[a];
		}
		avg = tot / sub.length;
	}

	public static class Round09_01_Inner {
		private String[] subName = { "국어", "영어", "수학" };

		public String getSubName(int x) {
			return subName[x];
		}
	}
}
