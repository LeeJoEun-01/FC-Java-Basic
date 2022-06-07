package ch08;

public class OrderInfo {
	
	public String orderID;
	public int smartPhoneNumber;
	public String address;
	public int orderDate;
	public int orderClock;
	public int price;
	public int orderNumber;
	
	public String showOrderInfo() {
		return (
			"주문 접수 번호 :"+ orderID
		   +"\n주문 핸드폰 번호 :"+ smartPhoneNumber
		   +"\n주문 집 주소 :"+ address
		   +"\n주문 날짜 :"+ orderDate
		   +"\n주문 시간 :"+ orderClock
		   +"\n주문 가격 :"+ price
		   +"\n메뉴 번호 :"+ orderNumber
				);
	}
	

}
