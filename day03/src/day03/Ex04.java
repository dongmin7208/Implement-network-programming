package day03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		FileInputStream fis1 = null;
		BufferedInputStream bis1 = null;
		long start = 0, end = 0;
		try {
			fis1 = new FileInputStream("test.txt");
			bis1 = new BufferedInputStream(fis1, 512);
			byte[] buffer = new byte[512];
			
			start = System.currentTimeMillis();
			int readSize = 0;
			while((readSize = bis1.read(buffer)) != -1) {
				System.out.println("rs:" + readSize);
				for(int i = 0; i < readSize; i++) {
					System.out.print((char)buffer[i]);
				}
			}
			end = System.currentTimeMillis();
			System.out.println("rs:" + readSize);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bis1 != null) {
				try {
					bis1.close();
				}catch(IOException e) {}
			}
		}
		
		System.out.println("요소시간:" + (end - start));
		
	}
}
