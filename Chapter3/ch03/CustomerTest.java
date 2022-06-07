package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010,"이순신");
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint =  10000;
		System.out.println(customerKim.showCustomerInfo()+"\n");
		
		Customer vc = new VIPCustomer(10030, "형변환");
//		인스턴스는 VIP로 만들어졌지만 type은 customer로 만들어졌다. 그래서 멤버변수에서 customer것만 사용이 가능하다. agentID 사용 불가!!!
		System.out.println(vc.showCustomerInfo());
		
	}

}
