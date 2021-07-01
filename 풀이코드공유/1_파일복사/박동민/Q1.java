package day37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
   // byte��� ����� (I/O...Stream)���� ���� ���� ���α׷�
   /* �Է�
      - ���� �� ���� ��� �� ���ϸ�
      - ����� ������ ��� �� ���ϸ�
      - ������ ���ϸ��� ������ ���� ���ϸ����� ����
      
    * ���
      - ���� ���� ����(����Ʈ ������ !) ��µǵ���
      - ���� �Ϸ� �� ���� ���� �������� ���(����ó�� �ʿ�� �߰�)
    */
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      FileInputStream input = null;
       FileOutputStream output = null;
       
       // ������ ����
       System.out.println("������ ������ �Է��ϼ���");
       String str = sc.nextLine(); 
       File file = new File(str);
       try {
          input = new FileInputStream(file);
         // ���� ����
          System.out.println("���� ������ ��θ� �Է��ϼ���");
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
                  System.out.print(i+"��");
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