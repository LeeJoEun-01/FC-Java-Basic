package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
//		reflection 프로그래밍 

//		동적으로 클래스를 로딩할 수 있다.
		Class c = Class.forName("java.lang.String");
		
		Constructor[] cons = c.getConstructors();
//	java.lang.String의 생성자 출력		
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		Method[] m = c.getMethods();
		
		for(Method mth : m) {
			System.out.println(mth);
		}
	}

}
