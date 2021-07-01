package ex01;

import java.io.File;
import java.sql.Date;
import java.util.Scanner;

//File 클래스는 파일(정보)을 추상적인 객체로 관리 
public class Ex03 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		File dir = new File(".");
		String ac=null;
		
		
		ac =sc.nextLine();
		File f1 = new File(ac);
		if(f1.isFile()){
			boolean bo1 = f1.canExecute();
			System.out.println("파일 크기는? = " + f1.length()+ "bytes");
			System.out.println("마지막 수정은 ? = " + new Date(f1.lastModified()));
			System.out.println("실행 파일 이니?= " + bo1);
			System.out.println("파일이냐?"+f1.isFile());
			System.out.println("숨긴 파일이냐?  = " + f1.isHidden());
			System.out.println("읽기전용이냐? " + f1.canRead());
			System.out.println("파일 명은? = " + f1.getName());

		}
		else if(f1.isDirectory()){
			
			String[] s = f1.list();			
			int num =0; int num1=0;
			for(int i = 0; i< s.length; ++i) {
				File tmp = new File(f1.getAbsolutePath()+"\\"+s[i]);
				if(tmp.isDirectory()) {
					System.out.println(s[i] + "(디렉터리)");num++;
				}
				else {System.out.println(s[i] + "(파일)");num1++;}
				
			}
			System.out.println("디렉터리 : "+ num + " 파일 : " + num1);

			}
			else {System.out.println("지정한 파일이 없음");}
		
	}
}