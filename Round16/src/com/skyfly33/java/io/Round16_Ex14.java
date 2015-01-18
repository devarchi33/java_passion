package com.skyfly33.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Round16_Ex14 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String jumin;
	private String tel;
	private String addr;
	private static transient BufferedReader in;
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public Round16_Ex14() throws IOException {
		System.out.print("name : ");
		name = in.readLine();
		System.out.print("jumin : ");
		jumin = in.readLine();
		System.out.print("tel : ");
		tel = in.readLine();
		System.out.print("addr : ");
		addr = in.readLine();
	}

	public void disp() {
		System.out.println(name + "\t");
		System.out.println(jumin + "\t");
		System.out.println(tel + "\t");
		System.out.println(addr + "\t");
	}
}
