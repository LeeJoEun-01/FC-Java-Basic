package ch02;

public class VIPCustomer extends Customer {

//중복되는 변수들 => extends로 상속받음
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
//	 VIP에만 있는 변수
	double salesRatio;
	String agentID;
	
//	생성자
	public VIPCustomer() 
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	public double getSalesRatio() {
		return salesRatio;
	}

	public String getAgentID() {
		return agentID;
	}
}
