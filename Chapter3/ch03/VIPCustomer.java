package ch03;

public class VIPCustomer extends Customer {
	
//	 VIP에만 있는 변수
	double salesRatio;
	String agentID;
	
//	생성자
//	public VIPCustomer() {
////		하위 클래스가 상위 클래스의 인스턴스에 참조값을 가지게 된다. => 생성자를 호출할 수 있는 기능 
////		super();  => 이 코드를 쓰지 않아도 컴파일러가 알아서 해준다.(default 생성자일 때만)
//		
//		super(0,"no-name");
//		
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() call");
//	}
	
//	상위 클래스 생성자를 이제 명시적으로 호출해야한다.
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, string) call");
	}

	public double getSalesRatio() {
		return salesRatio;
	}

	public String getAgentID() {
		return agentID;
	}
}
