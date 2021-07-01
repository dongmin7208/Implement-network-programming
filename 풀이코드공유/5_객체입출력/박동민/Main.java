package day40;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.sound.midi.MidiDevice.Info;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
				
		Jangbo[] ja = new Jangbo[5];
		
		File file = new File("data.txt");
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		for(int i =0; i<ja.length;i++)
			ja[i] = new Jangbo();
		
		Save save = new Save(ja);
		
		if(file.exists()) {
				try {
					ois = new ObjectInputStream(new FileInputStream(file));
					int index = 0;
				while(true) {
					Jangbo tmp = (Jangbo)ois.readObject();
					if(tmp.getName() == null)break;
					ja[index] = tmp;
					index++;
					save.setCount(index);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (EOFException e){
				System.out.println("��� ����");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(ois != null) {
					try { ois.close(); } catch (IOException e) { e.printStackTrace(); }
				}
			}
		} else {
			try {
				file.createNewFile();
			}catch(IOException e) {}
		}
		
					

		String name =null; 
		int age=0;
		int kor=0;
		int eng=0;
		int math=0;
		while(true){
		System.out.println("1.��� 2.�˻� 3.���� 4.���� 5.���Ȯ�� 6.���Ͽ�����");
		int menu = Integer.parseInt(sc.nextLine());
		
		
		switch (menu) {
		case 1: System.out.println("�̸�,����,����,����,����");
				 name =sc.nextLine();	
		 age =Integer.parseInt(sc.nextLine());
		 kor =Integer.parseInt(sc.nextLine());
		 eng =Integer.parseInt(sc.nextLine());
		 math =Integer.parseInt(sc.nextLine());
		save.join(name, age, kor, eng, math);

				break;
		
		
		case 2:System.out.println("�˻� �� �̸��Է�:");
				name =sc.nextLine();
				save.search(name);break;
		
		
		case 3:System.out.println("���� �� �̸��Է�:");
				name = sc.nextLine();
		System.out.println("���� �� �̸�,����,����,����,����");
					String name1 =sc.nextLine();
					age =Integer.parseInt(sc.nextLine());
					kor =Integer.parseInt(sc.nextLine());
					eng =Integer.parseInt(sc.nextLine());
					math =Integer.parseInt(sc.nextLine());
		save.modify(name, name1, age, kor, eng, math);break;
		
		
		case 4:System.out.println("������ �̸��� ����:");
		name=sc.nextLine();
		age =Integer.parseInt(sc.nextLine());
		save.detlie(name, age);	break;
		
		
		case 5:System.out.println("==========���=========");
		save.view();break;
		
		case 6 : 
			try {
				oos = new ObjectOutputStream(new FileOutputStream(file));
				for(int i=0; i<ja.length; i++) {
					oos.writeObject(ja[i]);
				}
				System.out.println("���Ͽ� ���� �Ϸ�!");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(oos != null) {
					try { oos.close(); } catch (IOException e) { e.printStackTrace(); }
				}
			}

		}
		}
}
}
