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
		/*버퍼에 담긴 데이터는 버퍼가 넘치거나 직접 flush() 하면 비워짐)*/
		for(int i = 0; i < 11; i++) {
			bos1.write(65);
		}
		bos1.flush();
		bos1.close(); //스트림을 닫는다.(자동 플러시)

		FileOutputStream fos2 = 
				new FileOutputStream("test.txt");
		BufferedOutputStream bos2 = 
				new BufferedOutputStream(fos2, 10);
		/*버퍼에 담긴 데이터는 버퍼가 넘치거나 직접 flush() 하면 비워짐)*/
		for(int i = 0; i < 11; i++) {
			bos2.write(65);
		}
		bos2.close();
	}
}
