package ex01;

import java.io.File;
import java.sql.Date;
import java.util.Scanner;

//File Ŭ������ ����(����)�� �߻����� ��ü�� ���� 
public class Ex03 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		File dir = new File(".");
		String ac=null;
		
		
		ac =sc.nextLine();
		File f1 = new File(ac);
		if(f1.isFile()){
			boolean bo1 = f1.canExecute();
			System.out.println("���� ũ���? = " + f1.length()+ "bytes");
			System.out.println("������ ������ ? = " + new Date(f1.lastModified()));
			System.out.println("���� ���� �̴�?= " + bo1);
			System.out.println("�����̳�?"+f1.isFile());
			System.out.println("���� �����̳�?  = " + f1.isHidden());
			System.out.println("�б������̳�? " + f1.canRead());
			System.out.println("���� ����? = " + f1.getName());

		}
		else if(f1.isDirectory()){
			
			String[] s = f1.list();			
			int num =0; int num1=0;
			for(int i = 0; i< s.length; ++i) {
				File tmp = new File(f1.getAbsolutePath()+"\\"+s[i]);
				if(tmp.isDirectory()) {
					System.out.println(s[i] + "(���͸�)");num++;
				}
				else {System.out.println(s[i] + "(����)");num1++;}
				
			}
			System.out.println("���͸� : "+ num + " ���� : " + num1);

			}
			else {System.out.println("������ ������ ����");}
		
	}
}