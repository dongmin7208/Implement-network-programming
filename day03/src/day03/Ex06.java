package day03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		File f = new File("test.txt");
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(f));
			dos.writeInt(2100000000);
			dos.writeDouble(3.14);
			dos.writeLong(9220000000000000000L);
			dos.writeUTF("안녕하세유");
			dos.writeChar('가');
		}catch(IOException e) {
			
		}finally {
			if(dos != null) {
				try {
					dos.close();
				}catch(IOException e) {}
			}
		}
	}
}
