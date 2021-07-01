package day03;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		FileInputStream fis1 = null;
		try {
			fis1 = new FileInputStream("test.txt");
			int data = 0;
//			while(true) {
//				data = fis1.read();//�Է½�Ʈ�����κ��� 1����Ʈ�� �о� �⺻�ڷ���(int)�� ��ȯ
//				if(data == -1) { //EOF
//					break;
//				}
//				System.out.print((char)data);
//			}
			while((data = fis1.read()) != -1) {
				System.out.print((char)data);
			}
			
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
