package day03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Quiz2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("이름:");
		String name = in.nextLine();
		System.out.print("나이:");
		int age = Integer.parseInt(in.nextLine());
		System.out.print("주소:");
		String address = in.nextLine();
		
		File f = new File("myinfo.txt");
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(
					new FileOutputStream(f));
			dos.writeUTF("이름: " + name + "\r\n");
			dos.writeUTF("나이: ");
			dos.writeInt(age);
			dos.write(13);
			dos.write(10);
			dos.writeUTF("주소: ");
			dos.writeUTF("\r\n");
			dos.writeUTF(address);
			System.out.println(f.getName() + "파일에 저장되었습니다.");
		}catch(IOException e) {}
		finally {
			if(dos != null) {
				try {
					dos.close();
				}catch(IOException e) {}
			}
		}
	}
}
