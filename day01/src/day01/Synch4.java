package day01;

public class Synch4 implements Runnable {
	int val = 1000;

	private synchronized void proc() {
		while (true) {
			if (val - 300 >= 0) {
				System.out.println(Thread.currentThread().getName() + "현재 값:" + val);
				val -= 300;
				System.out.println(Thread.currentThread().getName() + "남은 값:" + val);
			} else {
				System.out.println(Thread.currentThread().getName() + "값 부족!:" + val);
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
