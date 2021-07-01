package day05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 객체 입출력
 * 	직렬화가 가능한 클래스로 만들어진 객체만 전송 가능
 *  직렬화 방법은 해당 클래스에 implements Serializable을 선언!
 */
public class Ex01 {
	public static void main(String[] args) throws IOException{
		Info ob1 = new Info("a", 20);
		Info ob2 = new Info("b", 22);
		Info ob3 = new Info("c", 33);
		File file = new File("data.dat");
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new FileOutputStream(file));
		oos.writeObject(ob1);
		oos.writeObject(ob2);
		oos.writeObject(ob3);
		//oos.writeObject(new String("안녕하세요"));
		oos.close();
	}
}






