package day04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//2����Ʈ ��� �����
//Writer (���ڴ��� ���)
//Reader (���ڴ��� �Է�)
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
				'��','��','��','��','��'
		};
		
		bw.write(ch);
		bw.newLine();
		bw.write(ch, 1, 3);
		bw.newLine();
		bw.write('��');
		
//		bw.flush();
		bw.close();//auto flush
	
	}
}







