package day02;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos1 = 
				new FileOutputStream(FileDescriptor.out);
		BufferedOutputStream bos1 = 
				new BufferedOutputStream(fos1, 10);
		/*���ۿ� ��� �����ʹ� ���۰� ��ġ�ų� ���� flush() �ϸ� �����)*/
		for(int i = 0; i < 11; i++) {
			bos1.write(65);
		}
		bos1.flush();
		bos1.close(); //��Ʈ���� �ݴ´�.(�ڵ� �÷���)

		FileOutputStream fos2 = 
				new FileOutputStream("test.txt");
		BufferedOutputStream bos2 = 
				new BufferedOutputStream(fos2, 10);
		/*���ۿ� ��� �����ʹ� ���۰� ��ġ�ų� ���� flush() �ϸ� �����)*/
		for(int i = 0; i < 11; i++) {
			bos2.write(65);
		}
		bos2.close();
	}
}
