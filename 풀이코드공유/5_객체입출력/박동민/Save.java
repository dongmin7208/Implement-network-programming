package day40;

import java.io.Serializable;
import java.util.ArrayList;

import javax.sound.midi.MidiDevice.Info;

public class Save {
	Jangbo[] jang;
	int count;
	
	public Save(Jangbo[] j) {
		
		jang = j;
	}
		
	public void setCount(int count) {
		this.count = count;
	}

	void join (String name , int age ,int kor ,int eng,int math) {
		if (count ==5 ) return;
		jang[count].setName(name);
		jang[count].setAge(age);
		jang[count].setKor(kor);
		jang[count].setEng(eng);
		jang[count].setMath(math);
		count++;
	}
	
	void search(String name) {
		for(int i=0; i<count;i++) {
			if(name.equals(jang[i].getName())) {
				System.out.println("�̸� : " + jang[i].getName());
				System.out.println("���� : " + jang[i].getAge());
				System.out.println("���� : " + jang[i].getKor());
				System.out.println("���� : " + jang[i].getEng());
				System.out.println("���� : " + jang[i].getMath());
				System.out.println("���� : " + jang[i].getSum());
				System.out.println("��� : " + jang[i].getAvg());
			}
		}
	}

	void modify (String name, String name1 ,int age,int kor,int eng,int math ) {
		for(int i=0; i<count; i++) {
			if(name.equals(jang[i].getName())) {
				jang[i].setName(name1);
				jang[i].setAge(age);
				jang[i].setKor(kor);
				jang[i].setEng(eng);
				jang[i].setMath(math);
			}
		}
	}
	
	void detlie(String name, int age ) {
		for(int i=0; i<count; i++) {
			if(name.equals(jang[i].getName()) && age == jang[i].getAge() ) {
				jang[i].detlie(name, age);
			}
		}
	}
	void view() {
		for(int i=0; i < count;i++ ) {
			System.out.printf("�̸�:%s \t ����:%d\n",jang[i].getName(),jang[i].getAge() );
			System.out.printf("���:%.2f \n",jang[i].getAvg() );
			System.out.printf("����:%d\n",jang[i].getSum() );
			System.out.println("=====================");
		}
	}

	
}
