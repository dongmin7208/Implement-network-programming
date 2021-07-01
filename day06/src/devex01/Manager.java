package devex01;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Info> lists = new ArrayList<Info>();
	
	public void insertInfo(Info info) {
		lists.add(info);
	}
	
	public void setLists(ArrayList<Info> lists) {
		this.lists = lists;
	}
	
	public ArrayList<Info> getLists(){
		return lists;
	}
	
	public void printAll() {
		for(int i = 0; i < lists.size(); i++) {
			System.out.println(i+1 + " : " + lists.get(i));
		}
	}
}
