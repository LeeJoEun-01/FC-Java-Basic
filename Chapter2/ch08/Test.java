package ch08;

public class Test {

	public static void main(String[] args) {

//		PersonInfo
		PersonInfo personTomas = new PersonInfo(180, 78, "남성", "Tomas", 37);
		System.out.println(personTomas.showPersonInfo());
		
//		OrderInfo
		OrderInfo order1 = new OrderInfo();
		order1.orderID = "202011020003";
		order1.smartPhoneNumber = 01023450001;
		order1.address = "서울시 강남구 역삼동 111-333";
		order1.orderDate = 20201102;
		order1.orderClock = 130258;
		order1.price = 35000;
		order1.orderNumber = 0003;
		
		System.out.println("\n"+order1.showOrderInfo());
	}

}
