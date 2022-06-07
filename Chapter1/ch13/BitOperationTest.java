package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2 );
		System.out.println( num1 & num2 );
		System.out.println( num1 ^ num2 );
		System.out.println( ~num1 );
		
		System.out.println( num1 << 2 ); // 5*2*2 (shift한 것 만큼 2를 제곱으로 곱해준다.)
//		복합대입 연산자가 비트 연산자라 같이 쓰인다.
//		대입연산자의 우선순위가 낮아서 다른 연산들을 다 하고 마지막에 대입된다.
		System.out.println( num2 <<= 1 ); // 10*2
		
		System.out.println( num1 );
		System.out.println( num2 );
	}

}
