package ch18;

public class Company {
	
//  유일한 객체 만들기
	private static Company instance = new Company();

//	생성자를 private으로 만듦으로써 외부에서 아무나 company를 생성할 수 없다.
	private Company() {}
	
//	이 메서드에 static을 넣어줘야 외부에서 클래스로 사용이 가능하기 때문에 
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
