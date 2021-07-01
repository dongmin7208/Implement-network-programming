package day01;

class MyThread03 implements Runnable {
	private int bank = 1000;

	public int getBank() {
		return bank;
	}

	// ���� �޼ҵ�
	private int drawMoney(int m) {
		bank -= m;
		return m;
	}
	private synchronized boolean check(int need) {
		if (getBank() >= need) {
			return true;
		} 
		return false;
	}
	public void run() {
		int need = 600; // ������ �ݾ�
		int money = 0; // ������ �ݾ�
		String msg = null;
		try {
			if(check(need)) {
				money = drawMoney(need);
				msg = "���⼺��";
			}else {
				msg = "�������";
			}
			System.out.println(msg + ",����� : " + money + " , �ܰ� : " + getBank());

		} catch (Exception e) {
		}
	}
}

public class Synch3 {
	public static void main(String[] args) {
		MyThread03 ob = new MyThread03();
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();
	}
}