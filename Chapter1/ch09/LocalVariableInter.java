package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
//		str = 3; string으로 추론되었는데 int를 대입하면 오류가 난다.
	}

}
