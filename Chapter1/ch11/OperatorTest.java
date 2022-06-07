package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		// 먼저 1을 더하고 대입
		int gameScore = 150;
		int lastScoreF = ++gameScore; // gameScore += 1; gameScore = gameScore + 1;
		
		// 대입을 먼저 하고 1을 더하기
		gameScore = 150;
		int lastScoreB = gameScore++; 
		
		System.out.println(lastScoreF);
		System.out.println(lastScoreB);
		System.out.println(gameScore);
	}

}
