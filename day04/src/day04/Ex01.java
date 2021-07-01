package day04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//2바이트 기반 입출력
//Writer (문자단위 출력)
//Reader (문자단위 입력)
public class Ex01 {
	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileOutputStream fos = 
				new FileOutputStream(file);
		OutputStreamWriter osw = 
				new OutputStreamWriter(fos);
		osw.write('가');
		osw.append('나');
		osw.write("안녕하셔용");
		osw.flush();
		osw.close();
	}
}







