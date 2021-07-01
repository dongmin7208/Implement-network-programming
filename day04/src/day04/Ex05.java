package day04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
	private static final int EOF = -1;
	
	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileInputStream fis = 
				new FileInputStream(file);
		InputStreamReader isr = 
				new InputStreamReader(fis);
		BufferedReader br = 
				new BufferedReader(isr, 512);
		
		String data = "";
		while(true) {
			data = br.readLine();
			if(data == null) {
				break;
			}
			System.out.println(data);
		}
		
		br.close();
	}
}
