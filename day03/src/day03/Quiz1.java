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
			System.out.println("File을 찾을 수 없습니다.");
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
		 System.out.println("\n복사가 완료되었습니다.");
		 System.out.println("복사된 용량 : " + byteCount + "byte");
	}
	
	public static void main(String[] args) {
		//명령행 인자 사용 시
//		if(args.length != 2){
//			System.out.println("usage : fc <원본 파일명> <복사본 파일명>");
//			System.exit(0);
//		}
//		Quiz1 fcm = new Quiz1(args[0], args[1]);
//		fcm.fileCopy();
				
		//기본 입출력 사용
		Scanner in = new Scanner(System.in);
		System.out.println("복사할 원본 파일 : ");
		String src = in.nextLine();
		System.out.println("목적지 파일 : ");
		String dst = in.nextLine();		
		Quiz1 fcm = new Quiz1(src, dst);
		fcm.fileCopy();
		
	}
}
