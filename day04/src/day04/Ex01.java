package day04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//2����Ʈ ��� �����
//Writer (���ڴ��� ���)
//Reader (���ڴ��� �Է�)
public class Ex01 {
	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileOutputStream fos = 
				new FileOutputStream(file);
		OutputStreamWriter osw = 
				new OutputStreamWriter(fos);
		osw.write('��');
		osw.append('��');
		osw.write("�ȳ��ϼſ�");
		osw.flush();
		osw.close();
	}
}







