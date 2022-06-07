package ch15;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
//	생성자가 호출될 때 멤버변수를 initialized(new) 하는것이 좋다
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
