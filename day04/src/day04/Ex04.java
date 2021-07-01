package day04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
	private static final int EOF = -1;
	
	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileInputStream fis = 
				new FileInputStream(file);
		InputStreamReader isr = 
				new InputStreamReader(fis);
		BufferedReader br = 
				new BufferedReader(isr, 512);
		
		char[] buffer = new char[512];
		
		int readCount = 0;
		while(true) {
			readCount = br.read(buffer);
			if(readCount == Ex04.EOF) {
				break;
			}
			for(int i = 0; i < readCount; i++) {
				System.out.print((char)buffer[i]);
			}
		}
		
		br.close();
	}
}
