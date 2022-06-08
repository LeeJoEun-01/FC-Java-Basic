
package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java + ": " + System.identityHashCode(java));
		System.out.println(android + ": " + System.identityHashCode(android));
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(buffer + ": " + System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(buffer + ": " + System.identityHashCode(buffer));
		
		String test = buffer.toString();
		System.out.println(test+ ": " + System.identityHashCode(test));
	}

}
