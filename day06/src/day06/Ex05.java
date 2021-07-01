package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//서버역할
public class Ex05 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		try {
			ss = new ServerSocket(55555);
			System.out.println("포트 열림. Listening");
			soc = ss.accept(); //접속을 대기해라.
			System.out.println(soc.toString());
			BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(
									soc.getInputStream()));
			String readLine = br.readLine();
			System.out.println("받은 문자열:" + readLine);
			br.close();
			soc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
