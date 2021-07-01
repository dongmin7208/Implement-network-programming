package day03;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Quiz2_2 {
	public static void main(String[] args) {
		File f = new File("myinfo.txt");
		DataInputStream dis = null;
		String name = "";
		int age = 0;
		String address = "";
		try {
			dis = new DataInputStream(
					new FileInputStream(f));
//			dos.writeUTF("이름: " + name + "\r\n");
//			dos.writeUTF("나이: ");
//			dos.writeInt(age);
//			dos.write(13);
//			dos.write(10);
//			dos.writeUTF("주소: ");
//			dos.writeUTF("\r\n");
//			dos.writeUTF(address);
			name = dis.readUTF();
			name = name.substring(name.indexOf(":")+2, name.indexOf("\r\n"));
			dis.readUTF();
			age = dis.readInt();
			dis.read();
			dis.read();
			dis.readUTF();
			dis.readUTF();
			address = dis.readUTF();
		}catch(IOException e) {}
		finally {
			if(dis != null) {
				try {
					dis.close();
				}catch(IOException e) {}
			}
		}

		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		
		
	}
}
