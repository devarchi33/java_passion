package com.skyfly33.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Round16_Ex15 {

	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		File dir = new File("D:\\practice\\io");
		File file = new File(dir, "myFriend.txt");
		Vector<Object> vc = new Vector<Object>();

		if (file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(file)));
			vc = (Vector<Object>) ois.readObject();
			ois.close();
		}

		while (true) {
			System.out.print("1.친구등록 2.전체보기 3.종료 = ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();

			if (x == 1) {
				Round16_Ex14 ps = new Round16_Ex14();
				vc.add(ps);
				System.out.println("친구 1명을 등록하였습니다.");
			} else if (x == 2) {
				for (int i = 0; i < vc.size(); i++) {
					Round16_Ex14 imsi = (Round16_Ex14) vc.elementAt(i);
					imsi.disp();
				}
			} else if (x == 3) {
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(file)));
				oos.writeObject(vc);
				oos.close();
				System.exit(0);
			} else {
				System.out.println("잘못입력!!");
			}
		}
	}
}
