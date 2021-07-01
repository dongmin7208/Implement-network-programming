package day38;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
	private static final int EOF = -1;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String cos = null; 
		String dan = null;
		
		int cntLine = 0;
		int cnt = 0;
		
		ArrayList line = new ArrayList();
		
		String word = "�˻��ܾ�";
		
		System.out.println("���� ���� ���:");
		cos = sc.nextLine();
		File file = new File(cos);
		System.out.println("�˻��� �ܾ�:");
		dan = sc.nextLine();
		
		
		FileInputStream fis = 
				new FileInputStream(file);
		InputStreamReader isr = 
				new InputStreamReader(fis);
		BufferedReader br = 
				new BufferedReader(isr, 512);
		
		String data = "";
		while(true) {
			data = br.readLine();
			if(data == null) {
				break;
			}
			cntLine++;
			if(data.contains(dan)) {
				cnt++;
				line.add(cntLine);
			}

		}		
		br.close();
		
		System.out.println("ã�� �ܾ��� ���� : " + cnt);
		System.out.print("�� �ܾ��� �� ��ȣ : ");
		for(int i=0; i<line.size()-1; i++) {
			System.out.print(line.get(i) + ", ");
		}
		System.out.println(line.get(line.size()-1));
		
	}
}
