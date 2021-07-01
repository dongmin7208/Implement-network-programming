package day37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
   // byte기반 입출력 (I/O...Stream)으로 파일 복사 프로그램
   /* 입력
      - 복사 할 파일 경로 및 파일명
      - 복사될 목적지 경로 및 파일명
      - 목적지 파일명이 없으면 원본 파일명으로 저장
      
    * 출력
      - 파일 복사 과정(바이트 단위로 !) 출력되도록
      - 복사 완료 후 파일 복사 성공여부 출력(예외처리 필요시 추가)
    */
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      FileInputStream input = null;
       FileOutputStream output = null;
       
       // 복사할 파일
       System.out.println("복사할 파일의 입력하세여");
       String str = sc.nextLine(); 
       File file = new File(str);
       try {
          input = new FileInputStream(file);
         // 복사 파일
          System.out.println("복사 파일의 경로를 입력하세여");
          String strCopy = sc.nextLine();
          
          File fileCopy = new File(strCopy);
          
         output = new FileOutputStream(fileCopy);
         
         int readBuffer = 0;
           byte [] buffer = new byte[10];
           try {
            while((readBuffer = input.read(buffer)) != -1) {
               output.write(buffer, 0, readBuffer);
               for (int i = 0 ; i < buffer.length ; i++) {
                  System.out.print("!");
                  if (i % 100 == 0)   System.out.println();
                  System.out.print(i+"개");
               }
            }
         } catch (IOException e) {
            e.printStackTrace();
         }

      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } finally {
            try{
                input.close();
                output.close();
            } catch(IOException e) {}
        }
   }
}