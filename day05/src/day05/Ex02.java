package day05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex02 {
	public static void main(String[] args) throws IOException{
		File file = new File("data.dat");
		ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream(file));
		try {
			Object o = ois.readObject();
			Info tmp = (Info)o;
			System.out.println(tmp.name);
			System.out.println(tmp.age);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ois.close();
	}
}





