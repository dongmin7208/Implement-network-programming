package ex01;

public class Uppercase implements Runnable{
	int startIndex = 0;
	int endIndex = 0;
	public Uppercase(int si, int ei) {
		startIndex = si;
		endIndex = ei;
	}
	
	@Override
	public void run() {
		char[] text = Data.text.toString().toCharArray();
		for(int i = startIndex; i < endIndex; i++) {
			char ch = text[i];
			if(ch >= 'a' && ch <= 'z') {
				text[i] -= 32;
				Data.text.setCharAt(i, text[i]);
				System.out.print(text[i]);
			}
			if(ch >= 'A' && ch <= 'Z') {
				text[i] += 32;
				Data.text.setCharAt(i, text[i]);
				System.out.print(text[i]);
			}
		}
		System.out.println();
	}
}
