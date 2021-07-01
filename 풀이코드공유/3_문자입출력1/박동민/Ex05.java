package day38;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex05 {
	  public static void main(String[] args) throws IOException {
		  Scanner sc = new Scanner(System.in);
		  
		  OutputStreamWriter osw =null;
		  BufferedReader br = null;
		  int cnt = 0;
		  
		  System.out.println("1.입력 2.출력");
		  int menu = sc.nextInt();
		  switch (menu) {
		case 1:
			osw = new OutputStreamWriter(new FileOutputStream("data.txt"));
			br = new BufferedReader(new InputStreamReader(new FileInputStream(FileDescriptor.in)),512);
			char[] text = new char[512];
			
			int readSize = 0;
			while(true) {
				if((readSize = br.read(text)) == -1)break;
				if(readSize ==2) cnt++;
				if(readSize != 2)cnt =0;
				if(cnt ==2) break;
				for(int i = 0;  i <readSize; i++)
							osw.write(text[i]);
					osw.flush();
			}
				osw.close();
				br.close();
				break;
		case 2:
			br = new BufferedReader(new InputStreamReader(new FileInputStream("data.txt")), 512);
			text = new char[512];
			
			readSize = 0;
			while(true) {
				if((readSize = br.read(text)) == -1) break;
				for(int i=0; i<readSize; i++)
					System.out.print(text[i]);
			}
			br.close();
			break;			
		}
	}
}