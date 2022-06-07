package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
//		(결과)num1은 값이 바뀌어서 나오지만 i는 바뀌지 않는다.
//		그 이유는 컴퓨터가 앞의 항을 보고 false가 나왔기 때문에 결과과 이미 나왔음으로 뒤 쪽의 항을 계산하지 않았다 => 단락 회로 평가(short circuit evaluation)
		boolean value = ( (num1 = num1 + 10) < 10) && ( (i = i + 2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
