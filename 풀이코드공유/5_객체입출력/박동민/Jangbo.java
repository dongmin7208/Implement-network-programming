package day40;

import java.io.Serializable;

public class Jangbo implements Serializable  {
	private String name ;
	private int age;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		return sum;
	}
	public float getAvg() {
		return avg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
		setSum();
		setAvg();
	}
	private void setSum() {
		this.sum = kor+eng+math;   //½Ä?
	}
	private void setAvg() {
		this.avg = (kor+eng+math)/3;   //½Ä?
	}
	public void detlie (String name, int age ) {
		this.name = null; this.avg =0;
		this.sum=0;
		this.age = 0; this.math =0;
		this.kor = 0; this.eng=0; 
	}
	@Override
	public String toString() {
		return "Jangbo [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
				+ sum + ", avg=" + avg + "]";
	}
	
	
	
}
