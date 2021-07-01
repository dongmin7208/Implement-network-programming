package day05;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex03 {
	public static void main(String[] args) throws IOException{
		File f = new File("data.dat");
		Info[] arr = new Info[3];
		if(!f.exists()) {
			Info o1 = new Info("홍길동", 20);		
			Info o2 = new Info("이순신", 25);
			arr = new Info[] {o1, o2};
		}else {
			ObjectInputStream ois = 
					new ObjectInputStream(new FileInputStream(f));
			try {
				int index = 0;
				while(true) {
					Info tmp = (Info)ois.readObject();
					arr[index] = tmp;
					index++;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch(EOFException e){
				
			} finally {
				ois.close();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null)
				System.out.println(arr[i].name + "," + arr[i].age);
		}
		
		
	}
}
