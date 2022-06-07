package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint =  10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo()+ price + "\n");
		
		Customer vc = new VIPCustomer(10030, "형변환");
//		인스턴스는 VIP로 만들어졌지만 type은 customer로 만들어졌다. 그래서 멤버변수에서 customer것만 사용이 가능하다. agentID 사용 불가!!!
		price = vc.calcPrice(1000); // 가상 메서드가 호출된다. (VIP 메서드 적용)
		System.out.println(vc.showCustomerInfo() + price);
		
	}

}
