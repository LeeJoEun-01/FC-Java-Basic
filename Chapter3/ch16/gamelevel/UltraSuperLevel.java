package ch16.gamelevel;

public class UltraSuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주아주 높이 jump 뜁니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("트리플 turn 합니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 초고급자 레벨입니다. ******");
	}
	
}
