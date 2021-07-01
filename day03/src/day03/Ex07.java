package day03;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		File f = new File("test.txt");
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream(f));
//			dos.writeInt(2100000000);
//			dos.writeDouble(3.14);
//			dos.writeLong(9220000000000000000L);
//			dos.writeUTF("안녕하세유");
//			dos.writeChar('가');
			int d1 = dis.readInt();
			double d2 = dis.readDouble();
			long d3 = dis.readLong();
			String d4 = dis.readUTF();
			char d5 = dis.readChar();
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(d3);
			System.out.println(d4);
			System.out.println(d5);
		}catch(IOException e) {
			
		}finally {
			if(dis != null) {
				try {
					dis.close();
				}catch(IOException e) {}
			}
		}
	}
}
