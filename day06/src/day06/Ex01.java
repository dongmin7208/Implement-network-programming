package day06;

import java.net.InetAddress;
import java.net.UnknownHostException;

//IP, Port

public class Ex01 {
	public static void main(String[] args) {
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName("www.google.co.kr");
			System.out.println("hostName:" + ip.getHostName());
			System.out.println("hostAddress:" + ip.getHostAddress());
			System.out.println("localhost:" + ip.getLocalHost());
			
			InetAddress[] iparr = 
//					InetAddress.getAllByName("www.daum.net");
			InetAddress.getAllByName("mgr.kgitbank.co.kr");
			for(int i = 0; i < iparr.length; i++) {
				System.out.println(iparr[i]);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}





