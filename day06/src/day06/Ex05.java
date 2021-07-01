package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//��������
public class Ex05 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		try {
			ss = new ServerSocket(55555);
			System.out.println("��Ʈ ����. Listening");
			soc = ss.accept(); //������ ����ض�.
			System.out.println(soc.toString());
			BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(
									soc.getInputStream()));
			String readLine = br.readLine();
			System.out.println("���� ���ڿ�:" + readLine);
			br.close();
			soc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
