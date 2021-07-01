package day03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Quiz2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�̸�:");
		String name = in.nextLine();
		System.out.print("����:");
		int age = Integer.parseInt(in.nextLine());
		System.out.print("�ּ�:");
		String address = in.nextLine();
		
		File f = new File("myinfo.txt");
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(
					new FileOutputStream(f));
			dos.writeUTF("�̸�: " + name + "\r\n");
			dos.writeUTF("����: ");
			dos.writeInt(age);
			dos.write(13);
			dos.write(10);
			dos.writeUTF("�ּ�: ");
			dos.writeUTF("\r\n");
			dos.writeUTF(address);
			System.out.println(f.getName() + "���Ͽ� ����Ǿ����ϴ�.");
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
