package day06;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

//클라이언트 역할
public class Ex04 {
	public static void main(String[] args) {
		InetAddress ip = null;
		Socket soc = null;
		try {
			ip = InetAddress.getByName("127.0.0.1");//localhost
			soc = new Socket(ip, 55555);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
