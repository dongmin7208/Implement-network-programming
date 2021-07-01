package day04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {
	private static final int EOF = -1;
	
	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileInputStream fis = 
				new FileInputStream(file);
		InputStreamReader isr = 
				new InputStreamReader(fis);
		int data = '\0';
		while(true) {
			data = isr.read();
			if(data == Ex03.EOF) {
				break;
			}
			System.out.print((char)data);
		}
		isr.close();
	}
}
