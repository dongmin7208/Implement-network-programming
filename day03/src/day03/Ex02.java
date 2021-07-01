package day03;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		FileInputStream fis1 = null;
		try {
			fis1 = new FileInputStream("test.txt");
			int data = fis1.read();	//입력스트림으로부터 1바이트를 읽어 기본자료형(int)로 반환
			System.out.println("입력한 값:" + (char)data);

			data = fis1.read();	
			System.out.println("입력한 값:" + (char)data);

			data = fis1.read();	
			System.out.println("입력한 값:" + data);

			data = fis1.read();	
			System.out.println("입력한 값:" + data);
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
