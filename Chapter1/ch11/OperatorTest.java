package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		// ���� 1�� ���ϰ� ����
		int gameScore = 150;
		int lastScoreF = ++gameScore; // gameScore += 1; gameScore = gameScore + 1;
		
		// ������ ���� �ϰ� 1�� ���ϱ�
		gameScore = 150;
		int lastScoreB = gameScore++; 
		
		System.out.println(lastScoreF);
		System.out.println(lastScoreB);
		System.out.println(gameScore);
	}

}
