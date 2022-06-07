package ch15;

public class BookShelf extends Shelf implements Queue{
// 자기보다 조금 더 일반적인 클래스에서 상속을 받고, 자기가 구현해야 할 기능이 선언되어 있는 인터페이스 
	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

	
}
