package day03;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		FileInputStream fis1 = null;
		long start = 0, end = 0;
		try {
			byte[] dataArr = new byte[512];
			fis1 = new FileInputStream("test.txt");
			start = System.currentTimeMillis();
			while(true) {
				int readSize = fis1.read(dataArr);	//�Է½�Ʈ�����κ��� 1����Ʈ�� �о� �⺻�ڷ���(int)�� ��ȯ
				if(readSize == -1)
					break;
				System.out.println("rs:" + readSize);
				for(int i = 0; i < readSize; i++) {
					System.out.print((char)dataArr[i]);
				}
			}
			end = System.currentTimeMillis();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis1 != null) {
				try {
					fis1.close();
				}catch(IOException e) {}
			}
		}
		System.out.println("��ҽð�:" + (end - start));
	}
}
