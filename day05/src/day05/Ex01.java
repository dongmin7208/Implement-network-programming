package day05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ��ü �����
 * 	����ȭ�� ������ Ŭ������ ������� ��ü�� ���� ����
 *  ����ȭ ����� �ش� Ŭ������ implements Serializable�� ����!
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
		//oos.writeObject(new String("�ȳ��ϼ���"));
		oos.close();
	}
}






