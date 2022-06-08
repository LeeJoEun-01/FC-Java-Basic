package ch03;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java + ": " + System.identityHashCode(java));
		System.out.println(android + ": " + System.identityHashCode(android));
		
//		두 문자열을 합치고 다시 java에 할당하면 새로운 메모리를 만들고 가르킨다. => 문자열을 더 할떄마다 메모리가 커짐 => 가비지 메모리가 많아짐
//		그러니 StringBuilder 나 StringBuffer를 사용하자!
		java = java.concat(android);
		System.out.println(java + ": " + System.identityHashCode(java));
		
		System.out.println(java);
	}

}
