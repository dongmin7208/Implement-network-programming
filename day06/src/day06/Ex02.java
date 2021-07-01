package day06;

import java.io.IOException;
import java.net.ServerSocket;

/*
 * InetAddress
 * 
 * TCP
 * ServerSocket
 * Socket
 * 
 * UDP
 */
public class Ex02 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(55555);
			ss.close();
		} catch (IOException e1) {
			System.out.println(55555+"��Ʈ �����.");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} //��Ʈ�� ����
		
		for(int i = 0; i < 65536; i++) {
			try {
				ss = new ServerSocket(i); //��Ʈ�� ����
				//System.out.println(i+"��Ʈ ��� ����.");
				ss.close();
			}catch(IOException e) {
				System.out.println(i+"��Ʈ �����.");
			}
		}
	}
}










