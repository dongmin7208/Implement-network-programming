package day02;

import java.io.File;
import java.io.IOException;

//File 클래스는 파일(정보)을 추상적인 객체로 관리 
public class Ex02 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("H:\\공유폴더\\자바기반웹개발자양성과정\\4_네트워크프로그래밍구현\\work\\day02\\test1.txt");
		File f2 = new File("test2.txt"); //상대경로: 현재 프로젝트 폴더 기준
		System.out.println(f1.exists());
		File tmp = null;
		tmp = File.createTempFile("mytmp", ".lkc", new File("H:\\공유폴더\\자바기반웹개발자양성과정\\4_네트워크프로그래밍구현\\work\\day02\\"));
		tmp.deleteOnExit();//프로그램 종료 시 삭제
		if(!f1.exists()) {
			boolean creat = f1.createNewFile();	
			System.out.println("파일생성!");
		}else {
			System.out.println("파일이 존재 합니다.");
		}
		f1.delete();
		System.out.println("임시파일 생성됨");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		System.out.println("프로그램 종료");
	}
}
