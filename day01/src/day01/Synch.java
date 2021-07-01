package day01;

public class Synch implements Runnable{
	int val = 1000;
	
	@Override
	public void run() {
		while(true) {
			synchronized(this) {
			if(val - 300 >= 0) {
				System.out.println(
						Thread.currentThread().getName()+"���� ��:" + val);
				val -= 300;
				System.out.println(
						Thread.currentThread().getName()+"���� ��:" + val);
			}else {
				System.out.println(
						Thread.currentThread().getName()+"�� ����!:" + val);
				break;
			}
			}//synch
		}
	}
	public static void main(String[] args) {
		Synch proc = new Synch();
		Thread th1 = new Thread(proc, "th1");
		Thread th2 = new Thread(proc, "th2");
		th1.start();
		th2.start();
	}
}
