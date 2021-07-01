package day01;

class MyThread03 implements Runnable {
	private int bank = 1000;

	public int getBank() {
		return bank;
	}

	// 인출 메소드
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
		int need = 600; // 인출할 금액
		int money = 0; // 인출한 금액
		String msg = null;
		try {
			if(check(need)) {
				money = drawMoney(need);
				msg = "인출성공";
			}else {
				msg = "인출실패";
			}
			System.out.println(msg + ",인출액 : " + money + " , 잔고 : " + getBank());

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