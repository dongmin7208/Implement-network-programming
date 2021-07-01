package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//��������
class MyProcess implements Runnable{
	Socket soc = null;
	MyProcess(Socket soc){
		this.soc = soc;
	}
	@Override
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String readLine = br.readLine();
			System.out.println("���� ���ڿ�:" + readLine);
			br.close();
			soc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}


public class Ex07 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		try {
			ss = new ServerSocket(55555);
			System.out.println("��Ʈ ����. Listening");
			while(true) {
				soc = ss.accept(); //������ ����ض�.
				System.out.println(soc.toString());
				new Thread(new MyProcess(soc)).start();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
