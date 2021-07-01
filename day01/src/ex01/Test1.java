package ex01;


public class Test1 {
	public static void main(String[] args) throws Exception{
		long start = 0;
		long end = 0;
		Uppercase proc = new Uppercase(0, Data.text.length());
		Thread th = new Thread(proc);
		System.out.println("start");
		start = System.currentTimeMillis();
		th.start();
		th.join();
		//--------------
		end = System.currentTimeMillis();
		System.out.println("end");
		System.out.println(Data.text.toString());
		System.out.println("소요시간:" + (end-start));
		
	}
}
