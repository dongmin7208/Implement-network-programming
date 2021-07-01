package day01;

public class Synch4 implements Runnable {
	int val = 1000;

	private synchronized void proc() {
		while (true) {
			if (val - 300 >= 0) {
				System.out.println(Thread.currentThread().getName() + "���� ��:" + val);
				val -= 300;
				System.out.println(Thread.currentThread().getName() + "���� ��:" + val);
			} else {
				System.out.println(Thread.currentThread().getName() + "�� ����!:" + val);
				break;
			}
		}
	}

	@Override
	public void run() {
		proc();
	}

	public static void main(String[] args) {
		Synch4 proc = new Synch4();
		Thread th1 = new Thread(proc, "th1");
		Thread th2 = new Thread(proc, "th2");
		th1.start();
		th2.start();
	}
}
