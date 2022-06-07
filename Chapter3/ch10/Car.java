package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void starCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
//	[디자인 메서드 패턴] 이 시나리오는 변하면 안된다! => final
	final public void run() {
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	
}
