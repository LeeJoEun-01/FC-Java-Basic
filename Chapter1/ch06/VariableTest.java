package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
//		bnum이 -128은 가능하지만 +128은 범위의 숫자가 아님으로 오류가 난다.
		byte bnum = -128;
		
		System.out.println(bnum);
		
//		int num = 12345678900;
		long lNum = 12345678900L;
		System.out.println(lNum);
	}

}
