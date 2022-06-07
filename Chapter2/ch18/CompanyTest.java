package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);	
//		두 결과의 주소가 같다!!
//      컴퍼니를 외부에서 생성할 수 없고 내부에서 하나 생성된 것만 제공되기 때문에 
		
//		Calendar calendar = Calendar.getInstance();
	}

}
