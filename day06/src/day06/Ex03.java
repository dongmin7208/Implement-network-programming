package day06;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//��������
public class Ex03 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		try {
			ss = new ServerSocket(55555);
			System.out.println("��Ʈ ����. Listening");
			soc = ss.accept(); //������ ����ض�.
			System.out.println(soc.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
