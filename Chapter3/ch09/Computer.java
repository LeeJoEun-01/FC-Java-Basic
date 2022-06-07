package ch09;

public abstract class Computer {

//	이 클래스에서 구현하지 못할 애들은 추상메서드로 나누고 하위 클래스에게 그 책임을 위임한다.
//	추상클래스는 상속을 위한 클래스 
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
