package day03;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		FileInputStream fis1 = null;
		try {
			fis1 = new FileInputStream("test.txt");
			int data = fis1.read();	//�Է½�Ʈ�����κ��� 1����Ʈ�� �о� �⺻�ڷ���(int)�� ��ȯ
			System.out.println("�Է��� ��:" + (char)data);

			data = fis1.read();	
			System.out.println("�Է��� ��:" + (char)data);

			data = fis1.read();	
			System.out.println("�Է��� ��:" + data);

			data = fis1.read();	
			System.out.println("�Է��� ��:" + data);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis1 != null) {
				try {
					fis1.close();
				}catch(IOException e) {}
			}
		}
		
	}
}
