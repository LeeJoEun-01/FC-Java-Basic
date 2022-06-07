package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2 );
		System.out.println( num1 & num2 );
		System.out.println( num1 ^ num2 );
		System.out.println( ~num1 );
		
		System.out.println( num1 << 2 ); // 5*2*2 (shift�� �� ��ŭ 2�� �������� �����ش�.)
//		���մ��� �����ڰ� ��Ʈ �����ڶ� ���� ���δ�.
//		���Կ������� �켱������ ���Ƽ� �ٸ� ������� �� �ϰ� �������� ���Եȴ�.
		System.out.println( num2 <<= 1 ); // 10*2
		
		System.out.println( num1 );
		System.out.println( num2 );
	}

}
