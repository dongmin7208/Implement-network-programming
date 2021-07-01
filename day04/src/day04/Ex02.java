package day04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//2바이트 기반 입출력
//Writer (문자단위 출력)
//Reader (문자단위 입력)
public class Ex02 {
	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileOutputStream fos = 
				new FileOutputStream(file);
		OutputStreamWriter osw = 
				new OutputStreamWriter(fos);
		BufferedWriter bw = 
				new BufferedWriter(osw, 1024);
		char[] ch = new char[] {
				'안','녕','하','세','유'
		};
		
		bw.write(ch);
		bw.newLine();
		bw.write(ch, 1, 3);
		bw.newLine();
		bw.write('가');
		
//		bw.flush();
		bw.close();//auto flush
	
	}
}







