package day06;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

//클라이언트 역할
public class Ex06 {
	public static void main(String[] args) {
		InetAddress ip = null;
		Socket soc = null;
		try {
			ip = InetAddress.getByName("127.0.0.1");//localhost
			soc = new Socket(ip, 55555);
			PrintWriter pw = 
					new PrintWriter(soc.getOutputStream());
			pw.println("안녕하세요~");
			pw.close();
			soc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
