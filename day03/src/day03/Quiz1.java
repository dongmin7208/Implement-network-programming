package day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Quiz1 {
	private File srcFile;
	private BufferedInputStream bfis;
	
	private File dstFile;
	private BufferedOutputStream bfos;
	
	public Quiz1(String src, String dst){
		try{
			srcFile = new File(src);
			bfis = new BufferedInputStream(
					new FileInputStream(srcFile), 1024);
			dstFile = new File(dst);
			bfos = new BufferedOutputStream(
					new FileOutputStream(dstFile), 1024);
		}catch(FileNotFoundException e){
			System.out.println(e.toString() + " Error : " + e.getMessage());
			System.out.println("File�� ã�� �� �����ϴ�.");
		}
	}
	
	public void fileCopy(){
		long byteCount = 0;
		 byte[] buffer = new byte[1024];
		 try{
			 while(true){ 
				 int readCount = bfis.read(buffer);
				 if(readCount == -1) break;
				 bfos.write(buffer, 0, readCount);
				 byteCount += readCount;
				 for(int i = 0; i < readCount; i++) 
					 System.out.print('!');
				 bfos.flush();
			 }
		 }catch(IOException e){
			 System.out.println(e.toString() + " Error!!");
		 }finally {
			 try {
				 bfos.close();
				 bfis.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		 }
		 System.out.println("\n���簡 �Ϸ�Ǿ����ϴ�.");
		 System.out.println("����� �뷮 : " + byteCount + "byte");
	}
	
	public static void main(String[] args) {
		//����� ���� ��� ��
//		if(args.length != 2){
//			System.out.println("usage : fc <���� ���ϸ�> <���纻 ���ϸ�>");
//			System.exit(0);
//		}
//		Quiz1 fcm = new Quiz1(args[0], args[1]);
//		fcm.fileCopy();
				
		//�⺻ ����� ���
		Scanner in = new Scanner(System.in);
		System.out.println("������ ���� ���� : ");
		String src = in.nextLine();
		System.out.println("������ ���� : ");
		String dst = in.nextLine();		
		Quiz1 fcm = new Quiz1(src, dst);
		fcm.fileCopy();
		
	}
}
