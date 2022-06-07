package ch14;

public class Texi {

	int money;
	String texiCompany;
	
	public Texi(String texiCompany) {
		this.texiCompany = texiCompany;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTexiInfo() {
		System.out.println(texiCompany +"의 수입은 " + money +"원 입니다.");
	}
}
