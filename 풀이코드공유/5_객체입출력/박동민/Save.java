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
				System.out.println("이름 : " + jang[i].getName());
				System.out.println("나이 : " + jang[i].getAge());
				System.out.println("국어 : " + jang[i].getKor());
				System.out.println("영어 : " + jang[i].getEng());
				System.out.println("수학 : " + jang[i].getMath());
				System.out.println("총점 : " + jang[i].getSum());
				System.out.println("평균 : " + jang[i].getAvg());
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
			System.out.printf("이름:%s \t 나이:%d\n",jang[i].getName(),jang[i].getAge() );
			System.out.printf("평균:%.2f \n",jang[i].getAvg() );
			System.out.printf("총점:%d\n",jang[i].getSum() );
			System.out.println("=====================");
		}
	}

	
}
