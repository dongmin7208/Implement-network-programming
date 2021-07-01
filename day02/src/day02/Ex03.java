package day02;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos1 = 
				new FileOutputStream(FileDescriptor.out);
		fos1.write(65);
		byte[] data = new byte[] {'h','e','l','l','o'};
		fos1.write(data);
		fos1.write(data, 1, 2);	
		fos1.close(); //스트림을 닫는다.
		
		File file = new File("test.txt");
		FileOutputStream fos2 = 
				new FileOutputStream(file, true);
		fos2.write(65);
		data = new byte[] {'h','e','l','l','o'};
		fos2.write(data);
		fos2.write(data, 1, 2);	
		fos2.close(); //스트림을 닫는다.
	}
}
