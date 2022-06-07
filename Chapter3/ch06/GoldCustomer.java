package ch06;

public class GoldCustomer extends Customer {
	double salesRatio;

//	맨 처음 생성자 만들어 주기
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*salesRatio); 
	}
	
	
}
