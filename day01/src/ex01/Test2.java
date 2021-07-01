package ex01;


public class Test2 {
	public static void main(String[] args) throws Exception{
		System.out.println(Data.text.length());
		long start = 0;
		long end = 0;
		Uppercase proc1 = new Uppercase(0, 18425);
		Uppercase proc2 = new Uppercase(18425, 36850);
		Uppercase proc3 = new Uppercase(36850, 55275);
		Uppercase proc4 = new Uppercase(55275, 73700);
		Uppercase proc5 = new Uppercase(73700, 92125);
		Thread th1 = new Thread(proc1);
		Thread th2 = new Thread(proc2);
		Thread th3 = new Thread(proc3);
		Thread th4 = new Thread(proc4);
		Thread th5 = new Thread(proc5);
		System.out.println("start");
		start = System.currentTimeMillis();
		System.out.println(start);
		th1.start();
		th1.join();
		th2.start();
		th2.join();
		th3.start();
		th3.join();
		th4.start();
		th4.join();
		th5.start();
		th5.join();
		end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("end");
		System.out.println(Data.text.toString());
		System.out.println("소요시간:" + (end-start));
	}
}
