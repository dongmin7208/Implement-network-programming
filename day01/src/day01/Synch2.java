package day01;

class MyThread implements Runnable { 
	private int bank = 1000;
	public int getBank() {
		return bank;
	}
	
	 // ���� �޼ҵ�
	private int drawMoney(int m) {
		bank -= m;
		return m;
	}

	public void run() {		
		int need = 600; // ������ �ݾ� 
		int money = 0;  // ������ �ݾ�
		String msg = null;
		try {	
			synchronized(this) {
				if(getBank() >= need){
					Thread.yield(); // CPU�� �ٸ� �����忡�� �纸
					money = drawMoney(need);
					msg = "���⼺��";
				}
				else {
					msg = "�������";
				}
			}	
			System.out.println(msg+",����� : "+ money+" , �ܰ� : "+getBank() );
			 
		}catch(Exception e){
		}
	}
}

public class Synch2 {
	public static void main(String[] args) {
		MyThread ob = new MyThread();
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();
	}
}