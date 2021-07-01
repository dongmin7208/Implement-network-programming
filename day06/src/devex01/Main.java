package devex01;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		File file = new File("data.dat");
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		Manager manager = new Manager();
		
		if(file.exists()) {
			try {
				ois = new ObjectInputStream(new FileInputStream(file));
				ArrayList<Info> lists = (ArrayList<Info>)ois.readObject();
				manager.setLists(lists);
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
		
		Info tmp = null;
		String name = "";
		int age = 0;
		
		while(true) {
			System.out.println("1.���  2.���  6.���Ͽ� ����  0.����");
			int sel = Integer.parseInt(in.nextLine());
			
			switch(sel) {
			case 1:
				System.out.print("�̸� �Է�: ");
				name = in.nextLine();
				System.out.print("���� �Է�: ");
				age = Integer.parseInt(in.nextLine());
				tmp = new Info(name, age);
				manager.insertInfo(tmp);
				System.out.println("��� �Ϸ�");
				break;
			case 2:
				System.out.println("==================");
				manager.printAll();
				System.out.println("==================");
				break;
			case 6:
				try {
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(manager.getLists());
					System.out.println("���Ͽ� ���� �Ϸ�!");
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if(oos != null) {
						try { oos.close(); } catch (IOException e) { e.printStackTrace(); }
					}
				}
			case 0:
				System.out.println("���α׷� ����");
				try {
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(manager.getLists());
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
