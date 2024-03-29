package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

//		1. 배열 만들기
		ArrayList<Customer> customerList = new ArrayList<>();
		
//		2. 객체 만들기
		Customer customerT =  new Customer(10010, "Tomas");
		Customer customerJ =  new Customer(10020, "James");
		Customer customerE =  new GoldCustomer(10030, "Edward");
		Customer customerP=  new GoldCustomer(10040, "Percy");
		Customer customerK =  new VIPCustomer(10050, "Kim");
		
//		3. 배열에 넣어주기
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
//		4. 반복문으로 출력하기
		for( Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer: customerList) {
			 
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + " 입니다.\n");
		}
	}

}
