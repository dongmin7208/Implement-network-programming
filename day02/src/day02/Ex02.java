package day02;

import java.io.File;
import java.io.IOException;

//File Ŭ������ ����(����)�� �߻����� ��ü�� ���� 
public class Ex02 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("H:\\��������\\�ڹٱ���������ھ缺����\\4_��Ʈ��ũ���α׷��ֱ���\\work\\day02\\test1.txt");
		File f2 = new File("test2.txt"); //�����: ���� ������Ʈ ���� ����
		System.out.println(f1.exists());
		File tmp = null;
		tmp = File.createTempFile("mytmp", ".lkc", new File("H:\\��������\\�ڹٱ���������ھ缺����\\4_��Ʈ��ũ���α׷��ֱ���\\work\\day02\\"));
		tmp.deleteOnExit();//���α׷� ���� �� ����
		if(!f1.exists()) {
			boolean creat = f1.createNewFile();	
			System.out.println("���ϻ���!");
		}else {
			System.out.println("������ ���� �մϴ�.");
		}
		f1.delete();
		System.out.println("�ӽ����� ������");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		System.out.println("���α׷� ����");
	}
}
